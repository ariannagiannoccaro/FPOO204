import javax.swing.JOptionPane;
public class Entrega {


    private int numeroGuia;
    private String estado;

    public Entrega(int numeroGuia) {
        this.numeroGuia = numeroGuia;
        this.estado = "Pendiente";
    }

    public void actualizarEstado() {
        String nuevoEstado = JOptionPane.showInputDialog("Ingrese el nuevo estado (En tránsito / Entregado):");


        if (nuevoEstado.equalsIgnoreCase("En tránsito") || nuevoEstado.equalsIgnoreCase("Entregado")) {
            this.estado = nuevoEstado;
            JOptionPane.showMessageDialog(null, "Estado Actualizado Correctamente a "+ this.estado);
        }else {
            JOptionPane.showMessageDialog(null, "El estado no es correcto. Unicamente se acepta 'En tránsito' o 'Entregado'. ");
        }
    }

    //zona g&s

    public int getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(int numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
