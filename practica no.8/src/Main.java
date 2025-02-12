public class Main {


    public static void main(String[] args) {

        //Creación del objeto o instanciar del objeto
        Spartan jefeMaestro = new Spartan();
        Spartan reach = new Spartan();

        //asignación de los atributos del objeto
        jefeMaestro.nombre = "John";
        jefeMaestro.salud = 100;
        jefeMaestro.escudo = 90;
        jefeMaestro.armaPrincipal= "Escopeta";

        //usar sus métodos
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);


        //reach
        reach.nombre = "Luke";
        reach.salud = 0;
        reach.escudo = 0;
        reach.armaPrincipal= "Aguijoneador";

        reach.mostrarInfo();
        reach.atacar("Elite");
        reach.recargarArma(0);
        reach.correr(false);
    }


}//llave de la clase