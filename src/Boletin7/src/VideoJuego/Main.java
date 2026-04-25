package Boletin7.src.VideoJuego;

import java.util.Scanner;

/**
 * 2- Deseña un mapa para un videoxogo que represente habitacións conectadas.
 * Para iso crea unha táboa de 3x3 onde cada casiña represente unha habitación.
 * Enche a táboa con cadeas que describan os habitáculos, como "Entrada", "Tesouro", "Trampa", etc.
 * Permite o usuario elixir unha habitación introducindo a súa fila e columna para descubrir que contén.
 * Engade unha condición de vitoria si o usuario encontra o "Tesouro"
 */
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Habitaciones j = new Habitaciones();
        boolean encontrado = false;

        System.out.println("------------ HABITACIONES --------------");
        System.out.println("Ecuentra el tesoro para ganar: ");

        while (!encontrado){
            j.mostrar();

            System.out.println("elige una fila (1-3): ");
            int f = sc.nextInt();
            System.out.println("Elige una columna (1-3): ");
            int c = sc.nextInt();

            if (f < 1 || f > 3 || c < 1 || c > 3) {
                System.out.println("Coordenadas fuera de rango. Inténtalo de nuevo.");
                continue;
            }
            String contenido = j.ElegirHabitacion(f,c);
            System.out.println("Has descubierto " + contenido);

            if (contenido.equalsIgnoreCase("Tesoro")){
                System.out.println("Felicidades, has encontrado un Tesoro");
                encontrado = true;
            }
        }
        sc.close();
    }
}
