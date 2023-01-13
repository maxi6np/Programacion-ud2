package Unidad2;


import java.util.Scanner;

public class Ejerc11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int suma = 0;

        do {
            System.out.println("Introduce un numero:");
            num = sc.nextInt();
            suma += num;
            System.out.println("suma: " + suma);
        } while (num != 0);

    }
}
