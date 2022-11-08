import java.util.Scanner;

public class ExD {
    static Scanner scanner = new Scanner(System.in);
    public static int[] lerNota(int n){
        int[] notas = new int[n];

        for (int i = 0; i < n; i++) {
            notas[i] = scanner.nextInt();
        }
        return notas;
    }

    public static void displayNotas(int n, int[] notas){
        for (int i = 0; i <= 20; i++) {

            System.out.println(i+" "+freqNota(i, notas, n));
        }

    }

    public static int freqNota(int valor, int[] notas, int n){
        int qt = 0;
        for (int i = 0; i < n; i++) {
            if (valor == notas[i]){
                qt++;
            }
        }
        return qt;
    }
    public static void main(String[] args) {
        int N = scanner.nextInt();
        displayNotas(N, lerNota(N));
    }
}
