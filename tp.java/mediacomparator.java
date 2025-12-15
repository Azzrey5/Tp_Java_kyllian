import java.util.Comparator;

public class mediacomparator implements Comparator<media> {
    @Override
    public int compare(media m1, media m2) {
        int cmp = Integer.compare(m2.getAnneePublication(), m1.getAnneePublication());
        if (cmp == 0) {
            return m1.getTitre().compareTo(m2.getTitre());
        }
        return cmp;
    }
}
