package POO.Ejercicios_basicos.Futbol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PruebaFutbol {
    public static void main(String[] args) {
        List<Futbolista> equipo = new ArrayList<>();

        equipo.add(new Futbolista("Lionel Messi", "123A", 36, 1.70, 800));
        equipo.add(new Futbolista("Cristiano Ronaldo", "456B", 39, 1.87, 850));
        equipo.add(new Futbolista("Kylian Mbappe", "789C", 25, 1.78, 300));
        equipo.add(new Futbolista("Neymar Junior", "012D", 32, 1.75, 400));

        System.out.println("--- EQUIPO SIN ORDENAR ---");
        imprimirEquipo(equipo);

        // 1. ORDEN NATURAL (Por DNI, definido en el compareTo)
        Collections.sort(equipo);
        System.out.println("\n--- ORDENADO POR DNI (Comparable) ---");
        imprimirEquipo(equipo);

        // 2. ORDEN POR GOLES (Usando el Comparator que creamos)
        equipo.sort(Futbolista.GolesComparator);
        System.out.println("\n--- ORDENADO POR GOLES (Comparator) ---");
        imprimirEquipo(equipo);

        // 3. ORDEN POR NOMBRE
        equipo.sort(Futbolista.NombreComparator);
        System.out.println("\n--- ORDENADO POR NOMBRE (Comparator) ---");
        imprimirEquipo(equipo);

        System.out.println();

        // Metodo EQUALS

        System.out.println("------- EQUALS --------");
        Futbolista clonMessi = new Futbolista("L. Messi","123A", 36, 1.70, 800);

        Futbolista MessiLista = equipo.get(2);

        if (MessiLista.equals(clonMessi)) System.out.println("Coincide DNI");
        else System.out.println("Futbolistas diferentes (no coincide DNI)");

        System.out.println("Comprobacion de sitio en memoria: " + (MessiLista == clonMessi));
    }
    public static void imprimirEquipo(List<Futbolista> lista) {
        for (Futbolista f : lista) {
            System.out.println("Nombre: " + f.nombre + " | Goles: " + f.getNumero_goles() + " | DNI: " + f.dni);
        }
    }

}
