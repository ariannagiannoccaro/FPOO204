import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero y positivo: ");
        int num = sc.nextInt();

        for(int i = num; i >=0; i--){
            System.out.print(i + ", ");
        }
    }
}
