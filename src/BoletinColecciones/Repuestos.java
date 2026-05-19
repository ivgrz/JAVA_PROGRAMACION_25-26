package BoletinColecciones;
/*
* Crear unha aplicación para xestionar as existencias dunha tenda de repostos de automóbiles. Cada produto identifícase por un código alfanumérico.
* A aplicación permitirá:
Dar de alta produtos.
Dar de baixa produtos.
Actualizar a cantidade de produtos.
Visualizar produtos e cantidades.
Os datos se manterán nun ficheiro, que se actualizará o pechar o programa.

* */
public class Repuestos {

    private int codigoA;
    private String nombreP;
    private int cantP;

    public Repuestos(int codigoA, String nombreP, int cantP){
        this.codigoA = codigoA;
        this.nombreP = nombreP;
        this.cantP = cantP;



    }


    public static void main(String[] args) {

    }

}
