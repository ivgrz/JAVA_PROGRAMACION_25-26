package POO;

public class MiembroComunidadEscolar extends Persona{
    private int codigocentro;
    private String nombrecentro;

    // En herencia las propiedades de la clase padre también deben estar definidas en el constructor
    public MiembroComunidadEscolar(String nombre, String dni, int edad,int codcentro, double estatura, String nomcentro){
        super(nombre, dni, edad, estatura);
        this.codigocentro = codcentro;
        this.nombrecentro = nomcentro;
    }
    public String getNombrecentro() {

        return nombrecentro;
    }

    public void setNombrecentro(String nombrec) {
        if (nombrec != null) {
            this.nombrecentro = nombrec;
        }else nombrecentro = "";
    }


        // Forma del getter
        public int getCodigocentro(){

            return this.codigocentro;
        }
        // Forma del setter
        public void setCodigocentro(int codc){

            if (codc > 0) codigocentro = codc;
            else codigocentro = 0;

        }

}
