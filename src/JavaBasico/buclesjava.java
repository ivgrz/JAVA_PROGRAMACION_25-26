package JavaBasico;

import java.util.Scanner;

public class buclesjava {
    public static void main(String[] args) {
        int contador = 0;


        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("Elige una opcion");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");
            String op = teclado.nextLine();
            opcion = Integer.parseInt(op);

            switch (opcion) {
                case 1:
                    System.out.println("ola");
                    break;
                case 2:
                    System.out.println("Adios");
                    break;
            } //fin del switch
            //Bucle definido for:
            // for(inicializacion; expresion; incremento){}
            for (int i = 0; i < 20; i += 3) {
                System.out.println("Indice: " + i);
            }
            // Bucle FOR infinito
            /*
            NO FUNCIONA
            int i = 5;
            for (;;) {
                System.out.println("indice: " +i);
                i+=3;
                if (i < 19)break;
                }

             */
            for (int i = 5; i < 10; i += 3) {
                System.out.println("Indice: " + i);
            }
            }



        }


    }
