package POO.ClaseAbstracta;

public class Cilindro extends Circulo2 implements  Area, Perimetro, Volumen{
    private double h;

    public Cilindro(int x, int y, double h, double r) {

        super(x, y,r);
        this.h = h;

    }

    @Override
    public double calcularArea() {
        return 2*PI*this.getRadio()*(h+this.getRadio());
    }

    @Override
    public double calcular_volumen() {
        return PI*Math.pow(2, this.getRadio())*h;
    }


    public static void main(String[] args) {
        Cilindro c1 = new Cilindro(2,3,4,5);
        System.out.println(c1.calcular_perimetro());
        System.out.println(c1.calcularArea());
        System.out.println(c1.calcular_volumen());
    }
}
