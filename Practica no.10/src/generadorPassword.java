import java.util.Random;

public class generadorPassword {
    int longitud;
    boolean incluirMayusculas;
    boolean caracterEspecial;
    String contraseña;
    String minusculas = "abcdefghijklmnopqrstuvwxyz";
    String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String numeros = "0123456789";
    String especial = "<>!#$%&/{}*+~[]:,.-_?";

    public generadorPassword(int longitud, boolean incluirMayusculas, boolean caracterEspecial) {
        this.longitud = longitud;
        this.incluirMayusculas = incluirMayusculas;
        this.caracterEspecial = caracterEspecial;
        this.contraseña = generarPassword();
    }

    String generarPassword() {
        Random random = new Random();
        String caracteres = minusculas + numeros;

        if (incluirMayusculas) {
            caracteres += mayusculas;
        }
        if (caracterEspecial) {
            caracteres += especial;
        }
        StringBuilder passwordGenerada = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            passwordGenerada.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }
        return passwordGenerada.toString();
    }

    String fortaleza() {
        boolean tieneMayusculas = false;
        boolean tieneEspeciales = false;
        boolean tieneNumeros = false;

        for (char c : contraseña.toCharArray()) {
            if (mayusculas.contains(String.valueOf(c))) {
                tieneMayusculas = true;
            }
            if (especial.contains(String.valueOf(c))) {
                tieneEspeciales = true;
            }
            if (numeros.contains(String.valueOf(c))) {
                tieneNumeros = true;
            }
        }

        if (longitud >= 12 && tieneMayusculas && tieneEspeciales && tieneNumeros) {
            return "Fuerte";
        } else if (longitud >= 8 && (tieneMayusculas || tieneEspeciales || tieneNumeros)) {
            return "Moderada";
        } else {
            return "Débil";
        }
    }

    String obtenerPassword() {
        return contraseña;
    }

    public static void main(String[] args) {
        generadorPassword generador = new generadorPassword(12, true, true);
        System.out.println("Contraseña generada: " + generador.obtenerPassword());
        System.out.println("Fortaleza de la contraseña: " + generador.fortaleza());
    }
}
