package Unidad2;

import java.util.Scanner;

public class Ejerc13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduzca un número:");


        if (!sc.hasNextInt()) {
            System.out.println("Error. Introduzca un numero mayor que 0");
        }
        int denominador = sc.nextInt();
        double sum = 0;


        for (int i = 1; i <= denominador; i++) {
            System.out.print("1/" + i + " ");
            sum += (1.0 / i);
            if (i == denominador) {
                System.out.println(" ");
            }
        }
        System.out.println("Resultado: " + sum);

    }
}
