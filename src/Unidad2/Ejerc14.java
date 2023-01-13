package Unidad2;

import java.util.Scanner;

public class Ejerc14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número del cual se van a calcular sus divisores");
        int numInicio = sc.nextInt();
        System.out.println("Introduzca un número fin");
        int numFin = sc.nextInt();

        int contador = 0;

        if (numFin > numInicio) {
            for (int i = 1; i <= numInicio; i++) {
                if (numInicio % i == 0) {
                    System.out.println(i);
                    contador++;
                }
            }
            System.out.println("Hay un total de " + contador + " numeros divisisores");
        } else {
            for (int i = 1; i <= numFin; i++) {
                if (numFin % i == 0) {
                    System.out.println(i);
                    contador++;
                }
            }
            System.out.println("Hay un total de " + contador + " numeros divisisores");
        }
    }
}