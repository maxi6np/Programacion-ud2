package Unidad2;


public class Ejerc25 {
    public static void main(String[] args) {
        System.out.println("Introducir un número entero");
        int contadorPares = 0;
        int contadorImpares = 0;
        int numAleatorio;
        boolean esPar = false;

        for (int i = 1; i <= 20; i++) {
            numAleatorio = (int) (Math.random() * 50) + 1;
            System.out.println(numAleatorio);
            esPar = (numAleatorio % 2 == 0);
            if (esPar) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        System.out.println("Cantidad de pares: " + contadorPares);
        System.out.println("Cantidad de impares: " + contadorImpares);
    }

}