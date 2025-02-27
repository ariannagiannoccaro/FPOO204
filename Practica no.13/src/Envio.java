import javax.swing.JOptionPane;
public class Envio {

    private int codigoEnvio;
    private String destino;
    private double peso;

    public Envio(int codigoEnvio, String destino, double peso) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
        this.peso = 0.0;
    }

    public Envio(int codigoEnvio, String destino) {
        this.codigoEnvio = codigoEnvio;
        this.destino = destino;
    }

    public static Envio crearEnvio(){
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del envio:"));
        String destino = JOptionPane.showInputDialog("Ingrese el destino");
        String answer = JOptionPane.showInputDialog("Quiere ingresar peso? (S/N)");

        if (answer.equalsIgnoreCase("S")) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso"));
            return new Envio(codigo, destino, peso);
        }else{
            return new Envio(codigo, destino);
        }
    }


 //zona g&s
    public int getCodigoEnvio() {
        return codigoEnvio;
    }

    public void setCodigoEnvio(int codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
