package BoletinVectores.BusquedaTabla;

/**
 * 6. Escribir a función que permita facer a búsqueda nunha táboa ordeada.
 * Deseñar o algorítmo que permita facer esa búsqueda no menor número de ciclos, optimizando o tempo de búsqueda.
 * A función recibirá a matriz e o valor do elemento como parámetros. Si o elemento existe na matríz devoltará o índice da súa posición, senón devoltará un valor -1.
 * Nota: a matriz e o valor poden ser de calquera tipo.
 *
 *
 */
public class BusquedaT {

    public static <T extends Comparable<T>> int[] BuscarElemento(T[][] matriz, T valor_buscado){
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0){
            return new int[]{-1,-1};
        }
        int filas = matriz.length;
        int columnas = matriz[0].length;

        int inicio = 0;
        int fin = (filas * columnas) - 1;

        while (inicio <= fin){
            int medio = inicio + (fin - inicio)/2;

            int f = medio/columnas;
            int c = medio%columnas;

            int comparacion = valor_buscado.compareTo(matriz[f][c]);

            if(comparacion == 0)return new int[]{f,c}; //He encontrado el objetivo.
            // Aquí tienes las coordenadas de la fila (f) y la columna (c) donde estaba guardado". El programa se detiene aquí porque ya terminó su trabajo.
            if (comparacion < 0)fin = medio-1; // Olvida toda la parte derecha de la tabla.
                // Mi nuevo límite del final es ahora una posición antes del medio (objetivo menor que el punto medio)". Acabas de descartar la mitad de la tabla de un solo golpe.
            else inicio = medio+1;//Olvida toda la parte izquierda. Mi nuevo punto de inicio es ahora una posición después del medio (objetivo mayor que el punto medio)

        }
        return new int[]{-1,-1};





    }

    public static void main(String[] args) {
        Integer[][] mitabla = {
                {10,20,30},{40,50,60},{70,80,90}
        };

        Integer objetivo = 50;
        int[] pos = BuscarElemento(mitabla,objetivo);

        if(pos[0] != -1){
            System.out.println("Elemento " + objetivo + " encontrado en: " + "( " + pos[0] + " , " + pos[1] + " )");

        }else{
            System.out.println("No se encontro el elemento...");
        }
    }

}
