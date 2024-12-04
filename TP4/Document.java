public abstract class Document implements Cloneable {
    protected String contenu = new String();

    public Document duplique() throws CloneNotSupportedException {
        return (Document) super.clone();
    }

    public void remplit(String informations) {
        this.contenu = informations;
    }

    public abstract void imprime();
    public abstract void affiche();
}
