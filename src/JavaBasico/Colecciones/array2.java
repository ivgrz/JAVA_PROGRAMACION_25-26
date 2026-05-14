package JavaBasico.Colecciones;

import POO.Comparable_Comparator.Persona2;
import POO.Ejercicios_basicos.Futbol.Futbolista;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class array2 {
    public static void main(String[] args) {

        ArrayList<String> nomes;
        nomes = new ArrayList();
        nomes.add("Jaime");
        nomes.add("Gustavo");
        nomes.add("Alicia");
        nomes.add("Jose");
        nomes.add(2, "Paco");
        System.out.println(nomes);
        String str = nomes.get(0);
        System.out.println(str);
        nomes.remove(0);
        nomes.remove(nomes.size() - 1); // Resta al length total del array
        nomes.remove("Gustavo");
        System.out.println(nomes);


        Futbolista[] equipo = new Futbolista[5];
        equipo[0] = new Futbolista("Kylian Mbappé", "111M", 25, 1.78, 300);
        equipo[1] = new Futbolista("Neymar Jr", "222N", 32, 1.75, 400);
        equipo[2] = new Futbolista("Lionel Messi", "333L", 36, 1.70, 800);
        equipo[3] = new Futbolista("Cristiano Ronaldo", "444C", 39, 1.87, 850);
        equipo[4] = new Futbolista("Lamine Yamal", "555Y", 16, 1.78, 10);


        ArrayList equipo2 = new ArrayList();
        equipo2.add(equipo[1]);
        equipo2.add(equipo[2]);
        equipo2.add(equipo[3]);
        equipo2.add(equipo[4]);
        equipo2.add("Celta");

        for (Futbolista f : equipo) {
            System.out.println("Futbolista: " + f);
        }
        for (int i = 0; i < equipo2.size(); i++) {
            System.out.println("Futbolista: " + equipo2.get(i));
        }

        for (Persona2 f : equipo) {
            System.out.println("Futbolista: " + f);
        }


        Iterator<Futbolista> iterador = equipo2.iterator();
        while (iterador.hasNext()) {
            System.out.println("Futbolista: " + iterador.next());
        }


        ListIterator<Futbolista> lit = equipo2.listIterator();
        System.out.println("Recorriendo lista con ListIterator");
        while (lit.hasNext()) {
            System.out.println("F: " + lit.next());
        }
        System.out.println("Recorriendo hacia atras");
        while (lit.hasPrevious()) {
            System.out.println(" : " + lit.previous());
        }


    }
}
