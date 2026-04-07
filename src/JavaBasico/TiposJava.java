package JavaBasico;

import java.util.Scanner;

public class TiposJava {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // ===== TIPOS BÁSICOS DE JAVA =====

        // 1. byte (8 bits, -128 a 127)
        byte edad = 25;
        System.out.println("byte - edad: " + edad);

        // 2. short (16 bits, -32768 a 32767)
        short año = 2026;
        System.out.println("short - año: " + año);

        // 3. int (32 bits, -2147483648 a 2147483647)
        int poblacion = 1000000;
        System.out.println("int - población: " + poblacion);

        // 4. long (64 bits, números muy grandes)
        long numeroGrande = 9223372036854775807L;
        System.out.println("long - número grande: " + numeroGrande);

        // 5. float (decimales de 32 bits, menos precisión)
        float precio = 19.99f;
        System.out.println("float - precio: " + precio);

        // 6. double (decimales de 64 bits, más precisión)
        double pi = 3.14159265359;
        System.out.println("double - pi: " + pi);

        // 7. boolean (verdadero o falso)
        boolean activo = true;
        System.out.println("boolean - activo: " + activo);

        // 8. char (un carácter)
        char inicial = 'J';
        System.out.println("char - inicial: " + inicial);

        // 9. String (cadena de texto - NO es tipo básico, es una clase)
        String nombre = "Juan";
        System.out.println("String - nombre: " + nombre);

        System.out.println("\n===== SWITCH CASE =====\n");

        // ===== SWITCH CASE =====

        System.out.println("Elige un número del 1 al 4:");
        int opcion = teclado.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("Elegiste la opción 1: Saludar");
                System.out.println("¡Hola! Me llamo " + nombre);
                break;

            case 2:
                System.out.println("Elegiste la opción 2: Mostrar edad");
                System.out.println("Mi edad es: " + edad + " años");
                break;

            case 3:
                System.out.println("Elegiste la opción 3: Operación matemática");
                double resultado = precio * 2;
                System.out.println(precio + " * 2 = " + resultado);
                break;

            case 4:
                System.out.println("Elegiste la opción 4: Despedirse");
                System.out.println("¡Adiós!");
                break;

            default:
                System.out.println("Opción no válida. Elige entre 1 y 4");
        }

        teclado.close();
    }
}
