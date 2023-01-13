package Unidad2;

import java.util.Scanner;

public class Ejerc23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero para mostrar su tabla de multiplicar y las anteriores");
        int numero = sc.nextInt();


        for (int i = 1; i <= numero; i++) {
            System.out.println("Tabla de multiplicar de " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println((j) + " x " + i + " = " + j * i);
            }
        }
    }
}
