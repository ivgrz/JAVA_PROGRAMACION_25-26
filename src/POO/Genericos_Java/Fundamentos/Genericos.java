package POO.Genericos_Java.Fundamentos;

import java.util.ArrayList;

/**
 * Permite definir un parametro de tipo "indefinido"
 * Los parametros se especifican usando <T>, es un marcador para cualquier tipo de dato
 * No valen tipos primitivos
 */
public class Genericos{
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        //lista.add("Texto");
        // Error en compilacion
        String texto = lista.get(0);
        // No se necesita casting
        System.out.println(texto);
    }
    
}
