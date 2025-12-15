public class livre extends media implements empruntable {
    private String auteur;
    private int nbPages;

    public livre(String titre, int anneePublication, String auteur, int nbPages) {
        super(titre, anneePublication);
        this.auteur = auteur;
        this.nbPages = nbPages;
    }

    @Override
    public String getDescription() {
        return "Livre de " + auteur + ", " + nbPages + " pages.";
    }

    @Override
    public void emprunter() {
        System.out.println("Le livre '" + getTitre() + "' a été emprunté.");
    }
}
