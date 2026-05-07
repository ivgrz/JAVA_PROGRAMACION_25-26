package POO.interfaces;


public class Can extends Animal implements Son{
    // La clase concreta es el "Resultado Final" que une todo y se puede usar en el main.
        public Can(int patas){
            super(patas);

        }

        public void voz(){
            System.out.println("Guau");
        }
}
