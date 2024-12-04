package TP7;

abstract class societe {
    protected double coutUnitVehicule = 5.0; // Coût unitaire d'entretien par véhicule
    protected int nbrVehicules;             // Nombre de véhicules

    // Méthode pour ajouter un véhicule
    public void ajouteVehicule() {
        nbrVehicules++;
    }

    // Méthodes abstraites
    public abstract double calculeCoutEntretien();
    public abstract boolean ajouteFiliale(societe filiale);
}
