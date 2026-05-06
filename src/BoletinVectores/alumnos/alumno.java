package BoletinVectores.alumnos;

public class alumno {

    private String nombre;
    private String apellido;
    private int edad;
    private double nota;



    public alumno(String nombre, String apellido, int edad, double nota){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
    }
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
        public String toString(){
            return ("Nombre: " + this.getNombre() + "\n" + "Apellido: " + this.getApellido() + "\n" + "Edad: " + this.getEdad() + "Nota: " + this.getNota());
        }
}
