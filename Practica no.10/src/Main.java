import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String inputLongitud = JOptionPane.showInputDialog("Ingrese la longitud de la contraseña (por defecto 8):");
        int longitud = (inputLongitud != null && !inputLongitud.isEmpty()) ? Integer.parseInt(inputLongitud) : 8;


        int respuestaMayusculas = JOptionPane.showConfirmDialog(null, "¿Desea incluir mayúsculas?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean incluirMayusculas = (respuestaMayusculas == JOptionPane.YES_OPTION);


        int respuestaEspecial = JOptionPane.showConfirmDialog(null, "¿Desea incluir caracteres especiales?", "Opciones", JOptionPane.YES_NO_OPTION);
        boolean caracterEspecial = (respuestaEspecial == JOptionPane.YES_OPTION);


        generadorPassword generador = new generadorPassword(longitud, incluirMayusculas, caracterEspecial);


        String contraseñaGenerada = generador.obtenerPassword();
        String fortaleza = generador.fortaleza();

        // Mostrar el resultado al usuario
        JOptionPane.showMessageDialog(null, "Contraseña generada: " + contraseñaGenerada +
                "\nFortaleza: " + fortaleza, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}