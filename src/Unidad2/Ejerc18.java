package Unidad2;

public class Ejerc18 {

    public static void main(String[] args) {
        int contador = 0, contaMultiplos = 0, suma = 0, contaSiete = 0, sumaImpares = 0, numero = 0;

        boolean stop = true;

        while (stop) {
            int num = (int) ((Math.random() * 100));
            System.out.println(num);

            if (num % 2 != 0) {
                sumaImpares += numero;
            }
            if (num % 2 == 0 && num != 0) {
                suma += num;
            }
            if (num % 3 == 0 || num % 6 == 0) {
                contaMultiplos++;
            }
            if (num % 10 == 7) {
                contaSiete++;
            }
            if (num == 0) {
                stop = false;
            }
            contador++;

        }
        System.out.println("Sumatorio de impares: " + sumaImpares);
        System.out.println("Multiplicación de pares: " + suma);
        System.out.println("Múltiplos de 3 y 6:" + contaMultiplos);
        System.out.println("Números acabados en 7:" + contaSiete);


    }
}