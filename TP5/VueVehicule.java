public class VueVehicule {

    private String description;

    public VueVehicule(String description) {
        this.description = description;
    }

    public void dessine() {
        System.out.println("Vehicule"+ description);
    }
}
