import java.util.ArrayList;
import java.util.List;

public class LiasseVierge {
    private static LiasseVierge instance = null;
    private List<Document> documents = new ArrayList<>();

    private LiasseVierge() {}

    public static LiasseVierge Instance() {
        if (instance == null) {
            instance = new LiasseVierge();
        }
        return instance;
    }

    public void ajoute(Document document) {
        documents.add(document);
    }

    public void retire(Document document) {
        documents.remove(document);
    }

    public List<Document> getDocuments() {
        return documents;
    }
}
