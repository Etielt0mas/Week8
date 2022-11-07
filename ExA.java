import java.util.Scanner;

public class ExA {
    static Scanner scanner = new Scanner(System.in);

    public static void mediaNotas(int n){
        double[] notas = new double[n];
        double media = 0;
        int failures = 0;
        for (int i = 0; i < n; i++) {
            notas[i] = scanner.nextDouble();
            media += notas[i];
            if (notas[i] < 10){
                failures++;
            }
        }
        media = media / n;
        System.out.printf("average=%.1f%n", media);
        System.out.println("failures="+failures);
    }

    public static void main(String[] args) {
        // Pergunta o número de alunos
        int N = scanner.nextInt();
        mediaNotas(N);
    }

}