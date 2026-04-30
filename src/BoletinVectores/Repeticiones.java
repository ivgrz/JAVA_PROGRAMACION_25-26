package BoletinVectores;

import java.util.Arrays;

public class Repeticiones {
    public static void main(String[] args) {
        int tabla [] = {1,2,4,3,6,7,8,6,4,2};
        int tablaaux[] = new int [tabla.length];
        Arrays.sort(tabla);
        tablaaux[0] = tabla[0];
        int puntero = 0;
        for(int k=1; k<tabla.length; k++){
            int resultado = Arrays.binarySearch(tablaaux,0, puntero+1,tabla[k]);
            // En BinarySearch los parametros tienen de orden Arrays.BinarySearch(lugar, inicio_busqueda, limite_busqueda, elemento_buscado)
            // Sumamos 1 a puntero xq el rango (fromindex -> toindex) no incluye el elemento de la posicion del rango final

            if (resultado < 0){
                puntero++;
                tablaaux[puntero] = tabla[k];


            }
            // Si resultado es negativo (< a 0) el elemento no ha estado en la tablaaux antes y se puede añadir
        }

        int[] resultadofinal = Arrays.copyOf(tablaaux, puntero+1);
        // copyOf: Crea una tabla nueva, recortando los trozos vacíos (los ceros) para que el resultado quede profesional y del tamaño exacto.
        // Arrays.copyOf(tablaaux, puntero + 1)
        //tablaaux: Es el original que quieres fotocopiar. Como recordarás, esta tabla es grande (tamaño 10) y tiene muchos ceros al final que no sirven para nada.
        //puntero + 1: Es el tamaño de la fotocopia. Le dices: "Solo fotocopia desde el principio hasta aquí".
        //¿Por qué usamos puntero + 1 en ambos?
        //Si el puntero marca la posición 2, significa que has llenado los huecos 0, 1 y 2.
        //¿Cuántos números hay en total? 3.
        //Por eso ponemos puntero + 1. Le estamos diciendo a Java: "Oye, el total de números válidos que tengo es 3".
        System.out.println(Arrays.toString(resultadofinal));
    }
}
