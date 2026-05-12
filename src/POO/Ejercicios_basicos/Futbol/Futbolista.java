package POO.Ejercicios_basicos.Futbol;

import POO.Ejercicios_basicos.Persona;
import java.util.Comparator;

public class Futbolista extends Persona{

    private int numero_goles;

    public Futbolista(String nombre, String dni, int edad, double altura, int numero_goles){
        super(nombre, dni, edad, altura);
        this.numero_goles = numero_goles;
    }

    @Override
    public int compareTo(Persona otra){
        return this.dni.compareTo(otra.dni);
    }


    @Override
    public boolean equals(Object otra) {
        Futbolista otrapersona = (Futbolista) otra;
        if (this.dni.equals(otrapersona.dni)) return true;
        return false;
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
}
