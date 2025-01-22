
//IMPORTACIONES
//import java.util.Random;
import java.util.Scanner;


//Clase Principal (ejecuciones que yo quiera hacer)
public class Main {

    /*soy
    un
    comentario
    de varias
    lineas
     */

    //Metodo Main (van dentro de las clases)
    public static void main(String[] args) {

/*      2. cadenas con JAVA
        System.out.println("Hello, Arianna Giannoccaro!");
        String cadenas = "arianna" + "giannoccaro" + "quiñonez";

        System.out.println(cadenas);

        System.out.println(cadenas.length());

        System.out.println(cadenas.substring(2,5));
        System.out.println(cadenas.substring(2));
        System.out.println(cadenas.substring(0,5));*/

      /*  3. VARIABLES

        int x=5, x2;
        double y=1.25, y2;
        String z="204", z1;

        //Conversion de cadena a int
        x2= Integer.parseInt(z); //(Entre los numericos para cambiar los tipos de datos parseInt())

        //Conversion de double a cadena
        z1= String.valueOf(y);  //Para pasar a String debe ser valueOf()

        //Conversion de int a double
        double asd= Double.valueOf(x);

        //Conversion implicita
        int num= 12;
        double numD= num;
        System.out.println("Conversion Implicita"+numD);



        System.out.println(x2);
        System.out.println(z1);
        System.out.println(asd);

        //Creamos un objeto rdn de clase Random
        Random rdn= new Random();

        //generamos numeros y los guardamos
        int numAleatorio= rdn.nextInt();
        double numDouble= rdn.nextDouble();

        System.out.println("Aleatorio entero: "+numAleatorio);
        System.out.println("Aleatorio double: "+numDouble);*/

       /* 4. Solicitud de datos

        Scanner scn = new Scanner(System.in); //Siempre lleva ese parametro porque es entrada de informacion

        System.out.println("Introduce cualquier dato");
        String dato= scn.nextLine();

        System.out.println("Introduce cualquier entero");
        int datoentero= scn.nextInt();

        System.out.println("Introduce cualquier double");
        double datodecimal= scn.nextDouble();

        System.out.println("cualquier dato "+dato);
        System.out.println("cualquier entero "+datoentero);
        System.out.println("cualquier double "+datodecimal);*/


        //5. Boolean, operadores logicos y de comparacion

        System.out.println(10 > 9); //true
        System.out.println(10 == 9); //false
        System.out.println(10 < 9); //false
        System.out.println(10 >= 9); //true
        System.out.println(10 <= 9); //false
        System.out.println(10 != 9); //true

        int x=3;
        System.out.println(x<5 && x>10); //false
        System.out.println(x<5 || x>10); //true
        System.out.println(!(x<5 && x>10)); //true


    }


}