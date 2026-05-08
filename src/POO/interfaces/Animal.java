package POO.interfaces;



interface Son{
    //La interfaz es el "Manual de Instrucciones" que da habilidades (acciones obligatorias).
    void voz();
    default void dormir(){
        System.out.println("zzz...");
    }
    static void bostezo(){
        System.out.println("*Bosteza*");

    }
}
interface viviparo{
    boolean viviparo = true;
}


public class Animal implements Comparable<Animal> {
    int numpatas;
    String tespecie;
    String tnombre;

    public Animal(String especie, String nombre, int patas){
        numpatas = patas;
        tespecie = especie;
        tnombre = nombre;

    }
    public static void RascarConPata(){
        System.out.println("(Rascando...)");
    }

    public String toString(){
        return "Especie: " + this.tespecie + "\n" + "Nombre: " + this.tnombre + "\n" + "Cantidad de patas: " + numpatas;
    }

    @Override
    public int compareTo(Animal otro) {
        if (this.numpatas < otro.numpatas) return -1;
        else if (this.numpatas > otro.numpatas) return 1;
        else return 0;

    }
}


