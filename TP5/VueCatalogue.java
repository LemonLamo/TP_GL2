import java.util.ArrayList;
import java.util.List;

public class VueCatalogue {
    private DessinCatalogue dessin;
    private List<VueVehicule> contenu = new ArrayList<>();

    public VueCatalogue(DessinCatalogue dessin) {
        this.dessin = dessin;
        contenu.add(new VueVehicule("Voiture électrique - Tesla Model S"));
        contenu.add(new VueVehicule("Voiture compacte - Renault Clio"));
        contenu.add(new VueVehicule("SUV hybride - Toyota RAV4"));
        contenu.add(new VueVehicule("Berline essence - BMW Série 3"));
        contenu.add(new VueVehicule("Citadine électrique - Fiat 500e"));
    }
        public void dessine () {
            dessin.dessine(contenu);
        }
    }

