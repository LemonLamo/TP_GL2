 class VueVehicule implements Observateur{
    private String texte1 = "";
    private String texte2 = "";
    private Vehicule vehicule;

    public VueVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
        vehicule.ajouterObservateur(this); // Enregistre la vue auprès du modèle
        // pour être prévenue des changement
        // s'incrire comme observateur

    }

    public void redessineDescription() {
        // Actualise le contenu de la vue
         texte1= "Description : " + vehicule.getDescription();
        System.out.println(texte1);

    }
    public void redessinePrix() {
        // Actualise le contenu de la vue
        texte2 =  " Prix : " + vehicule.getPrix();
        System.out.println(texte2);
    }
     @Override
     public void actualise() {
         redessineDescription();
         redessinePrix();// Met à jour l'affichage
     }

}
