public interface File {
    public FilePrio creer();
    public void enfiler(String n, int p) throws FileException;
    public FilePrio defiler() throws FileException;
    public FilePrio tete() throws FileException;
    public boolean estVide();
    public  int taille();
}
