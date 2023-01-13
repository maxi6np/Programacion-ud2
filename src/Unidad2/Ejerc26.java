package Unidad2;

import java.util.Scanner;

public class Ejerc26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir un número entero");
        int numero = sc.nextInt();
        int numMayor = 0;
        int numAleatorio = (int) (Math.random() * 100) + 1;

        for (int i = 1; i <= numero; i++) {
            System.out.println(numAleatorio);
            if (numAleatorio >= numMayor){
                numMayor = numAleatorio;
            }
            numAleatorio = (int) (Math.random() * 100) + 1;

        }
        System.out.println("El número mayor dentro de esta secuencia es: " + numMayor);
    }

}