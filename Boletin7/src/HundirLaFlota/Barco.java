package HundirLaFlota;

public class Barco {
    String nombre;
    int vida;


    public Barco(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;



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
    public String Recibir_Disparo(){
        restar_vida();
        if (vida > 0){
            return "TOCADO";
        }else{
            return "HUNDIDO";
        }

    }
    public String toString(){
        return (nombre + " " + vida);
    }
}
