import javax.swing.JOptionPane;

public class Caja_popular {
    // Atributos
    private String titular;
    private int noCuenta;
    private int edad;
    private double saldo;

    // Constructor
    public Caja_popular(int noCuenta, String titular, int edad) {
        this.noCuenta = noCuenta;
        this.titular = titular;
        this.edad = edad;
        this.saldo = 500; // Saldo inicial predeterminado
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void ingresarSaldo(double monto) {
        if (monto <= 0) {
            JOptionPane.showMessageDialog(null, "El monto debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        saldo += monto;
        JOptionPane.showMessageDialog(null, "Depósito exitoso. Nuevo saldo: $" + saldo, "Depósito", JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean retirarSaldo(double monto) {
        if (monto <= 0) {
            JOptionPane.showMessageDialog(null, "No puedes retirar montos negativos o cero.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (monto > saldo) {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        saldo -= monto;
        JOptionPane.showMessageDialog(null, "Retiro exitoso. Nuevo saldo: $" + saldo, "Retiro", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    public boolean depositarSaldo(Caja_popular destino, double monto) {
        if (destino == null) {
            JOptionPane.showMessageDialog(null, "La cuenta destino no es válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (monto <= 0) {
            JOptionPane.showMessageDialog(null, "El monto a transferir debe ser mayor que 0.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (monto > saldo) {
            JOptionPane.showMessageDialog(null, "Fondos insuficientes para la transferencia.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        this.saldo -= monto;
        destino.ingresarSaldo(monto);
        JOptionPane.showMessageDialog(null, "Transferencia exitosa. Nuevo saldo: $" + saldo, "Transferencia", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    public void mostrarInformacion() {
        String info = "Número de cuenta: " + noCuenta +
                "\nTitular: " + titular +
                "\nEdad: " + edad +
                "\nSaldo actual: $" + saldo;

        JOptionPane.showMessageDialog(null, info, "Información de la cuenta", JOptionPane.INFORMATION_MESSAGE);
    }
}
