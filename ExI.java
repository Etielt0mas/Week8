import java.util.Scanner;

public class ExI {
    static Scanner scanner = new Scanner(System.in);
    static final int ENTRADAS = 3;
    static final int PISOS = 4;

    public static String[][] nomeApar(){
        String[][] names = new String[ENTRADAS][PISOS];
        for (int i = 0; i < ENTRADAS; i++) {
            for (int j = 0; j < PISOS; j++) {
                names[i][j] = scanner.nextLine();
            }
        }
        return names;
    }

    public static void ifPerson(String[][] names){
        String name = scanner.nextLine();
        boolean over = false;
        for (int i = 0; i < ENTRADAS; i++) {
            for (int j = 0; j < PISOS; j++) {
                if (names[i][j].equals(name)){
                    over = true;
                    System.out.println("name="+name);
                    System.out.println("entrance="+i);
                    System.out.println("floor="+j);
                }
            }
        }
        if (!over){
            System.out.println("Do not live in the building");
        }
    }

    public static void main(String[] args) {
        String[][] names = nomeApar();
        ifPerson(names);
    }
}
