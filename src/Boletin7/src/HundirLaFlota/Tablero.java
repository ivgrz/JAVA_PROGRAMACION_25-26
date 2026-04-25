package Boletin7.src.HundirLaFlota;

public class Tablero {
    private Barco[][] tablero;
    public int tamano = 4;

    public Tablero(){
        tablero = new Barco[tamano][tamano];
        inicializarTablero();


    }

    private void inicializarTablero(){
        for(int i = 0; i < tamano; i++){
            for(int j = 0; j < tamano; j++){
                tablero[i][j] = null ;
            }
        }
    }

    public void colocar_barco(int x, int y,  Barco barco){
        if (x >= 0 && x < 4 && y >= 0 && y < 4){

            this.tablero[x][y] = barco;
        }else{
            System.out.println("Coordenadas fuera de rango");
        }

    }
    public double comprobar_impacto(int x, int y){
        if (x < 0 || x >= 4 || y < 0 || y >= 4){
            System.out.println("Fuera del tablero");
            return 0;


        }
        Barco barco = this.tablero[x][y];

        if (barco == null){

            return 0;
            
        } else {
            if (barco.esta_hundido()){
                System.out.println("El barco ya esta hundido");
                return 0;

            }
            Double puntos = barco.Recibir_Disparo();
            System.out.println("Impacto al barco " +" " + barco.getNombre() + " en las coordenadas" + " " + x + " , " + y);
            return puntos;
            
        }

    }
    public void mostrar(){
        System.out.println(" 0 1 2 3");
        for (int i = 0; i < tamano; i++){
            System.out.print(i + " ");
            for (int j = 0; j < tamano; j++){
                Barco b = this.tablero[i][j];

                if(b == null) {
                    System.out.print("~ ");

                }
                else if (b.esta_hundido()) {
                    System.out.print("X ");

                } else if (b.esta_tocado()) {
                System.out.print("T ");
            }
            else {
                    System.out.print(b.getNombre().charAt(0) + " ");
                }

            }
            System.out.println();
            }

    }

}
