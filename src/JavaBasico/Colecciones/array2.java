package JavaBasico.Colecciones;

import java.util.ArrayList;

public class array2 {
    public static void main(String[] args) {

        ArrayList<String> nomes;
        nomes = new ArrayList();
        nomes.add("Jaime");
        nomes.add("Gustavo");
        nomes.add("Alicia");
        nomes.add("Jose");
        nomes.add(2,"Paco");
        System.out.println(nomes);
        String str = nomes.get(0);
        System.out.println(str);
        nomes.remove(0);
        nomes.remove(nomes.size()-1); // Resta al length total del array
        nomes.remove("Gustavo");
        System.out.println(nomes);
    }
    
}
