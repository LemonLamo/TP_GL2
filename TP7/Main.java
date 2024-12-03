package TP7;

import java.util.ArrayList;
import java.util.List;

// Classe abstraite Societe
abstract class Societe {
    protected double coutUnitVehicule = 5.0; // Coût unitaire d'entretien par véhicule
    protected int nbrVehicules;             // Nombre de véhicules

    // Méthode pour ajouter un véhicule
    public void ajouteVehicule() {
        nbrVehicules++;
    }

    // Méthodes abstraites
    public abstract double calculeCoutEntretien();
    public abstract boolean ajouteFiliale(Societe filiale);
}

// Classe SocieteSansFiliale
class SocieteSansFiliale extends Societe {

    @Override
    public double calculeCoutEntretien() {
        return nbrVehicules * coutUnitVehicule; // Coût d'entretien pour une société sans filiale
    }

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return false; // Impossible d'ajouter une filiale
    }
}

// Classe SocieteMere
class SocieteMere extends Societe {
    private List<Societe> filiales = new ArrayList<>(); // Liste des filiales

    @Override
    public double calculeCoutEntretien() {
        double coutTotal = nbrVehicules * coutUnitVehicule; // Coût pour la société mère
        for (Societe filiale : filiales) {
            coutTotal += filiale.calculeCoutEntretien(); // Ajouter le coût des filiales
        }
        return coutTotal;
    }

    @Override
    public boolean ajouteFiliale(Societe filiale) {
        return filiales.add(filiale); // Ajouter une filiale
    }
}

// Classe Utilisateur (main)
public class Main {
    public static void main(String[] args) {
        // Création de la société mère
        SocieteMere societeMere = new SocieteMere();
        societeMere.ajouteVehicule(); // Ajout d'un véhicule à la société mère

        // Création des filiales
        SocieteSansFiliale filiale1 = new SocieteSansFiliale();
        filiale1.ajouteVehicule(); // Ajout d'un véhicule à la première filiale

        SocieteSansFiliale filiale2 = new SocieteSansFiliale();
        filiale2.ajouteVehicule(); // Ajout de deux véhicules à la seconde filiale
        filiale2.ajouteVehicule();

        // Ajout des filiales à la société mère
        societeMere.ajouteFiliale(filiale1);
        societeMere.ajouteFiliale(filiale2);

        // Calcul du coût total d'entretien
        System.out.println("Coût total d'entretien : " + societeMere.calculeCoutEntretien());
    }
}

