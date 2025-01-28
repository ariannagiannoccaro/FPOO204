import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce la edad del cliente: ");
        int age = scn.nextInt();

        if (age < 4) {
            System.out.println("Eres un niño pequeño, entras gratis");
        } else if (age <= 18) {
            System.out.println("Tu entrada cuesta $110.");
        } else {
            System.out.println("Su entrada cuesta $190.");
        }

        scn.nextLine();
    }
}
