package BoletinVectores.alumnos;

/**
 * 2- Carga un array de tipo int, coas notas do módulo de programación, dos 30 alumnos da clase de DAM .
 * Visualiza o numero de 	aprobados e o de suspensos.
 * Calcula e visualiza a nota media da clase.
 * Visualiza a nota mais alta.
 *
 */
public class alumnos_programacion {
    private alumno alumnado[];



    public alumnos_programacion(){
        this.alumnado = new alumno[5];
    }
    public void setAlumnado(alumno[] lista) {
        this.alumnado = lista;

    }

    public void analizar_notas(){
        int aprobados = 0;
        int suspensos = 0;
        double sumanotas = 0;
        double NotaMasAlta = 0;
        int alumnosreales = 0;

        for (int i = 0; i < alumnado.length; i++){
            if(alumnado[i] != null){
                double notaActual = alumnado[i].getNota();
                sumanotas += notaActual;
                if (notaActual < 0 || notaActual > 10) {
                    System.out.println("Nota  de alumno " + alumnado[i].getNombre() + "no valida");
                    continue;}
                alumnosreales++;
                sumanotas++;

                if (notaActual >= 5){
                    System.out.println("Alumno: " + alumnado[i].getNombre() + " " + alumnado[i].getApellido() + " Aprobado" + "\n" + "Nota: " + alumnado[i].getNota());
                    aprobados++;
                } else {
                         System.out.println("Alumno: " + alumnado[i].getNombre() +" " + alumnado[i].getApellido() + " Suspenso" + "\n" + "Nota: " + alumnado[i].getNota());
                         suspensos++;
                     }
                if (notaActual > NotaMasAlta){
                         NotaMasAlta = notaActual;
                     }

                }


            }

        System.out.println("Numero de aprobados: " + aprobados);
        System.out.println("Numero de suspensos: " + suspensos);
        System.out.println("Nota media: " + (sumanotas/alumnosreales));
        System.out.println("Nota mas alta: " + NotaMasAlta);
        }

    }






