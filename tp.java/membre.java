import java.util.ArrayList;
import java.util.List;

public class membre {
    private String nom;
    private int id;
    private List<media> mediasEmpruntes;

    public membre(String nom, int id) {
        this.nom = nom;
        this.id = id;
        this.mediasEmpruntes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public int getId() {
        return id;
    }

    public void emprunterMedia(media m) {
        mediasEmpruntes.add(m);
    }

    public List<media> getMediasEmpruntes() {
        return mediasEmpruntes;
    }

    @Override
    public String toString() {
        return "Membre {" + nom + ", id=" + id + "}";
    }
}
