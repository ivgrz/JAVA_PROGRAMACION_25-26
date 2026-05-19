package BoletinColecciones;

import java.util.HashSet;
import java.util.Set;

/*
* Implementar un método estático que faga a unión de dous conxuntos de elementos xenéricos.
* A unión é un novo conxunto con tódolos elemento que pertenza, o menos, a un dos dous conxuntos.
* A chamada a función terá o seguinte formato: static <E> Set <E> union (Set<E> conxunto1, Set<E> conxunto2)
*
* */
public class UnionConjuntos {
    public static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2){
        Set<E> resultado = new HashSet<>(conjunto1);

        resultado.addAll(conjunto2);

        return resultado;


    }

    public static void main(String[] args) {
        Set<String> conjuntoA = new HashSet<>();
        conjuntoA.add("Java");
        conjuntoA.add("Python");
        conjuntoA.add("C++");

        Set<String> conjuntoB = new HashSet<>();
        conjuntoB.add("Python"); // HashSet se encarga de eliminar repetidos
        conjuntoB.add("JavaScript");
        conjuntoB.add("Rust");


        System.out.println("POR SEPARADO");
        System.out.println(conjuntoA);
        System.out.println(conjuntoB);
        System.out.println("UNION: ");
        Set<String> resultado = union(conjuntoA,conjuntoB);
        System.out.println(resultado);
    }
}
