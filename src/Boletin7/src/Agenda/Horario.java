package Boletin7.src.Agenda;

public class Horario {
    private String[][] agenda;
    private String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes"};
    private String[] horas = {"08:00","09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00"};

    public Horario(){
        this.agenda = new String[dias.length][horas.length];
        for (int i = 0; i <agenda.length; i++){
            for (int j = 0; j <agenda[i].length; j++){
                agenda[i][j] = "---";
            }
        }


    }
    public void mostrar(){
        System.out.printf("%-10s" , "Hora | ");
        for (String dia: dias){
            System.out.printf("%-12s",dia + "\t");

        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        for (int j = 0; j < horas.length; j++ ){
            System.out.printf("%-10s",horas[j] + " | ");
            for (int i = 0; i < dias.length; i++){
                System.out.printf("%-12s",agenda[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public void setActividad(String nombredia, String hora, String actividad){
        int diaId = -1;
        int horaId = -1;

        for (int i = 0; i < dias.length; i++){
            if (dias[i].equalsIgnoreCase(nombredia)) diaId = i;
        }
        for (int j = 0; j < horas.length; j++){
            if (horas[j].equals(hora)) horaId = j;
        }
        if (diaId != -1 && horaId != -1){
            agenda[diaId][horaId] = actividad;
            System.out.println("Actividad actualizada");
        }else{
            System.out.println("ERROR: Dia o hora no encontrada");
        }

    }
}
