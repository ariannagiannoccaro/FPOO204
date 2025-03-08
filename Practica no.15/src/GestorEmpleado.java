import javax.swing.JOptionPane;
import java.util.ArrayList;

public class GestorEmpleado {

    private ArrayList<Empleado> empleados;

    public GestorEmpleado() {
        empleados = new ArrayList<>();
    }

    // Método para agregar un empleado
    public void agregarEmpleado() {
        String[] tiposEmpleado = {"Conductor", "Administrativo"};
        int tipoSeleccionado = JOptionPane.showOptionDialog(
                null,
                "Seleccione el tipo de empleado:",
                "Agregar Empleado",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                tiposEmpleado,
                tiposEmpleado[0]
        );

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));

        if (tipoSeleccionado == 0) {
            String licencia = JOptionPane.showInputDialog("Ingrese la licencia del conductor:");
            empleados.add(new Conductor(nombre, tipoSeleccionado, salario, licencia));
        } else if (tipoSeleccionado == 1) {
            String licencia = JOptionPane.showInputDialog("Ingrese la licencia del administrativo:");
            String departamento = JOptionPane.showInputDialog("Ingrese el departamento del administrativo:");
            empleados.add(new Administrativo(nombre, tipoSeleccionado, salario, licencia, departamento));
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de empleado no válido.");
        }
    }

    // Método para listar todos los empleados
    public void listarEmpleados() {
        if (empleados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados.");
        } else {
            StringBuilder lista = new StringBuilder("Lista de Empleados:\n\n");
            for (Empleado empleado : empleados) {
                lista.append("Tipo: ").append(empleado.getClass().getSimpleName()).append("\n");
                lista.append("Nombre: ").append(empleado.nombre).append("\n");
                lista.append("Salario: ").append(empleado.salario).append("\n");

                if (empleado instanceof Conductor) {
                    lista.append("Licencia: ").append(((Conductor) empleado).licencia).append("\n");
                }
                if (empleado instanceof Administrativo) {
                    lista.append("Departamento: ").append(((Administrativo) empleado).departamento).append("\n");
                }

                lista.append("\n");
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }

}


