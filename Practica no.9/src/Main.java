import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int noCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su número de cuenta:"));
        String titular = JOptionPane.showInputDialog("Ingrese su nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));

        if (edad < 18) {
            JOptionPane.showMessageDialog(null, "Debes ser mayor de 18 años para abrir una cuenta.");
            return;
        }

        Caja_popular cuentaUsuario = new Caja_popular(noCuenta, titular, edad);

        Caja_popular cuenta2 = new Caja_popular(234567, "Jorge Estrada", 21);

        int opcion;
        do {
            // Mostrar menú
            opcion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menú de opciones:\n" +
                            "1. Consultar saldo\n" +
                            "2. Ingresar dinero\n" +
                            "3. Retirar dinero\n" +
                            "4. Transferir a otra cuenta\n" +
                            "5. Mostrar información\n" +
                            "6. Salir\n\n" +
                            "Ingrese una opción:"));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Saldo actual: $" + cuentaUsuario.consultarSaldo());
                    break;
                                                             
                case 2:
                    double montoIngreso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a depositar:"));
                    cuentaUsuario.ingresarSaldo(montoIngreso);
                    JOptionPane.showMessageDialog(null, "Nuevo saldo: $" + cuentaUsuario.consultarSaldo());
                    break;

                case 3:
                    double montoRetiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a retirar:"));
                    cuentaUsuario.retirarSaldo(montoRetiro);
                    JOptionPane.showMessageDialog(null, "Nuevo saldo: $" + cuentaUsuario.consultarSaldo());
                    break;

                case 4:
                    double montoTransferencia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a transferir:"));
                    cuentaUsuario.depositarSaldo(cuenta2, montoTransferencia);
                    JOptionPane.showMessageDialog(null, "Tu nuevo saldo: $" + cuentaUsuario.consultarSaldo());
                    break;

                case 5:
                    cuentaUsuario.mostrarInformacion();
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }
}