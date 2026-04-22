package HundirLaFlota;

public class Barco {
    private String nombre;
    private int vida;
    private int vidainicial;

    public Barco(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
        this.vidainicial = vida;



    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


    public int restar_vida(){
        vida -= 1;
        return vida;
    }
    public double Recibir_Disparo(){
        restar_vida();
        if (vida == 0){
            System.out.println(nombre + "¡HUNDIDO!");
            return 1.5;
        } else if (vida == vidainicial/2) {
            System.out.println(nombre + " a la mitad de vida!");
            return 1;

        }else
        {
            System.out.println("Disparo efectivo a " + nombre);
            return 1;
        }

    }
    public String toString(){
        return (nombre + " " + vida);
    }
}
