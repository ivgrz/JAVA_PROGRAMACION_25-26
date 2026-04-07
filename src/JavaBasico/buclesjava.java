package JavaBasico;

import java.util.Scanner;

public class buclesjava {
    public static void main(String[] args) {
        int contador = 0;
        while

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("Elige una opcion");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");
            String op = teclado.nextLine();
            opcion = Integer.parseInt(op);


            if (opcion == 1){
                System.out.println("Hola");
            } else if (opcion == 2) {
                System.out.println("Adios");
                
            } else if (opcion == 3) {
                System.out.println("Hasta luego");
                
            }
        }


    }
}