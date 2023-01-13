package Unidad2;

import java.util.Scanner;

public class Ejerc9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Introduzca un numero:");

        while (!sc.hasNextInt()) {
            System.out.println("Error. Introduzca un numero:");
            sc.nextLine();
        }
        num = sc.nextInt();

        //TABLA DE MULTIPLICAR CON FOR

        /*for (int i=1 ; i<=10 ; i++){
            System.out.println((i) + " x " + num + " = " + num*i);
        }*/

        //TABLA DE MULTIPLICAR CON WHILE

        /*int i = 1;
        while(i <=10){
            System.out.println(i + " x " + num + " = " + (num*i));
            i++;
        }*/

    }
}
