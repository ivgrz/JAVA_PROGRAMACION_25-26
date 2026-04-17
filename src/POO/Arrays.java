package POO;

public class Arrays {
    public static void main(String[] args) {

        // Uso de arrays
        String[] nombres;
        nombres = new String[10];
        nombres[0] = "Hugo";
        nombres[1] = "Pedro";
        nombres[2] = new String("Ana");

        Persona[] equipo;
        equipo = new Persona[5];
        equipo[0] = new Persona("Pablo", "243525", 45);
        equipo[1] = new Persona("Jose", "65249", 20);
        equipo[2] = new Persona("Carmen", "75767", 30);
        equipo[3] = new Persona("Tina", "12345", 17);
        equipo[4] = new Persona("Pili", "35212", 22);
        // Calcular la media de la edad
        // Calcular numero de letras total de nombres
        // Encontrar el dni lexicograficamente menor
        int sumaedad = 0;

        for (int i = 0; i < equipo.length; i ++) {
            //Persona integrante = equipo[i];
            // Resolucion 1.
            sumaedad += equipo[i].edad;




        }
        System.out.println("La media de edades es: " + sumaedad/ equipo.length);
    }
}
