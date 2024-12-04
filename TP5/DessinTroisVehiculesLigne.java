import java.util.List;

public class DessinTroisVehiculesLigne implements DessinCatalogue {

    @Override
    public void dessine(List<VueVehicule> contenu) {
        int count = 0;
        for (VueVehicule Vehicule : contenu) {
            Vehicule.dessine();
            count++;
            if (count % 3 == 0) {
                System.out.println("\n--- Saut de ligne (Trois véhicules par ligne) ---");
            }
        }
            if (count % 3 != 0) {
                System.out.println("\n--- Fin de ligne ---");
            }
        }
    }

