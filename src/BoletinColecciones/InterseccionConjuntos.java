package BoletinColecciones;

import java.util.HashSet;
import java.util.Set;

/*
Facer o mesmo que o exercicio 7 coa intersección, formada polos elementos comúns os dous conxuntos. A chamada a función terá o seguinte formato:
static <E> Set <E> interseccion (Set<E> conxunto1, Set<E> conxunto2)

* */
public class InterseccionConjuntos {
    public static <E> Set<E> Interseccion(Set<E> conjunto1, Set<E> conjunto2){

        Set <E> resultado = new HashSet<>(conjunto1);

        resultado.retainAll(conjunto2);

        return resultado;

    }

    public static void main(String[] args) {
        Set <String> conjuntoA = Set.of("Java", "Python", "C++");
        Set <String> conjuntoB = Set.of("Python", "JavaScript", "Rust");

        System.out.println("Primer conjunto: " + conjuntoA);
        System.out.println("Segundo conjunto: " + conjuntoB);

        Set <String> reInter = Interseccion(conjuntoA,conjuntoB);

        System.out.println("Resultado de interseccion: " + reInter);
    }
}
