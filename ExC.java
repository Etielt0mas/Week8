import java.util.Scanner;

public class ExC {
    static Scanner scanner = new Scanner(System.in);

    public static int[] ArrayCreator(int N){
        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void ArrayOrder(int[] numbers, int N){
        boolean ascending = true;
        int i = 1;
        while( i < N && ascending) {

            if (numbers[i] > numbers[i - 1]){
                ascending = true;
            } else {
                ascending = false;
            }
            i++;

        }
        System.out.println("always ascending = " + ascending);
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        ArrayOrder(ArrayCreator(N), N);
    }

}

