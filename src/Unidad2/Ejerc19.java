package Unidad2;

import java.util.Scanner;

public class Ejerc19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        boolean stop =  true;

        while(stop){
            int num = (int) ((Math.random()*30) + 1);
            System.out.println(num);
            contador++;
            if (num == 5){
                stop = false;
            }

        }


    }
}