package POO.Colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class PruebaColecciones {

    public static void main(String[] args) {

        System.out.println("=== 1. PRUEBA DE LISTAS (List y ArrayList / LinkedList) ===");
        // Una lista mantiene el orden de inserción y SÍ permite duplicados.
        // Usamos la interfaz 'List' como tipo y 'ArrayList' como implementación.
        List<String> listaAlumnos = new ArrayList<>();
        listaAlumnos.add("Brais");
        listaAlumnos.add("Iago");
        listaAlumnos.add("Brais"); // Duplicado permitido
        listaAlumnos.add("Uxía");

        System.out.println("ArrayList (mantiene orden y duplicados): " + listaAlumnos);
        System.out.println("Primer alumno (índice 0): " + listaAlumnos.get(0));


        System.out.println("\n=== 2. PRUEBA DE CONJUNTOS (Set y HashSet / TreeSet) ===");
        // Un conjunto NO permite duplicados.
        // HashSet no asegura ningún orden. TreeSet los ordena automáticamente.
        Set<String> conjuntoHashSet = new HashSet<>();
        conjuntoHashSet.add("Brais");
        conjuntoHashSet.add("Iago");
        conjuntoHashSet.add("Brais"); // Este duplicado será ignorado automáticamente
        conjuntoHashSet.add("Uxía");
        System.out.println("HashSet (sin duplicados, orden caótico): " + conjuntoHashSet);

        Set<String> conjuntoTreeSet = new TreeSet<>(conjuntoHashSet);
        System.out.println("TreeSet (sin duplicados, ORDENADO alfabéticamente): " + conjuntoTreeSet);


        System.out.println("\n=== 3. PRUEBA DE MAPAS (Map y HashMap) ===");
        // Estructura clave-valor. Las claves NO se pueden repetir.
        Map<Integer, String> mapaMatriculas = new HashMap<>();
        mapaMatriculas.put(101, "Brais");
        mapaMatriculas.put(102, "Iago");
        mapaMatriculas.put(101, "Uxía"); // Machaca el valor de la clave 101, Brais desaparece

        System.out.println("HashMap (Clave -> Valor): " + mapaMatriculas);
        System.out.println("¿Quién tiene la clave 102?: " + mapaMatriculas.get(102));
    }
}
