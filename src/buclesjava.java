import java.util.Scanner;

public class buclesjava {
    public static void main (String[] args) {


        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("Elige una opcion");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Salir");
            String op = teclado.nextLine();
        }
    }
}
