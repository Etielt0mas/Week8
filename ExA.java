import java.util.Scanner;

public class ExA {
    static Scanner scanner = new Scanner(System.in);
    public static double[] lerNotas(int n){
        double[] notas = new double[n];
        for (int i = 0; i < n; i++) {
            notas[i] = scanner.nextDouble();
        }
        return notas;
    }

    public static double mediaCalculator(int n, double[] notas){
        double media = 0;

        for (int i = 0; i < n; i++) {
            media += notas[i];
        }

        return media/n;
    }
    public static int contarNeg(int n, double[] notas){

        int failures = 0;
        for (int i = 0; i < n; i++) {
            if (notas[i] < 10){
                failures++;
            }
        }
        return failures;

    }

    public static void display(int N, double[] notas){
        System.out.printf("average=%.1f%n", mediaCalculator(N, notas));
        System.out.println("failures="+contarNeg(N, notas));
    }

    public static void main(String[] args) {
        // Pergunta o número de alunos
        int N = scanner.nextInt();
        double[] notas = lerNotas(N);
        display(N, notas);
    }

}
