package Unidad2;

import java.util.Scanner;

public class Ejerc10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte un número entero");
        int num1 = sc.nextInt();
        System.out.println("Inserte un segundo número entero mayor que el primero");
        int num2 = sc.nextInt();


        if (num1 > num2 || num1 == num2) {
            System.out.println("Error. El segundo número debe ser mayor que el primero");
        }

        // con while
        int contador = 0;
        /*while (num1 <= num2) {
            if (contador % 3 == 0) {
                System.out.println();
            }
            System.out.print(num1 + " ");
            contador++;
            num1++;
        }*/

        // con for
        for (int i = num1; i<= num2; i++) {
            if (contador == 3) {
                System.out.println();
                contador = 0;
            }

            System.out.print(i + " ");
            contador++;
        }
    }
}