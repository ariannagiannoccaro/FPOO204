public class Spartan {

    //atributos del spartan
    public String nombre;
    int salud;
    int escudo;
    String armaPrincipal;

    //Méodos del spartan
    public void mostrarInfo(){
        System.out.println("--------Información del Spartan--------" );
        System.out.println("Nombre: " + nombre );
        System.out.println("Salud: " + salud );
        System.out.println("Escudo: " + escudo );
        System.out.println("Arma: " + armaPrincipal );
        System.out.println("------------------------" );
    }

    public void atacar(String enemigo){
        System.out.println(nombre + " ataca a " + enemigo+ " con "+ armaPrincipal);
    }

    public void recargarArma(int municiones){
        int restante = 10;
        int total = restante + municiones;
        System.out.println("El arma "+ armaPrincipal + "tiene "+ total + "balas");
    }

    public void correr(boolean status){
        if(status){
            System.out.println("El spartan "+nombre +" está corriendo");
        }else{
            System.out.println("El spartan "+ nombre+ " se detuvo");
        }
    }

}//llave de la clase
