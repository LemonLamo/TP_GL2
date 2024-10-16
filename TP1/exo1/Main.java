package TP1.exo1;

public class Main {
    public static void main(String[] args) {
        Point centre = new Point(15, 6);

        Cercle cercle = new Cercle(centre, 4.0);

        Calcul calcul = new Calcul();

        calcul.calculerPropriete(cercle);
    }
}
