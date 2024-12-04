public class DemandeImmatriculation extends Document implements Cloneable {
    @Override
    public DemandeImmatriculation clone() throws CloneNotSupportedException {
        return (DemandeImmatriculation) super.clone();
    }

    @Override
    public void affiche() {
        System.out.println("Affichage de la demande d'immatriculation : " + contenu);
    }

    @Override
    public void imprime() {
        System.out.println("Impression de la demande d'immatriculation : " + contenu);
    }
}
