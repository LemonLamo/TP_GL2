public class Main {
    public static void main(String[] args) {
        //creation d'un vehicule
        Vehicule vehicule = new Vehicule();
        vehicule.setDescription("Vehicule Electrique");
        vehicule.setPrix(100000);

        //creation de 2 vues pour le vehicule
        VueVehicule vue1 = new VueVehicule(vehicule);
        VueVehicule vue2 = new VueVehicule(vehicule);

        //mise a jour des informations du vehicule
        System.out.println("Mise a jour de la description du vehicule...");
        vehicule.setDescription("Vehicule Hybride");

        System.out.println("Mise a jour du prix du vehicule...");
        vehicule.setPrix(120000);


    }
}
