import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un texto: ");
        String text = scanner.nextLine();

        String reversedText = new StringBuilder(text).reverse().toString();

        if (text.equalsIgnoreCase(reversedText)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }

    }
}
