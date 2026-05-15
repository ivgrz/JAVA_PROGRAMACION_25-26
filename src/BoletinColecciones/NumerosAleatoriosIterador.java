package BoletinColecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class NumerosAleatoriosIterador {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        // Insertamos 100 numeros random entre 1 y 10
        for (int i = 0; i < 100; i++){
            // math.random es un double entre 0.0 y 1.99999, multiplicar por N y redondear con INT para obtener el entero
            // aumentarle un + 1 al final si no se va a usar desde el 0 sino desde el 1, Ej. --> int aleatorio = (int)(Math.random() * 11 ) + 1;
            int aleatorio = (int)(Math.random() * 11 );
            numeros.add(aleatorio);
        }

        System.out.println("Antes de la eliminacion: " + numeros);
        //declaracion de la interfaz iterator
        Iterator <Integer> it = numeros.iterator();

        while (it.hasNext()){
            Integer n = it.next();
            if (n==5||n==7){
                it.remove();
            }
        }
        System.out.println("Despues: " + numeros);


    }

}
