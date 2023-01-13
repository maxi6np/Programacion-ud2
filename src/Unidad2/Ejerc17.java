package Unidad2;

import java.util.Scanner;

public class Ejerc17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número de números aleatorios:");
        int numsAleatorios = sc.nextInt();
        int num = 0, par = 0, acaba2 = 0, impar = 0;

        for (int i = 0; i < numsAleatorios; i++) {
            num = (int) (Math.random() * (20 - 5)) + 5;
            System.out.println(num);
            if (num % 2 == 0) {
                par++;
                if (num % 10 == 2) {
                    acaba2 = acaba2 * num;
                }
            } else {
                impar += num;
            }
        }
        if (acaba2 == 1) {
            acaba2 = 0;
        }

        System.out.println("Sumatorio de impares: " + impar);
        System.out.println("Pares: " + par);
        System.out.println("Multiplicación de números acabados en 2:" + acaba2);


    }
}