package POO.Comparable_Comparator;

import java.util.Comparator;

public class ComparadorEdadesPersona implements Comparator<Persona2> {

    @Override
    public int compare(Persona2 p1, Persona2 p2) {
        return p1.edad - p2.edad;
    }
}
