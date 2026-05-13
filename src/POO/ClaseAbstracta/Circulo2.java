package POO.ClaseAbstracta;



/*
Clase que implementa la clase abstracta Punto
Para que no falle implementar un metodo abstracto de la clase padre
O convertir esta clase en abstracta (pero no te deja instanciar objetos)
Clase Abstracta: Es el "Padre" que da la herencia (atributos y estructura).
 */
public class Circulo2 extends Punto2 implements Perimetro, Area{

    private double radio;
    public Circulo2(int x, int y, double radio){
        super(x,y);
        this.radio = radio;

    }
    public double getRadio() {

        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }


    public String toString(){
        return super.toString() + ", radio = " + radio;
    }


    @Override
    public double calcular_perimetro() {
        return 0;
    }
}
