package TP7;

abstract class Societe {
    protected double coutUnitVehicule = 5.0;
    protected int nbrVehicules;

    //methode pour ajouter un vehicule
    public void ajouterVehicule() {
        nbrVehicules++;
    }

    //methode calcul cout entretien
    public abstract double calculeCoutEntretien();

    //methode ajouter filiale
    public abstract boolean ajouteFiliale(Societe filiale);
    
}
