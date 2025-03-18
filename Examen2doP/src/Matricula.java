import javax.swing.JOptionPane;

public class Matricula {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String añoNacimiento;
    private String carrera;


    public Matricula(String nombre, String apellidoPaterno, String apellidoMaterno, String añoNacimiento, String carrera) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.añoNacimiento = añoNacimiento;
        this.carrera = carrera;
    }

    public String generarMatricula(String nombre, String apellidoPaterno, String apellidoMaterno, String añoNacimiento, String carrera) {
        java.util.Random genera = new java.util.Random();
        int numero = genera.nextInt(1000);
        String fecha = "2025";

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        apellidoPaterno = JOptionPane.showInputDialog(null, "Ingrese su apellido paterno");
        apellidoMaterno = JOptionPane.showInputDialog(null, "Ingrese su apellido materno");
        añoNacimiento = JOptionPane.showInputDialog(null, "Ingrese su año de nacimiento");
        carrera = JOptionPane.showInputDialog(null, "Ingrese su carrera");

        String matricula = "";
        matricula += nombre.substring(0,1);
        matricula += apellidoPaterno.substring(0,2);
        matricula += apellidoMaterno.substring(0,2);
        matricula += añoNacimiento.substring(2,4);
        matricula += fecha.substring(2,4);
        matricula += carrera.substring(0,3);
        matricula += numero;

        JOptionPane.showMessageDialog(null, "La matricula generada es: "+matricula.toUpperCase());

        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(String añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }


}



