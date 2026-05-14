package POO.Comparable_Comparator;

import POO.Ejercicios_basicos.Persona;

import java.util.Arrays;

/*
Las clases pueden ser "public" "private" y "protected" (sin especificar, ej. "class Persona")
Si se declara "private" no se puede usar desde fuera
*/
public class Persona2 implements Comparable<Persona2>{
    /*
    Declaracion de propiedades
     */
    public String nombre;
    public String dni;
    public int edad;
    public double estatura;
    /*
    Declaracion de constructores
    - Se puede tener más de 1 constructor
    - Los contructores pueden tener diferentes parametros de inicio
    - Los constructores no pueden tener menos o mas propiedades de las que se han declarado
    * */


    public Persona2(String nombre, String dni, int edad, double estatura){
        // En JAVA no se necesita "this" necesariamente
        // Hacerlo asi también funciona -->
        /*
        nombre = n;
        dni = d;
        edad = e;
        */
        // this = self


        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.estatura = estatura;




    }

    public Persona2(){
        nombre = "Alberto";
        dni = "00000000T";
        edad = 60;
    }



    /*
    * Encapsulamiento
    * Declaracion de getters y setters
    * */

    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }

    @Override
    public boolean equals(Object otra){
        Persona2 otrapersona = (Persona2) otra;
        if (this.estatura == otrapersona.estatura) return true;
        else return false;
    }

    public void mostrardatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);


    }



    public String toString(){
        return "Nombre: " + this.nombre + "\t" + "DNI: " + this.dni + "\t" + "Edad: " + this.edad + "\t" + "Estatura: " + this.estatura ;
    }

    @Override
    public int compareTo(Persona2 otra) {
        /*int resultadoCom = this.dni.compareTo(otra.dni);
        System.out.println(resultadoCom);
        if (resultadoCom > 0) return 1;// si lo comparado es "mayor" que el que tenemos debe devolver algo > 0
        else if (resultadoCom < 0) return -1;// Si lo comparado es "menor" que el que tenemos debe devolver algo < 0
        return 0;
        */
         return this.dni.compareTo(otra.dni);

    }

    public static void main(String[] args) {

        Persona2 p = new Persona2("Pedro", "56759F", 50, 1.80);
        Persona2 p1 = new Persona2("Manuel", "4455U", 45, 1.76);
        Persona2 p2 = new Persona2();
        System.out.println(p1.nombre);
        System.out.println(p2.nombre);
        Persona2 p3 = new Persona2("Pepe", "4567H",35,1.70);
        System.out.println(p1.compareTo(p3));
        ComparadorEdadesPersona comparadoredad = new ComparadorEdadesPersona();
        System.out.println(comparadoredad.compare(p1,p3));
        Persona2[] individuos = new Persona2[3];
        individuos[0] = p;
        individuos[1] = p1;
        individuos[2] = p3;
        System.out.println(Arrays.toString(individuos));
        Arrays.sort(individuos);
        System.out.println(Arrays.toString(individuos));
        Arrays.sort(individuos, comparadoredad);
        System.out.println(Arrays.toString(individuos));

    }
}

