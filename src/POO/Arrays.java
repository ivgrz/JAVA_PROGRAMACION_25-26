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
        equipo[0] = new Persona("Pablo", "Y243525", 45);
        equipo[1] = new Persona("Jose", "A65249", 20);
        equipo[2] = new Persona("Carmen", "B75767", 30);
        equipo[3] = new Persona("Tina", "D12345", 17);
        equipo[4] = new Persona("Pili", "F35212", 22);
        // Calcular la media de la edad
        // Calcular numero de letras total de nombres
        // Encontrar el dni lexicograficamente menor
        int sumaedad = 0;

        for (int i = 0; i < equipo.length; i ++) {
            //Persona integrante = equipo[i];
            // Resolucion 1.
            sumaedad += equipo[i].edad;
        }
        // Resolucion 2
        int numero_letras_total = 0;
        for (int i = 0; i < equipo.length; i ++){
             numero_letras_total += equipo[i].nombre.length();
        }
        String dniMenor = equipo[0].dni;
        for (int i = 1; i < equipo.length; i ++){
            if (equipo[i].dni.compareTo(dniMenor) < 0){
                dniMenor = equipo[i].dni;
            }
        }
        System.out.println("La media de edades es: " + sumaedad/ equipo.length);
        System.out.println("La cantidad de letras totales son " + numero_letras_total);
        System.out.println("El DNI menor es: " + dniMenor);
    }
}
