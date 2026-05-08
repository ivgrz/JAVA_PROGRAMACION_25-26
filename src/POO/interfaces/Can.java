package POO.interfaces;


public class Can extends Animal implements Son, viviparo{
    // La clase concreta es el "Resultado Final" que une todo y se puede usar en el main.
        public Can(String especie, String nombre, int patas){
            super(especie, nombre, patas);

        }

        public void voz(){
            System.out.println("Guau guau");
        }
        public String toString(){
            return super.toString();
        }

    public static void main(String[] args) {
        Can c = new Can("Perro","Max",4);
        Can s = new Can("Gallina","Paca",2);
        Animal a = new Animal("Araña","tito",8);
        System.out.println(Can.viviparo);
        c.dormir();
        Animal.RascarConPata();
        Son.bostezo();
        System.out.println(c);
        System.out.println(c.compareTo(s));// indica que can tiene mas patas (+)
        System.out.println(c.compareTo(a));// indica que la araña tiene mas patas (-)
    }
}
