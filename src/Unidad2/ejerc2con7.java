package Unidad2;

import java.util.Scanner;

public class ejerc2con7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte el número de la tabla de multiplicar que desea hacer ");
        int numTabla = sc.nextInt();
        System.out.println("Tabla de multiplicar de " + numTabla);

        int numComienzo = 0;
        while (sc.hasNextInt()) {
            if (!sc.hasNextInt()) {
                System.out.print("Entrada incorrecta");
            } else {
                while (numComienzo <= 10) {
                    System.out.println(numTabla + "X" + numComienzo + "=" + numComienzo * numTabla);
                    numComienzo++;
                }
            }
        }
    }
}