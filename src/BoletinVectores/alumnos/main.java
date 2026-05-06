package BoletinVectores.alumnos;

public class main {
    public static void main(String[] args) {
        alumnos_programacion dam = new alumnos_programacion();
        alumno lista[] = new alumno[30];
        lista[0] = new alumno("Juan","Perez",20, 6.5);
        lista[1] = new alumno("Bruno","Lopez",21,7.2);
        lista[2] = new alumno("Pedro","Mendez",26,3.5);
        lista[3] = new alumno("Sofia","Rodriguez",19,8);
        lista[4] = new alumno("Pepe","Sanchez",23,2.3);


        dam.setAlumnado(lista);
        dam.analizar_notas();




    }
}
