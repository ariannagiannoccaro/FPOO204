import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int number = scn.nextInt();
        if (number % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

    }
}
