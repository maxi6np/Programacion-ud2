package Unidad2;

import java.util.Scanner;

public class Ejerc20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        int num = sc.nextInt();

        //Con while
        int i = 1;
        while (i <= num) {
            int j = 1;
            while (j < num) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println(i);
            i++;
        }

        //Con for
        /*for (int i = 1; i <= num; i++) {
            for (int j = 1; j < num; j++) {
                System.out.print(i + " ");
            }
            System.out.println(i);
        }*/
    }
}
