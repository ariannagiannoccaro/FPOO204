import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String[] opciones = {"Arabigo (1,2,3..)", "Romano(I,II,...)", "Salir"};
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Elige una opcion:",
                    "Convertir números Arabigos y Romanos :)",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            if (seleccion == 2 || seleccion == JOptionPane.CLOSED_OPTION) {
                continuar = false;
                continue;
            }

            try {
                if (seleccion == 0) {
                    String input = JOptionPane.showInputDialog("Ingresa un numero arabigo del 1 al 50:");
                    int valorArabigo = Integer.parseInt(input);
                    if (valorArabigo < 1 || valorArabigo > 50) {
                        JOptionPane.showMessageDialog(null, "Debes ingresar un numero entre 1 y 50.");
                        continue;
                    }
                    String resultadoRomano = Convertidor.arabigoaRomano(valorArabigo);
                    JOptionPane.showMessageDialog(null, "Equivalente en romano: " + resultadoRomano);
                } else if (seleccion == 1) {
                    String valorRomano = JOptionPane.showInputDialog("Ingrese un numero romano (I a L):");
                    if (!Convertidor.RomanoValido(valorRomano)) {
                        JOptionPane.showMessageDialog(null, "El numero romano no es valido.");
                        continue;
                    }
                    int resultadoArabigo = Convertidor.romanoaArabigo(valorRomano);
                    JOptionPane.showMessageDialog(null, "Equivalente en arabigo: " + resultadoArabigo);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Error de formato: Ingrese un numero valido.");
            } catch (IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    }
}

