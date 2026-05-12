package POO.Genericos_Java.Fundamentos;

/**
 * Ejemplo de la estructura base de las clases genericas
 */
public class Cosa<T> {
    private T contenido;

    public Cosa(T contenido){
        this.contenido = contenido;
    }
    public T obtener_contenido(){
        return contenido;
    }
    public void mostrar_contenido(){
        System.out.println("Contenido: " + contenido);
    }

}
