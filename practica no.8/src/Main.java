public class Main {


    public static void main(String[] args) {

        //Creación del objeto o instanciar del objeto
        Spartan jefeMaestro = new Spartan("John 117", 100, 90, "Escopeta" );
        Spartan reach = new Spartan("Luke", 0, 0, "Aguijoneador");


        //usar sus métodos
        jefeMaestro.mostrarInfo();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recargarArma(65);
        jefeMaestro.correr(true);


        reach.mostrarInfo();
        reach.atacar("Elite");
        reach.recargarArma(0);
        reach.correr(false);


        //ejemplo de get y set con el objeto jefeMaestro
        jefeMaestro.setNombre("Arianna Giannoccaro");
        jefeMaestro.mostrarInfo();
        System.out.println(jefeMaestro.getNombre());


    }


}//llave de la clase