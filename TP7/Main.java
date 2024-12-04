package TP7;

import java.util.ArrayList;
import java.util.List;
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

