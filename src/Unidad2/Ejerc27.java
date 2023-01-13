package Unidad2;

public class Ejerc27 {
    public static void main(String[] args) {

        int numAleatorio = 0;
        final int NOTA_MINIMA = 1;
        final int NOTA_MAXIMA = 10;
        int minimo = NOTA_MAXIMA;
        int maximo = NOTA_MINIMA;
        int vecesMin = 0;
        int vecesMax = 0;
        final int CANTIDAD_ALEATORIOS = 30;
        float notaMedia = 0f;

        for (int i = 1; i <= CANTIDAD_ALEATORIOS; i++) {
            numAleatorio = (int) (Math.random() * NOTA_MAXIMA) + NOTA_MINIMA;
            System.out.println(numAleatorio);
            notaMedia += numAleatorio;

            if (numAleatorio > maximo) {
                maximo = numAleatorio;
                vecesMax = 0;
            }

            if (maximo == numAleatorio) {
                vecesMax++;
            }

            if (numAleatorio < minimo) {
                minimo = numAleatorio;
                vecesMin = 0;
            }

            if (minimo == numAleatorio) {
                vecesMin++;
            }
        }
        notaMedia /= CANTIDAD_ALEATORIOS;
        System.out.println("La media es: " + notaMedia);
        System.out.println("La nota máxima es " + maximo + " y ha salido un total de " + vecesMax);
        System.out.println("La nota mínima es " + minimo + " y ha salido un total de " + vecesMin);
    }
}
