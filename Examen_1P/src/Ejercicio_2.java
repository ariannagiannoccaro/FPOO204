//Escriba un programa que pida al usuario dos palabras, y que indique cual de ellas es la más larga y por cuántas letras lo es

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabraUno = sc.nextLine();
        System.out.println("Ingrese una segunda palabra: ");
        String palabraDos = sc.nextLine();

        System.out.println("Vamos a ver cual es la palabra más larga ");
        int Uno = palabraUno.length();
        int Dos = palabraDos.length();

        if (Uno > Dos) {
            System.out.println("La primera palabra es más grande con : "+Uno+" letras");
        } else {
            System.out.println("La segunda palabra es más grande con : "+Dos+" letras");
        }
        }
    }
