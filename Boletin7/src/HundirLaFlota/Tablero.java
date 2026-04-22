package HundirLaFlota;

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
    public int comprobar_impacto(int x, int y){
        if (x < 0 || x >= 4 || y < 0 || y >= 4){
            System.out.println("Fuera del tablero");
            return 0;

        }
        Barco barco = this.tablero[x][y];

        if (barco == null){

            return 0;
            
        } else {
            return barco.Recibir_Disparo();
            System.out.println("Impacto al barco " +" " + barco.getNombre() + " en las coordenadas" + " " + x + " , " + y);

            if (resultado.equals("TOCADO")){
                return 1;
            }else {
                return 3;
            }
            
        }

    }
    public void mostrar(){
        System.out.println(" 0 1 2 3");
        for (int i = 0; i < tamano; i++){
            System.out.print(i + " ");
            for (int j = 0; j < tamano; j++){
                Barco b = this.tablero[i][j];

                if(b == null){
                    System.out.print("- ");

                }else{
                    System.out.print("B ");
                }
            }
            System.out.println();
        }

    }

}
