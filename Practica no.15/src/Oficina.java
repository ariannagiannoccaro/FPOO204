
import javax.swing.JOptionPane;


public class Oficina {
    public static void main(String[] args) {
        // Crear un objeto Empleado

        GestorEmpleado gestor = new GestorEmpleado();

        while (true) {
            String[] opciones = {"Agregar Empleado", "Listar Empleados", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Menú de Empleados",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            switch (seleccion) {
                case 0:
                    gestor.agregarEmpleado();
                    break;
                case 1:
                    gestor.listarEmpleados();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    return; // Salir del programa
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }
}
