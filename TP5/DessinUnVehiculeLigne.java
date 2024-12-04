import java.util.List;

public class DessinUnVehiculeLigne implements DessinCatalogue {

    @Override
    public void dessine(List<VueVehicule> contenu) {
        for (VueVehicule Vehicule : contenu) {
            Vehicule.dessine();
            System.out.println("\n--- Saut de ligne (Un véhicule par ligne) ---");
        }
    }
}
