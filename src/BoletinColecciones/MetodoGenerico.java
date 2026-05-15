package BoletinColecciones;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implementa un método xenérico estático o que se lle pasa como parámetro dúas táboas con elementos do mesmo tipo xenérico
 * e devolta unha nova táboa cos elementos de ambas concatenados (os da segunda táboa despois dos da primeira).
 */
public class MetodoGenerico{

    public static <T> T[] concatenar_tablas(T[] tabla1, T[] tabla2){
        T[] resultado = Arrays.copyOf(tabla1, tabla1.length + tabla2.length);
        System.arraycopy(tabla2,0,resultado,tabla1.length,tabla2.length);
        return  resultado;
    }

    public static void main(String[] args) {
        Integer[] t1 = {1, 2, 3};
        Integer[] t2 = {4, 5, 6};

        Integer[] total = concatenar_tablas(t1, t2);
        System.out.println(Arrays.toString(total));
    }




}
