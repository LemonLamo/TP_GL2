package TP7;

public class SocieteSansFiliale extends societe {
    @Override
    public double calculeCoutEntretien() {
        return nbrVehicules * coutUnitVehicule;
    }

    @Override
    public boolean ajouteFiliale(societe filiale) {
         return false; //impossible d'ajouter une filiale dans une feuille du pattern composite

    }


}
