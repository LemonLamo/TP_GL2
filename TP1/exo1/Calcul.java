package TP1.exo1;

public class Calcul {

   
    public void calculerPropriete(Cercle cercle) {
        double surface = cercle.calculerSurface();
        double diametre = cercle.calculerDiametre();
        double circonference = cercle.calculerCirconference();

        System.out.println("Surface du cercle : " + surface);
        System.out.println("Diamètre du cercle : " + diametre);
        System.out.println("Circonférence du cercle : " + circonference);
    }
}

