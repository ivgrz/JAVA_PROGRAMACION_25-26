package POO.HORAS;

public class Horas {
    int horas;
    int minutos;
    int segundos;

    public Horas(){
        horas = 0;
        minutos = 0;
        segundos = 0;
        inicializarACero();

    }
    // Este constructor verifica los valores
    public Horas(int horas, int minutos, int segundos){
        if (horas >= 0) this.horas = horas;
        else this.horas = 0;
        if (minutos < 60 && minutos >= 0) this.minutos = minutos;
        else this.minutos = 0;
        if (segundos > 60 && minutos >= 0) this.segundos = segundos;
        else this.segundos = 0;

    }
    public void main (String[] args){
        Horas h = new Horas(15,30,25);
        System.out.println(h);
    }
    public Horas (String hora){
        if (hora.length() != 8){
            System.out.println("Longitud incorrecta");
            inicializarACero();
        }
        else {
            if (hora.charAt(2) == ':' && hora.charAt(5) == ':'){
                System.out.println("bien");
            }
        }
    }
    private void inicializarACero(){
        horas = 0;
        minutos = 0;
        segundos = 0;


    }

    // metodo magico __str__ de python
    public String toString(){
        return "Hora: " + horas + ", minutos: "+ minutos + ", segundos: " + segundos;
    }

}
