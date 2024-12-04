public class CertificatCession extends Document implements Cloneable {
    @Override
    public CertificatCession clone() throws CloneNotSupportedException {
        return (CertificatCession) super.clone();
    }

    @Override
    public void affiche() {
        System.out.println("Affichage du certificat de cession : " + contenu);
    }

    @Override
    public void imprime() {
        System.out.println("Impression du certificat de cession : " + contenu);
    }
}
