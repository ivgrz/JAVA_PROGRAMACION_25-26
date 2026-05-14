package POO.Ejercicios_basicos.Futbol;

import POO.Comparable_Comparator.Persona2;
import POO.Ejercicios_basicos.Persona;

import java.util.ArrayList;
import java.util.Comparator;

public class Futbolista extends Persona2 {

    private int numero_goles;

    public Futbolista(String nombre, String dni, int edad, double altura, int numero_goles){
        super(nombre, dni, edad, altura);
        this.numero_goles = numero_goles;
    }


    public static Comparator<Futbolista> GolesComparator = new Comparator<Futbolista>() {
        @Override
        public int compare(Futbolista f1, Futbolista f2) {
            return Integer.compare(f1.getNumero_goles(), f2.getNumero_goles());
        }
    };

    public static Comparator<Futbolista> NombreComparator = new Comparator<Futbolista>() {
        @Override
        public int compare(Futbolista f1, Futbolista f2) {
            return f1.nombre.compareTo(f2.nombre);
        }
    };

    public int getNumero_goles() {
        return numero_goles;
    }
    public void setNumero_goles(int numero_goles) {
        this.numero_goles = numero_goles;
    }
    public String toString(){
        return super.toString()+ ", " + numero_goles;
    }

    public static void main(String[] args) {
        Futbolista[] equipo = new Futbolista[5];
        equipo[0] = new Futbolista("Kylian Mbappé", "111M", 25, 1.78, 300);
        equipo[1] = new Futbolista("Neymar Jr", "222N", 32, 1.75, 400);
        equipo[2] = new Futbolista("Lionel Messi", "333L", 36, 1.70, 800);
        equipo[3] = new Futbolista("Cristiano Ronaldo", "444C", 39, 1.87, 850);
        equipo[4] = new Futbolista("Lamine Yamal", "555Y", 16, 1.78, 10);


        ArrayList equipo2 = new ArrayList();
        equipo2.add(equipo[1]);
        equipo2.add("Celta");

        for (Futbolista f : equipo){
            System.out.println("Futbolista: " + f);
        }
        for (int i = 0; i < equipo.length; i++){
            System.out.println("Futbolista: " + equipo[i]);
        }



    }
}
