import java.util.Scanner;

public class ExD {
    static Scanner scanner = new Scanner(System.in);

    public static int[] notasArray(int N){
        int[] notas = new int[N];

        for (int i = 0; i < N; i++) {
            notas[i] = scanner.nextInt();
        }

        return notas;
    }

    public static int numNotas(int[] notas){
        int zero = 0, um = 0, dois = 0, tres = 0, quatro = 0, cinco = 0, seis = 0, sete = 0, oito = 0, nove = 0, dez = 0;
        int onze = 0, doze = 0, treze = 0, catorze = 0, quinze = 0, dezasseis = 0, dezassete = 0, dezoito = 0, dezanove = 0, vinte = 0;
        for (int i = 0; i < notas.length; i++) {
            switch (notas[i]){
                case 0 : zero++;
                case 1 : um++;
                case 2 : dois++;
                case 3 : tres++;
                case 4 : quatro++;
                case 5 : cinco++;
                case 6 : seis++;
                case 7 : sete++;
                case 8 : oito++;
                case 9 : nove++;
                case 10 : dez++;
                case 11 : onze++;
                case 12 : doze++;
                case 13 : treze++;
                case 14 : quatro++;
                case 15 : quinze++;
                case 16 : dezasseis++;
                case 17 : dezassete++;
                case 18 : dezoito++;
                case 19 : dezanove++;
                case 20 : vinte++;
            }
        }


        return zero,num;
                //dois, tres, quatro, cinco, seis, sete, oito, nove, dez, onze, doze, treze, catorze, quinze, dezasseis, dezassete, dezoito, dezanove, vinte;

    }

    public static void main(String[] args) {
        int N = scanner.nextInt();

    }
}
