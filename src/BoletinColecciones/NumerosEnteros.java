package BoletinColecciones;

import java.util.*;
import java.util.Collections;
import java.util.List;

/*
Codifica a aplicación que inserte nunha lista un conxunto de números enteiros entre 1 e 10. A partires desta lista crear:
Un conxunto cos elementos da lista sen repetir.
Un conxunto cos elementos repetidos.
Un conxunto cos elementos que só aparecen unha vez (únicos).

 */
public class NumerosEnteros {


    public static void main(String[] args) {
        List<Integer> listaO = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            int num = (int)(Math.random() * 11);
            listaO.add(num);

        }
        System.out.println("Lista inicial: " + listaO);
        Set<Integer> sinRepetidos = new HashSet<>();
        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> control = new HashSet<>();

        for (Integer n: listaO){
            if (!control.add(n)) repetidos.add(n);
        }
        Set<Integer> unicos = new HashSet<>();

    }

}
