package Boletin7.src.MenuRestaurante;

public class main {
    public static void main(String[] args) {
        Menu m = new Menu();

        m.mostrarmenu();
        String[] miPedido = m.hacerpedido();

        System.out.println("---- RESUMEN DE PEDIDO ----");
        System.out.println("Primero: " + miPedido[0]);
        System.out.println("Segundo: " + miPedido[1]);
        System.out.println("Sobremesa: " + miPedido[2]);
        System.out.println("Provecho!");



    }
}
