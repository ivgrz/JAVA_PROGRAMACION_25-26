package BoletinColecciones.Meteorologia;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
* Crear a aplicación que simula o rexistro das temperaturas, o longo dun día, nunha estación meteorolóxica.
* A aplicación mostrará un menú coas opcións:
Novo rexistro (o introduciremos manualmente, ainda que se supón que o sistema debería estar automatizado).
Listar rexistros.
Mostar a estatística (cos valores máximo, mínimo e promedio das temperaturas rexistradas ata o momento dende a primeira lectura do dia.
Saír.
O sair, os datos se gardarán nun ficheiro binario, onde o nome estará composto pola cadea “rexistros” concatenada coa data do día no formato “yyyyMMdd” e extensión “.dat”.
Cada rexistro constará da temperatura en grados centígrados a hora, que se lerá do sistema no momento da creación do rexistro.

* */
public class RegistroTemperaturas implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;


    private double temperatura;


    private LocalTime hora;

    public RegistroTemperaturas(double temperatura) {
        this.temperatura = temperatura;
        this.hora = LocalTime.now();

    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss");
        return "Hora:" + hora.format(formateador) + " -> Temperatura: " + temperatura + " ªC";
    }
}


