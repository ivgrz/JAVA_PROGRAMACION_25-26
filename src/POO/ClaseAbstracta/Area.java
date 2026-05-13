package POO.ClaseAbstracta;

public interface Area {
    double PI = Math.PI;
    default double calcularArea(){
        return 0;
    }
}
