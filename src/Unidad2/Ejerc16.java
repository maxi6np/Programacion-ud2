package Unidad2;

import java.util.Scanner;

public class Ejerc16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número:");
        int num = sc.nextInt();
        int contador = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
            }
        }

        if (contador != 2) {
            System.out.println("No es un numero primo");
        } else {
            System.out.println("Es un numero primo");
        }
    }
}