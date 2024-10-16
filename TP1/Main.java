package TP1;

public class Main {
    public static void main(String[] args) {
        // Création d'un point pour le centre du cercle
        Point centre = new Point(5.0, 3.0);

        // Création d'un cercle avec un centre et un rayon
        Cercle cercle = new Cercle(centre, 4.0);

        // Création d'un objet Calcul pour effectuer les calculs
        Calcul calcul = new Calcul(0.0, 0.0, 0.0);

        // Association du cercle à l'objet Calcul
        calcul.setCercle(cercle);

        // Calcul de la surface, du diamètre et de la circonférence
        double surface = calcul.calculerSurface();
        double diametre = calcul.calculerDiametre();
        double circonference = calcul.calculerCirconference();

        // Affichage des résultats
        System.out.println("Surface du cercle : " + surface);
        System.out.println("Diamètre du cercle : " + diametre);
        System.out.println("Circonférence du cercle : " + circonference);
    }
}

