import java.util.Scanner;

public class ExE {
    static Scanner scanner = new Scanner(System.in);
    static String[] names = new String[20];
    static double[] salary = new double[20];
    static int i = 0;
    public static void nameSalary() {

        names[i] = scanner.nextLine();
        salary[i] = scanner.nextDouble();
        while (!names[i].equals("end") && i < 20) {
            i++;
            scanner.nextLine();
            names[i] = scanner.nextLine();
            if (!names[i].equals("end")) {
                salary[i] = scanner.nextDouble();
            }

        }

    }

    public static double mediaSalary() {
        double media = 0;

        for (int j = 0; j < i; j++) {
            media += salary[j];
        }
        return (media / i);
    }

    public static void main(String[] args) {
        nameSalary();
        double media = mediaSalary();
        System.out.println(media);
        for (int j = 0; j < i; j++) {
            if (salary[j] < media){
                System.out.println(names[j]);
            }
        }
    }
}
