package TP1.exo1;

public class Cercle {
    private double rayon;
    private Point centre;

    public Cercle(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }

  
    public void setCentre(Point centre) {
        this.centre = centre;
    }

   
    public double calculerSurface() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    
    public double calculerDiametre() {
        return 2 * this.rayon;
    }

    public double calculerCirconference() {
        return 2 * Math.PI * this.rayon;
    }
}
