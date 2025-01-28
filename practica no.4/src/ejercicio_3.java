import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la edad del cliente: ");
        int age = scanner.nextInt();

        if (age < 4) {
            System.out.println("La entrada es gratuita.");
        } else if (age <= 18) {
            System.out.println("El precio de la entrada es $110.");
        } else {
            System.out.println("El precio de la entrada es $190.");
        }

        scanner.nextLine();
    }
}
