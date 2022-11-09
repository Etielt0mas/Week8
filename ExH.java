import java.util.Scanner;

public class ExH {
    static Scanner scanner = new Scanner(System.in);

    public static int[] lerArray(int n) {
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        scanner.nextLine();
        return numeros;
    }

    public static int[] right(int[] num) {
        int[] new_num = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            // 012345
            if (i == 0) {
                new_num[i] = num[num.length-1];
            } else {
                new_num[i] = num[i - 1];
            }
        }
        return new_num;
    }

    public static int[] left(int[] num) {

        int[] new_num = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            if (i == num.length-1) {
                new_num[i] = num[0];
            } else {
                new_num[i] = num[i + 1];
            }
        }
        return new_num;
    }


    public static void main(String[] args) {
        int N = scanner.nextInt();
        int[] num = lerArray(N);
        int[] new_array = new int[N];
        String op = scanner.nextLine();
        for (int i = 0; i < N; i++) {
            new_array[i] = num[i];
        }
        while (!op.equals("exit")) {
            if (op.equals("left")){
                new_array = left(new_array);
                for (int i = 0; i < N; i++) {
                    System.out.print("["+new_array[i]+"]");
                }
                System.out.println();
            } else if (op.equals("right")){
                new_array = right(new_array);
                for (int i = 0; i < N; i++) {
                    System.out.print("["+new_array[i]+"]");
                }
                System.out.println();
            }

            op = scanner.nextLine();
        }
    }
}
