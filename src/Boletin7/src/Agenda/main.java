package Boletin7.src.Agenda;

import java.util.Scanner;

/**
 * 1- Deseña o programa que permita organizar a túa axenda. Para iso o programa ten que posiblitar:
 * Crear unha táboa (bidimensional) onde as filas sexan días da seman e as columnas as horas do día.
 * Enche a táboa con cadeas que representen actividades, por exemplo: "Matemáticas", "Historia", "Deporte", “Compra”, “Piscina”.
 * Mostra o horario inicial o usuario.
 * Permite o usuario:
 * Cambiar unha actividade por outra.
 * Engadir unha actividade extra nunha posición valeira.
 *      e)Mostra o horario actualizado tras cada modificación.
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Horario miAgenda = new Horario();
        int opcion = 0;

        System.out.println("--- AGENDA ---");
        miAgenda.mostrar();

        while(opcion != 3){
            System.out.println("¿Que quieres hacer?");
            System.out.println("1. Cambiar/Añadir actividad");
            System.out.println("2. Mostrar horario");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                System.out.println("Introduce el dia: ");
                String dia = sc.nextLine();
                System.out.println("Introduce la hora(ej. 09:00): ");
                String hora = sc.nextLine();
                System.out.println("Introduce la actividad: ");
                String actividad = sc.nextLine();

                miAgenda.setActividad(dia, hora, actividad);
                
            } else if (opcion == 2) {
                miAgenda.mostrar();

            }

        }
        System.out.println("Hasta pronto! ");
        sc.close();
    }
}
