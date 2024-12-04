public class BonDeCommande extends Document implements Cloneable {
    @Override
    public BonDeCommande clone() throws CloneNotSupportedException {
        return (BonDeCommande) super.clone();
    }

    @Override
    public void affiche() {
        System.out.println("Affichage du bon de commande : " + contenu);
    }

    @Override
    public void imprime() {
        System.out.println("Impression du bon de commande : " + contenu);
    }
}
