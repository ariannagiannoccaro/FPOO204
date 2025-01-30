import java.util.Scanner;

public class ejercicio_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la base del árbol, que sea impar y mayor a 1: ");
        int base = sc.nextInt();
        sc.close();

        if (base < 3 || base % 2 ==0) {
            System.out.println("La base debe ser un número impar y mayor a 1. ");
            return;
        }

        int altura = (base + 1) / 2;
        int fila = 1;

        while (fila <= altura) {
            int espacios = altura - fila;
            int asteriscos = (2 * fila)-1;

            int i=0;

            while (i < espacios) {
                System.out.print(" ");
                i++;
            }
            int j=0;
            while (j < asteriscos) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            fila++;
        }
    }
}
