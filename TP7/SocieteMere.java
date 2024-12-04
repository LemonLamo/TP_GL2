package TP7;

import java.util.List;
import java.util.ArrayList;

public class SocieteMere extends societe {
    //on cree une array liste de filliales 
    private List<societe> filiales = new ArrayList<>();

    @Override
    public double calculeCoutEntretien() {
        double coutTotal= nbrVehicules * coutUnitVehicule; //cout de la societe mere

        //on parcourt la liste des filiales pour calculer le cout total
        for (societe filiale : filiales) {
            coutTotal += filiale.calculeCoutEntretien();
        }
        return coutTotal;
    }

    @Override
    public boolean ajouteFiliale(societe filiale) {
        return filiales.add(filiale);
    }
    
}
