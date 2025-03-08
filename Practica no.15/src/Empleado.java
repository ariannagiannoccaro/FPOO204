import javax.swing.JOptionPane;

public class Empleado {

    protected String nombre;
    protected int tipo;
    protected double salario;


    public Empleado(String nombre, int tipo, double salario) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.salario = salario;
    }

    public void mostrarInfo(){
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nTipo: " + tipo + "\nSalario: " + salario);
    }

}




