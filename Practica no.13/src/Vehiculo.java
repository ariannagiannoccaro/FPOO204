import javax.swing.JOptionPane;
public class Vehiculo {

    private String placa;
    private String modelo;
    private double capacidadCarga;
    private Conductor conductor; //el primero es la clase y por eso va en mayusculas

    public Vehiculo(String placa, String modelo, double capacidadCarga, Conductor conductor) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadCarga = capacidadCarga;
        this.conductor = conductor;
    }

    public void informacion(){
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidad: " + capacidadCarga);
        if (conductor != null){
            System.out.println("Conductor: " + conductor.getNombre());
        }else {
            System.out.println("Conductor no asignado");
        }
    }

    public void asignarConductor(Conductor conductor){
        if(this.conductor == null){
        this.conductor = conductor;
        }else{
            System.out.println("No se puede asignar el conductor dos veces");
        }

    }

//ZONA GETTERS AND SETERS


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

}
