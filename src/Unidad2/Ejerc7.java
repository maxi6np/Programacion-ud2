package Unidad2;

import java.util.Scanner;

public class Ejerc7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un año : ");
        int anio = sc.nextInt();

        System.out.println("Introduzca un mes : ");
        int mes = sc.nextInt();

        if (anio > 2000 && anio < 2021) {
            System.out.println("Estamos en el año " + anio);
        } else {
            System.out.println("error en el año");
        }

        if (mes < 13 && mes > 0) {
            System.out.println("Estamos en el mes " + mes);
        } else {
            System.out.println("error en el mes");
        }


    }
}