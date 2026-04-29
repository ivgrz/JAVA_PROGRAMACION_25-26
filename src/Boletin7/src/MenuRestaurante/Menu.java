package Boletin7.src.MenuRestaurante;

import java.util.Scanner;

/**
 * Dado un menú dun restaurante, con varios primeiros pratos, segundos e sobremesas:
 * Crear a función que permita mostrar o menú os comentáis.
 * Deseñar a función que Permita o usuario facer un pedido  devoltanto o resultado nun array con primeiro, segundo e sobremesa.
 */
public class Menu {
    private String[] primeros;
    private String[] segundos;
    private String[] Sobremesa;



    public Menu(){
        this.primeros = new String[]{"Ensalada", "Sopa", "Pasta"};
        this.segundos = new String[]{"Parrilla","Pollo asado","Hamburguesa"};
        this.Sobremesa = new String[]{"Yogur","Fruta","Flan"};
    }
    public void mostrarmenu(){
        System.out.println("--- MENU DEL DIA ---");
        System.out.println("Primeros: ");
        for (int i = 0; i < primeros.length; i++){
            System.out.println(i+1 + ". " + primeros[i]);

        }
        System.out.println("Segundos: ");
        for (int i = 0; i < segundos.length; i++){
            System.out.println(i+1 + ". " + segundos[i]);
        }
        System.out.println("Sobremesa: ");
        for (int i = 0; i < Sobremesa.length; i++){
            System.out.println(i+1 +". " + Sobremesa[i]);
        }


    }
    public String[] hacerpedido(){
        Scanner sc = new Scanner(System.in);
        String[] pedido = new String[3];

        System.out.println("\n Elige tu primer plato(numero): ");
        pedido[0] = primeros[sc.nextInt() -1];

        System.out.println("\n Elige tu segundo plato(numero): ");
        pedido[1] = segundos[sc.nextInt() -1];

        System.out.println("\n Elige la sobremesa (numero): ");
        pedido[2] = Sobremesa[sc.nextInt() -1];

        return pedido;
    }

    public void setPrimeros(String[] primeros) {
        this.primeros = primeros;
    }

    public void setSegundos(String[] segundos) {
        this.segundos = segundos;
    }

    public void setSobremesa(String[] sobremesa) {
        Sobremesa = sobremesa;
    }
    public String[] getPrimeros() {
        return primeros;
    }

    public String[] getSegundos() {
        return segundos;
    }

    public String[] getSobremesa() {
        return Sobremesa;
    }

}
