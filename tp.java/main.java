import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class main {

    public static void main(String[] args) {

        // --- Création des médias ---
        livre l1 = new livre("Le Petit Prince", 1943, "Antoine de Saint-Exupéry", 96);
        livre l2 = new livre("Fondation", 1951, "Isaac Asimov", 255);
        cd c1 = new cd("Thriller", 1982, "Michael Jackson", 42);
        cd c2 = new cd("Discovery", 2001, "Daft Punk", 60);

        List<media> medias = new ArrayList<>();
        medias.add(l1);
        medias.add(l2);
        medias.add(c1);
        medias.add(c2);

        // --- Création des membres ---
        membre m1 = new membre("Alice", 1);
        membre m2 = new membre("Bruno", 2);

        Set<membre> membres = new HashSet<>();
        membres.add(m1);
        membres.add(m2);

        // --- Map des emprunts ---
        Map<membre, List<media>> emprunts = new HashMap<>();
        emprunts.put(m1, new ArrayList<>());
        emprunts.put(m2, new ArrayList<>());

        // --- Emprunts ---
        m1.emprunterMedia(l1);
        emprunts.get(m1).add(l1);

        m2.emprunterMedia(c1);
        emprunts.get(m2).add(c1);

        // --- Tests génériques ---
        System.out.println("\n--- Médias publiés après 1980 ---");
        List<media> apres1980 = utils.filtrer(medias, m -> m.getAnneePublication() > 1980);
        utils.afficherListe(apres1980);

        System.out.println("\n--- Membres dont le nom commence par A ---");
        List<membre> listeMembres = new ArrayList<>(membres);
        List<membre> nomsA = utils.filtrer(listeMembres, m -> m.getNom().startsWith("A"));
        utils.afficherListe(nomsA);

        // --- Tri ---
        System.out.println("\n--- Médias triés ---");
        Collections.sort(medias, new mediacomparator());
        utils.afficherListe(medias);

        // --- Set sans doublons des médias empruntés ---
        System.out.println("\n--- Médias empruntés (sans doublons) ---");
        Set<media> mediasEmpruntes = new HashSet<>();
        for (Map.Entry<membre, List<media>> entry : emprunts.entrySet()) {
            mediasEmpruntes.addAll(entry.getValue());
        }
        utils.afficherListe(new ArrayList<>(mediasEmpruntes));

        // --- Filtrer uniquement les livres ---
        System.out.println("\n--- Uniquement les livres ---");
        List<media> livresFiltres = utils.filtrer(medias, m -> m instanceof livre);
        utils.afficherListe(livresFiltres);
    }
}
