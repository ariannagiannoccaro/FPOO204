//programa 1

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese Numero de horas trabajadas: ");
        int horas = scn.nextInt();
        System.out.println("Ingrese el costo por hora trabajada: ");
        int costo = scn.nextInt();

        int pagar = horas * costo;
        System.out.println("El pago es: " + pagar);
    }
}