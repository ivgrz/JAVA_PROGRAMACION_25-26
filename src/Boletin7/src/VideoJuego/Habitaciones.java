package Boletin7.src.VideoJuego;

public class Habitaciones {
    private String[][] mapaOculto;
    private String[][] mapaVisible;
    private int tamano = 3;

    public Habitaciones(){
        this.mapaOculto = new String[tamano][tamano];
        this.mapaVisible = new String[tamano][tamano];
        for (int i = 0; i < tamano; i++){
            for (int j = 0; j < tamano; j++){
                mapaOculto[i][j] = "Vacio";
                mapaVisible[i][j] = "-----";
            }
        }
        mapaOculto[0][2] = "Tesoro";
        mapaOculto[1][0] = "Entrada";
        mapaOculto[2][1] = "Trampa";

    }
    public void mostrar(){
        for (int i = 0; i < tamano; i++){
            for(int j = 0; j < tamano; j++){
                System.out.print(mapaVisible[i][j] + "\t");
            }
            System.out.println();
        }

    }
    public String ElegirHabitacion(int fila, int col){

        int f = fila - 1;
        int c = col - 1;
        mapaVisible[f][c] = mapaOculto[f][c];
        return mapaVisible[f][c];

    }

}
