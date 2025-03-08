import javax.swing.JOptionPane;

public class Conductor extends Empleado{
    protected String licencia;

    public Conductor(String nombre, int tipo, double salario, String licencia) {
        super(nombre, tipo, salario);
        this.licencia = licencia;
    }

    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nTipo: " + tipo + "\nSalario: " + salario + "\nLicencia: " + licencia);
    }
}