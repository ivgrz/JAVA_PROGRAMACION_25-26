package POO;

public class Trabajador extends Persona{
    public double salario;
    public String talla;

    public Trabajador(String nombre, String dni, int edad, double salario, double estatura, String talla ){
        super(nombre, dni, edad, estatura);
        this.salario = salario;
        this.talla = talla;
    }
    public void mostrardatos(){
        super.mostrardatos();
        System.out.println("Salario: " + salario);
        System.out.println("Talla " + talla);


    }

    @Override
    public boolean equals(Object otro){
        Trabajador otrotrabajador = (Trabajador) otro;
        if (this.talla.equals(otrotrabajador.talla)) return true;
        else return false;
    }

    public static void main(String[] args) {
        Persona p = new Persona("Pepe","1111H",37, 1.81);
        Trabajador t = new Trabajador(p.nombre, p.dni, p.edad, 2500,p.estatura, "M");
        Persona personas [] = new Persona[2];
        personas[0] = p;
        personas[1] = t;
        Persona untrabajador = t;
        Trabajador otrot = new Trabajador("Juan","2222J",46,2700,1.81,"XL");
        System.out.println("Ejemplo trabajador...");
        System.out.println(personas[1].estatura);
        System.out.println(untrabajador.estatura);
        System.out.println(t.estatura);
        untrabajador.mostrardatos();
        t.mostrardatos();
        if(otrot == untrabajador) System.out.println("Son iguales");
        else System.out.println("Son distintos");
    }
}
