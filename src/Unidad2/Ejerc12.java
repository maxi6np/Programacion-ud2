package Unidad2;


public class Ejerc12 {

    public static void main(String[] args) {
        int contador = 0;
        int cont12 = 0;
        boolean stop = true;

        while (stop) {
            int num = (int) ((Math.random() * 100) + 1);
            System.out.println(num);
            if (num == 12) {
                cont12++;
            }
            contador++;
            if (num == 99 || contador == 30) {
                stop = false;
            }

        }
        System.out.println("Contador: " + contador);
        System.out.println("Número de veces del 12: " + cont12);

    }
}