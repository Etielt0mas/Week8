import java.util.Scanner;

public class ExB {
    static Scanner scanner = new Scanner(System.in);
    static final int MAX = 10;

    public static int[] lerArray() {
        int[] numbers = new int[MAX];
        int i = 0;
        boolean negative = false;
        while (i < MAX && !negative) {
            numbers[i] = scanner.nextInt();
            if (numbers[i] < 0) {
                negative = true;
            }
            i++;
        }
        return numbers;
    }

    public static int verMin(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < MAX - 1; i++) {
            if (min > numbers[i] && numbers[i] > 0) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int vezesMin(int[] numbers, int min) {
        int ocu = 0;

        for (int i = 0; i < MAX; i++) {
            if (numbers[i] == min) {
                ocu++;
            }
        }

        return ocu;
    }
    public static void display(int min, int[] numbers){
        if (min > 0) {
            System.out.println("min=" + min);
            System.out.println("occurrences=" + vezesMin(numbers, min));
        }
    }

    public static void main(String[] args) {
        int[] numbers = lerArray();
        int min = verMin(numbers);
        display(min, numbers);
    }
}
