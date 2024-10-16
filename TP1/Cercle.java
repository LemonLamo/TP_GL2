package TP1;
public class Cercle {
    private double rayon ;
    private Point centre;

    public Cercle (Point centre ,double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    
    public double getRayon () {
        return rayon;
    }

}
