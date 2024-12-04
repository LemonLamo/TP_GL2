public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        LiasseVierge liasseVierge = LiasseVierge.Instance();

        BonDeCommande bonDeCommande = new BonDeCommande();
        DemandeImmatriculation demandeImmatriculation = new DemandeImmatriculation();
        CertificatCession certificatCession = new CertificatCession();

        liasseVierge.ajoute(bonDeCommande);
        liasseVierge.ajoute(demandeImmatriculation);
        liasseVierge.ajoute(certificatCession);

        LiasseClient liasseClient1 = new LiasseClient("Client1");
        liasseClient1.affiche();

        LiasseClient liasseClient2 = new LiasseClient("Client2");
        liasseClient2.affiche();

    }
}

