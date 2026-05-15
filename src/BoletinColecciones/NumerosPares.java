package BoletinColecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> coleccion_n = new ArrayList<>();

        int n;

        do {
            System.out.println("Introduce un numero (-1 para terminar)");
            n = sc.nextInt();
            if (n > 0)
                coleccion_n.add(n);


        }while (n != -1);
        for (int i = 0; i < coleccion_n.size(); i+=2){
            int valorMultiplicado = coleccion_n.get(i) * 100;
            System.out.println("Indice: " + i + ": " + valorMultiplicado);

        }
    }

}

