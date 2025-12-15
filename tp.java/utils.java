import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class utils {

    public static <T> void afficherListe(List<T> liste) {
        for (T element : liste) {
            System.out.println(element);
        }
    }

    public static <T> List<T> filtrer(List<T> liste, Predicate<T> critere) {
        List<T> resultat = new ArrayList<>();
        for (T element : liste) {
            if (critere.test(element)) resultat.add(element);
        }
        return resultat;
    }

    public static <T> void copierCollection(Collection<T> source, Collection<T> destination) {
        destination.addAll(source);
    }
}
