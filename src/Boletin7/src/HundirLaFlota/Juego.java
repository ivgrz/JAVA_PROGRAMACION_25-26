package Boletin7.src.HundirLaFlota;

public class Juego {
    private Tablero tablero;
    public Juego(){
        this.tablero = new Tablero();
        inicializar_naves();

    }
    public void inicializar_naves(){
        System.out.println("Cargando barcos...");

        Barco b1 = new Barco("Crucero",6);
        Barco b2 = new Barco("Buque",8);
        Barco b3 = new Barco("Lancha",4);
        Barco b4 = new Barco("Pesquero",2);

        tablero.colocar_barco(3,2,b1);
        tablero.colocar_barco(1,1,b2);
        tablero.colocar_barco(0,2,b3);
        tablero.colocar_barco(1,3,b4);

    }
    public void mostrar_resultado(double resultado){
        if (resultado == 0){
            System.out.println("Agua");
        } else if (resultado == 1.0) {
            System.out.println("Tocado");

        } else if (resultado == 1.5) {
            System.out.println("Hundido");

        }
        else {
            System.out.println("ERROR de disparo");
        }

    }
    public void disparo(int x, int y){
        System.out.println("Disparando en " + " " + "( " + x + " , " + y + " )");
        double res = tablero.comprobar_impacto(x, y);
        mostrar_resultado(res);
        tablero.mostrar();
    }
}
