package POO.ClaseAbstracta;

public abstract class Punto {

    private int x;
    private int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;


    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
    @Override
    public String toString(){
        return "Coordenadas del punto: " +"( " + getX() + " , " + getY() + " )";
    }

    public static void main(String[] args) {

    }

}
