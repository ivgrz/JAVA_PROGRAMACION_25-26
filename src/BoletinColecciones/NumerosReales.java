package BoletinColecciones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class NumerosReales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> positivos = new ArrayList<>();
        ArrayList<Integer> negativos = new ArrayList<>();

        int n;
       do{

            System.out.println("Introduce un numero (0 para terminar)");
            n = sc.nextInt();
            if (n < 0 ){
                negativos.add(n);
            } else positivos.add(n);
        } while (n != 0);
        int Sumapos = 0;
        for (Integer p: positivos) Sumapos += p;
        int Suman = 0;
        for (Integer nt: negativos) Suman += nt;
        System.out.println("Tabla positivos: " + positivos + " Suma: " + Sumapos);
        System.out.println("Tabla negativos: " + negativos + " Suma: " + Suman);

        Iterator<Integer> it = positivos.iterator();

        while(it.hasNext()){
            Integer x = it.next();

            if (x > 10) it.remove();
        }

        Iterator<Integer> itn = negativos.iterator();

        while (itn.hasNext()){
            Integer y = itn.next();
            if (y < -10) itn.remove();
        }

        System.out.println("Despues: " + positivos);
        System.out.println("Despues: " + negativos);


    }
}
