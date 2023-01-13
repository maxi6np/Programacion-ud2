package Unidad2;

import java.util.Scanner;

public class Ejerc8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer numero");
        int num1 = sc.nextInt();

        System.out.println("Introduzca el segundo numero");
        int num2 = sc.nextInt();

        int contador = num1;

        while (contador <= num2) {
            if (contador == num2) {
                System.out.print(contador + ".");
            } else {
                System.out.print(contador + ", ");

            }
            contador++;
        }
    }
}
