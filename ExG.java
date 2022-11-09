import java.util.Scanner;

public class ExG {
    static Scanner scanner = new Scanner(System.in);

    public static int[] lerNum(int n){
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static void displayNums(int[] nums){
        for (int i = nums.length-1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        displayNums(lerNum(N));
    }
}
