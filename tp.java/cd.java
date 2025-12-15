public class cd extends media implements empruntable {
    private String artiste;
    private int duree;

    public cd(String titre, int anneePublication, String artiste, int duree) {
        super(titre, anneePublication);
        this.artiste = artiste;
        this.duree = duree;
    }

    @Override
    public String getDescription() {
        return "CD de " + artiste + ", durée : " + duree + " min.";
    }

    @Override
    public void emprunter() {
        System.out.println("Le CD '" + getTitre() + "' a été emprunté.");
    }
}
