import java.util.ArrayList;
import java.util.List;

public class LiasseClient {
    private List<Document> documents = new ArrayList<>();

    public LiasseClient(String informations) throws CloneNotSupportedException {
        for (Document doc : LiasseVierge.Instance().getDocuments()) {
            Document copie = doc.duplique();
            if (copie != null) {
                copie.remplit(informations);
                documents.add(copie);
            }
        }
    }

    public void affiche() {
        for (Document doc : documents) {
            doc.affiche();
        }
    }

    public void imprime() {
        for (Document doc : documents) {
            doc.imprime();
        }
    }
}
