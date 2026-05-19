package BoletinColecciones.Meteorologia;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstacionMetereologica{
    public static void main(String[] args) {
        List<RegistroTemperaturas> listaR = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        System.out.println("== SISTEMA METEOROLOGICO ==");

        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Nuevo registro");
            System.out.println("2. Listar registros");
            System.out.println("3. Mostrar estadística");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());

            }catch (NumberFormatException e){
                opcion = 0;
            }

            switch (opcion){
                case 1:
                    System.out.println("Introduzca la temperatura en ªC: ");
                    try{
                        double temp = Double.parseDouble(sc.nextLine());
                        listaR.add(new RegistroTemperaturas(temp));
                        System.out.println("Temperatura almacenada correctamente");
                    } catch (NumberFormatException e){
                        System.out.println("temperatura introducida no valida");
                    }
                    break;
                case 2:
                    if (listaR.isEmpty()){
                        System.out.println("No hay registros para mostrar");
                    }else {
                        System.out.println("LECTURA DEL DIA: ");
                        for (RegistroTemperaturas r: listaR){
                            System.out.println(r);
                        }
                    }
                    break;
                case 3:
                    if (listaR.isEmpty()){
                        System.out.println("NO SE PUEDE CALCULAR ESTADISTICAS SIN DATOS");

                    }else{
                        double min = Double.MAX_VALUE;
                        double max = -Double.MAX_VALUE;
                        double suma = 0;

                        for (RegistroTemperaturas r: listaR){
                            double t = r.getTemperatura();
                            if ( t < min) min  = t;
                            if (t > max) max = t;

                            suma += t;

                        }
                        double promedio = suma/ listaR.size();
                        System.out.println("\n--- INFORME ESTADÍSTICO ---");
                        System.out.println(">> Temp. Mínima: " + min + " ºC");
                        System.out.println(">> Temp. Máxima: " + max + " ºC");
                        System.out.println(">> Temp. Promedio: " + String.format("%.2f", promedio) + " ºC");

                    }
                    break;
                case 4:
                    System.out.println("Cerrando sesion");
                    guardarBinarios(listaR);
                    System.out.println("Programa finalizado correctamente");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 4);
        sc.close();

    }

    private static void guardarBinarios(List<RegistroTemperaturas> datos) {
        String fechaactual = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyyMMdd"));
        String nombreArchivo = "Registro" + fechaactual + ".dat";

        try (ObjectOutputStream escritorBinario = new ObjectOutputStream(new FileOutputStream(nombreArchivo))){
            escritorBinario.writeObject(datos);
            System.out.println("Archivo serializado con exito: " + nombreArchivo );

        } catch (IOException e ) {
            System.out.println("Error de entrada/salida " + e.getMessage());
        }

    }

}
