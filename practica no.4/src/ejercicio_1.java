import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String password = "Sistemas204";

        System.out.print("Introduce la contraseña: ");
        String userInput = scn.nextLine();

        if (password.equalsIgnoreCase(userInput)) {
            System.out.println("La contraseña es correcta.");
        } else {
            System.out.println("La contraseña es incorrecta.");
        }
    }
}