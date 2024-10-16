package TP1;

public class Calcul {
    private double surface;
    private double diametre;
    private double circonference;
    public Cercle cercle;

    // Constructeur
    public Calcul(double surface, double diametre, double circonference) {
        this.surface = surface;
        this.diametre = diametre;
        this.circonference = circonference;
    }

    // Getters
    public double getSurface() {
        return surface;
    }

    public double getDiametre() {
        return diametre;
    }

    public double getCirconference() {
        return circonference;
    }

    public Cercle getCercle() {
        return cercle;
    }

    // Setters
    public void setSurface(double surface) {
        this.surface = surface;
    }

    public void setDiametre(double diametre) {
        this.diametre = diametre;
    }

    public void setCirconference(double circonference) {
        this.circonference = circonference;
    }

    public void setCercle(Cercle cercle) {
        this.cercle = cercle;
    }

    // Méthodes
    public double calculerSurface() {
        if (cercle != null) {
            this.surface = Math.PI * Math.pow(cercle.getRayon(), 2);
        }
        return surface;
    }

    public double calculerDiametre() {
        if (cercle != null) {
            this.diametre = 2 * cercle.getRayon();
        }
        return diametre;
    }

    public double calculerCirconference() {
        if (cercle != null) {
            this.circonference = 2 * Math.PI * cercle.getRayon();
        }
        return circonference;
    }
}

