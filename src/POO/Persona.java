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
    /*
    Declaracion de constructores
    - Se puede tener más de 1 constructor
    - Los contructores pueden tener diferentes parametros de inicio
    - Los constructores no pueden tener menos o mas propiedades de las que se han declarado
    * */
    /*
    public Persona(){
        nombre = "";
        dni = "00000000T";
        edad = 0;
    }
*/


    public Persona(String nombre, String dni, int edad){
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




    }
    /*
    * Encapsulamiento
    * Declaracion de getters y setters
    * */

    public void setNombre(String Nombre){
        this.nombre = Nombre;
    }
}

