package Unidad2;

import java.util.Scanner;

public class Ejerc15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero cualquiera: ");

        while (!sc.hasNextInt()) {
            System.out.println("Error. Introduzca un número mayor de cero");
            sc.nextLine();
        }

        int num = sc.nextInt();
        int resultado = 0;
        int aux = num;

        while (aux != 0) {
            resultado = resultado + (aux % 10);
            aux = aux / 10;
        }
        System.out.println("La suma de dígitos de " + num + " es " + resultado);


    }
}