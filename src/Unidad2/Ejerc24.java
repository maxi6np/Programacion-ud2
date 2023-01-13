package Unidad2;

import java.util.Scanner;

public class Ejerc24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Al introducir un numero se mostrarán el sumatorio de la cantidad de aleatorios introducidos");
        int numero = sc.nextInt();
        int suma = 0;

        for (int i = 0; i < numero; i++) {
            int numAleatorio = (int) (Math.random() * 100) + 1;
            int contador = numAleatorio;
            while (contador != 0) {
                suma += contador;
                contador--;
            }
            System.out.println("Sumatorio de " + numAleatorio + " es: " + suma);
            suma = 0;
        }
    }

}

