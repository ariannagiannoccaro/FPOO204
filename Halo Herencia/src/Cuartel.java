public class Cuartel {
    public static void main(String[] args) {
        SpartanII jefeMaestro = new SpartanII("John 117", 100, "Rifle de Asalto", 0);

        jefeMaestro.mostrarInfo();
        jefeMaestro.usarManejoAvanzado();
        jefeMaestro.atacar("Elite");
        jefeMaestro.recibirDaño(50);
        jefeMaestro.recargarEscudo();

        System.out.println();
        System.out.println("------------------------------------------------------------------------------");


        SpartanIII Noble6 = new SpartanIII("Noble 6", 100, "Rifle de precision", 0);

        Noble6.mostrarInfo();
        Noble6.camuflajeActivo();
        Noble6.atacar("Elite");
        Noble6.recibirDaño(50);
        Noble6.recargarEscudo();

        System.out.println();
        System.out.println("------------------------------------------------------------------------------");

        SpartanIV Locke = new SpartanIV("Jameson Locke", 100, "Escopeta", 0);

        Locke.mostrarInfo();
        Locke.usarPropulsores();
        Locke.atacar("Elite");
        Locke.recibirDaño(50);
        Locke.recargarEscudo();

    }
}
