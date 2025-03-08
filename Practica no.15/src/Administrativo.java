import javax.swing.JOptionPane;

public class Administrativo extends Conductor{

    protected String departamento;

    public Administrativo(String nombre, int tipo, double salario, String licencia, String departamento) {
        super(nombre, tipo, salario, licencia);
        this.departamento = departamento;
    }

    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nTipo: " + tipo + "\nSalario: " + salario + "\nLicencia: " + licencia + "\nDepartamento: " + departamento);
    }



}