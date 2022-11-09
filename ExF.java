import java.util.Scanner;

public class ExF {
    static Scanner scanner = new Scanner(System.in);
    static final int MES = 6;

    public static double[] lerJuros(){
        double[] juros = new double[MES];
        for (int i = 0; i < MES; i++) {
            juros[i] = scanner.nextDouble();
        }
        return juros;
    }

    public static double valorInicial(){
        double valor = scanner.nextDouble();
        return valor;
    }

    public static double valorFinal(double inicial, double[] juros){
        double valorfinal = inicial;

        for (int i = 0; i < MES; i++) {
            valorfinal = valorfinal * (1+juros[i]);
        }

        return valorfinal;
    }
    public static void main(String[] args) {
        double[] juros = lerJuros();
        double valorInicial = valorInicial();
        System.out.printf("final value=%.2f%n",valorFinal(valorInicial, juros));

    }
}
