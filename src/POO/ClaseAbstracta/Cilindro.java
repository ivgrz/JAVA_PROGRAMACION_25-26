package POO.ClaseAbstracta;

public class Cilindro extends Punto2 implements  Area, Perimetro, Volumen{
    private double h;
    private double r;
    public Cilindro(int x, int y, double h, double r) {

        super(x, y);
        this.h = h;
        this.r = r;
    }

    @Override
    public double calcularArea() {
        return 2*PI*r*(h+r);
    }

    @Override
    public double calcular_volumen() {
        return PI*Math.pow(2,r)*h;
    }

    @Override
    public double calcular_perimetro() {
        return 2 * PI * r;
    }

    public static void main(String[] args) {
        Cilindro c1 = new Cilindro(2,3,4,5);
        System.out.println(c1.calcular_perimetro());
        System.out.println(c1.calcularArea());
        System.out.println(c1.calcular_volumen());
    }
}
