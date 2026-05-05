package POO;
/*
Las clases pueden ser "public" "private" y "protected" (sin especificar, ej. "class Persona")
Si se declara "private" no se puede usar desde fuera
*/
public class Persona {
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


    public Persona(String nombre, String dni, int edad, double estatura){
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

    public Persona(){
        nombre = "persona1";
        dni = "00000000T";
        edad = 0;
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
        Persona otrapersona = (Persona) otra;
        if (this.estatura == otrapersona.estatura) return true;
        else return false;
    }

    public void mostrardatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);


    }
}

