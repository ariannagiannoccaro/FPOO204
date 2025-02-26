import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        int opcion;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Seleccione una opcion:\n" +
                            "1. Registrar Vehiculo\n" +
                            "2. Registrar Conductor\n" +
                            "3. Asignar Conductor a Vahiculo\n" +
                            "4. Registrar Envío\n" +
                            "5. Registrar Entrega\n" +
                            "6. Actualizar Estado de Entrega\n" +
                            "7. Mostrar Información\n" +
                            "8. Salir\n\n" +
                            "Ingrese una opción: "));

            switch (opcion) {
                case 1:

            }

        }while (opcion != 8);
    }
}