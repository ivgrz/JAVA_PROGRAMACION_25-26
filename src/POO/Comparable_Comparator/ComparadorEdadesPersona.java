package POO.Comparable_Comparator;

import java.util.Comparator;

public class ComparadorEdadesPersona implements Comparator<PersonaComparable> {

    @Override
    public int compare(PersonaComparable p1, PersonaComparable p2) {
        return p1.edad - p2.edad;
    }
}
