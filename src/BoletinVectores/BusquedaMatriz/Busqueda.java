package BoletinVectores.BusquedaMatriz;

/**
 *  5. Escribir a función que permita facer a búsqueda dun elemento nunha matriz, devoltando o índice de onde está situado.
 *  A función recibirá a matriz e o valor do elemento como parámetros. Si o elemento existe na matríz devoltará o índice da súa posición, senón devoltará un valor -1.
 * Nota: a matriz e o valor poden ser de calquera tipo.
 */
public class Busqueda {
    public static <T> int buscarElemento(T []  matriz, T valor_elemento){
        for(int i = 0; i < matriz.length; i++){
            if (matriz[i].equals(valor_elemento)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] nombres = {"Ana", "Pepe", "Luis"};
        System.out.println("Posicion de Pepe: " + buscarElemento(nombres,"Pepe"));

        Integer[] numeros = {2,4,3,6};
        System.out.println("Posicion del numero: " + buscarElemento(numeros, 6));
    }

}
