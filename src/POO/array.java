package POO;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        // Uso de arrays
        String[] nombres;
        nombres = new String[10];
        nombres[0] = "Hugo";
        nombres[1] = "Pedro";
        nombres[2] = new String("Ana");

        Persona[] equipo;
        equipo = new Persona[5];
        equipo[0] = new Persona("Pablo", "Y243525", 45,1.80);
        equipo[1] = new Persona("Jose", "A65249", 20,1.70);
        equipo[2] = new Persona("Carmen", "B75767", 30,1.73);
        equipo[3] = new Persona("Tina", "D12345", 17,1.82);
        equipo[4] = new Persona("Pili", "F35212", 22,1.81);
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


        System.out.println("--------------- METODOS DE ARRAYS ------------------");


        int[] edad = {25,27,28,22,24,29};
        Arrays.sort(edad);
        System.out.println(Arrays.toString(edad));

        System.out.println("--------------- COPIA DUPLICADOS--------------------");

        int[] t = {1,2,2,2,4,4,5,7,8,9};
        int[] temporal = new int[t.length];
        int k = 0;


        for (int i = 0; i < t.length; i++){
            for (int j = i + 1; j < t.length; j++){
                if (t[i] == t[j]){
                    boolean enlista = false;
                    for (int m = 0; m < k; m++){
                        if (temporal[m] == t[i]){
                            enlista = true;
                            break;
                        }
                    }
                    if (!enlista){

                        temporal[k] = t[i]; // Escribo el número en el hueco k
                        k++; // Muevo el "dedo" o indice al siguiente hueco

                    }
                    break;
                }

            }


        }
        int [] t2 = Arrays.copyOf(temporal,k);

        System.out.println("Original: " + Arrays.toString(t));
        System.out.println("Repetidos: " + Arrays.toString(t2));

        System.out.println("------------------- SEGUNDO EJEMPLO (BinarySearch)--------------");

        int[] tp = {1,2,4,3,6,7,8,6,4,2};
        int[] copia = Arrays.copyOf(tp, tp.length);
        Arrays.sort(copia);

        int[] temp = new int[tp.length];
        int s = 0;


        for (int i = 0; i < copia.length - 1; i++){
            if (copia[i] == copia[i+1]){
                if (k == 0 || Arrays.binarySearch(temp, 0,k, copia[i]) < 0 ){
                    temp[k] = copia[i];
                    k++;
                }
            }

        }




    }
}
