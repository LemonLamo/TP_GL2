public class Main {
    public static void main(String[] args) {

        System.out.println("Affichage : Trois véhicules par ligne");
        VueCatalogue catalogueTroisLignes = new VueCatalogue(new DessinTroisVehiculesLigne());
        catalogueTroisLignes.dessine();

        System.out.println("\n=================================\n");

        System.out.println("Affichage : Un véhicule par ligne");
        VueCatalogue catalogueUneLigne = new VueCatalogue(new DessinUnVehiculeLigne());
        catalogueUneLigne.dessine();
        System.out.println("\n=================================\n");
    }
}
