import java.util.Scanner;

public class ejercicio_1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese un número entero y positivo: ");
        int num= scn.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ",");
            }
        }

    }
}