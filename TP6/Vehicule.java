public class Vehicule extends Sujet {

    private String description;
    private double prix;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
        notifierObservateurs();
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
        notifierObservateurs();
    }

}
