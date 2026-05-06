package BoletinVectores.NIF_persona;

import java.util.Scanner;

public class DNI {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Introduce tu numero de dni: ");
        String n_dni = sc.next();
        if (n_dni.length() == 8){
            int dni = Integer.parseInt(n_dni);
            char letra = letras[dni%23];
            System.out.println("NIF: " + n_dni + letra);

        }else {
            System.out.println("El DNI debe tener 8 digitos");
        }

    }
}
