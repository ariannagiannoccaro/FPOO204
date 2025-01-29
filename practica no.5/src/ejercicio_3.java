import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número que desea obtener la tabla de multiplicar: ");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int tabla = num * i;
            System.out.println(i + "x" + num +  "=" + tabla);
        }
    }
}
