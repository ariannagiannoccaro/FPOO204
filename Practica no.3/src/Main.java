//programa 1

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        /*Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese Numero de horas trabajadas: ");
        int horas = scn.nextInt();
        System.out.println("Ingrese el costo por hora trabajada: ");
        int costo = scn.nextInt();

        int pagar = horas * costo;
        System.out.println("El pago es: " + pagar);*/

        //programa 2

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su apellido paterno: ");
        String aP = sc.nextLine();
        System.out.println("Ingrese su apellido Materno: ");
        String aM = sc.nextLine();

        System.out.println("Escribiré tu nombre todo en minusculas: " + nombre.toLowerCase() + aP.toLowerCase() + aM.toLowerCase());
        System.out.println("Escribiré tu nombre todo en mayusculas: " + nombre.toUpperCase() + aP.toUpperCase() + aM.toUpperCase());
        System.out.println(nombre.substring(0,1).toUpperCase()
                + aP.substring(0,1).toUpperCase() + aM.substring(0,1).toUpperCase());*/

        //programa 3

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un entero : ");
        int num = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= num; i++) {
            suma +=i;
            System.out.println("La suma de los enteros desde 1 hasta " + num + " es: " + suma);

        }*/


        //Programa 4
        /*Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu nombre ");
        String nombre = sc.nextLine();

        String nombreM = nombre.toUpperCase();
        int longitud = nombreM.length();

        System.out.println(nombreM + " tiene " + longitud + " caracteres");*/

        //Programa 5
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de payasos vendidos ");
        int numPayasos = sc.nextInt();

        System.out.println("Ingrese el número de muñecas vendidos ");
        int numMuñecas = sc.nextInt();

        int pesoPayaso = 112;
        int pesoMuñeca = 75;

        int pesoTotal = (numPayasos * pesoPayaso) + (numMuñecas * pesoMuñeca);
        System.out.println("El peso total del paquete es : " + pesoTotal + "gramos");*/

        //Programa 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine();

        StringBuilder nombreReversa = new StringBuilder(frase);
        System.out.println(nombreReversa.reverse());
    }
}

