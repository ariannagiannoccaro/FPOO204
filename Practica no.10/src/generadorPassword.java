import java.util.Random;

public class generadorPassword {

    //ATRIBUTOS
    private int longitud;
    private boolean incluirMayusculas;
    private boolean caracterEspecial;
    private String contraseña;
    private String minusculas = "abcdefghijklmnopqrstuvwxyz";
    private String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String numeros = "0123456789";
    private String especial = "<>!#$%&/{}*+~[]:,.-_?";

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

        for (char c : contraseña.toCharArray()) {
            if (mayusculas.contains(String.valueOf(c))) {
                tieneMayusculas = true;
            }
            if (especial.contains(String.valueOf(c))) {
                tieneEspeciales = true;
            }
        }

        if (longitud >= 12 && tieneMayusculas && tieneEspeciales) {
            return "Fuerte";
        } else if (longitud >= 8 && (tieneMayusculas || tieneEspeciales)) {
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

    //ZONA DE GETTER AND SETERS

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public boolean isIncluirMayusculas() {
        return incluirMayusculas;
    }

    public void setIncluirMayusculas(boolean incluirMayusculas) {
        this.incluirMayusculas = incluirMayusculas;
    }

    public boolean isCaracterEspecial() {
        return caracterEspecial;
    }

    public void setCaracterEspecial(boolean caracterEspecial) {
        this.caracterEspecial = caracterEspecial;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getMinusculas() {
        return minusculas;
    }

    public void setMinusculas(String minusculas) {
        this.minusculas = minusculas;
    }

    public String getMayusculas() {
        return mayusculas;
    }

    public void setMayusculas(String mayusculas) {
        this.mayusculas = mayusculas;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

}
