import java.util.Scanner;

public class ExE {
    static Scanner scanner = new Scanner(System.in);

    static int PEOPLE = 20;

    public static int nameSalary(String[] names, double[] salary) {
        int i = 0;
        names[i] = scanner.nextLine();
        salary[i] = scanner.nextDouble();
        while (!names[i].equals("end") && i < PEOPLE) {
            i++;
            scanner.nextLine();
            names[i] = scanner.nextLine();
            if (!names[i].equals("end")) {
                salary[i] = scanner.nextDouble();
            }
        }
        return i;
    }

    public static double mediaSalary(int i, double[] salary) {
        double media = 0;

        for (int j = 0; j < i; j++) {
            media += salary[j];
        }
        return (media / i);
    }

    public static void display(String[] names, double[] salary, double media, int i){
        System.out.println(media);
        for (int j = 0; j < i; j++) {
            if (salary[j] < media){
                System.out.println(names[j]);
            }
        }
    }

    public static void main(String[] args) {
        String[] names = new String[PEOPLE];
        double[] salary = new double[PEOPLE];
        int i = nameSalary(names, salary);
        double media = mediaSalary(i, salary);
        display(names, salary, media, i);
    }
}
