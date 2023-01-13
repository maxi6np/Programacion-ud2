package primerExamen;

public class Examen {
    /**
     * Método main para ejecutar la aplicación.
     * NO MODIFICAR.
     * <p>
     * Debería producir como salida lo mismo que se proporciona en el fichero de texto
     * resultado.txt.
     */
    public static void main(String[] args) {
        Examen examen = new Examen();

        System.out.println("=================================");
        System.out.println("calcularRentencion (0,25 puntos)");
        System.out.println("=================================");
        System.out.println(examen.calcularRetencion(14999));
        System.out.println(examen.calcularRetencion(35000));
        System.out.println(examen.calcularRetencion(9999));
        System.out.println(examen.calcularRetencion(60001));

        System.out.println("=================================");
        System.out.println("traducirNota (0,5 puntos)");
        System.out.println("=================================");
        System.out.println(examen.traducirNota(-1));
        System.out.println(examen.traducirNota(0));
        System.out.println(examen.traducirNota(4.99f));
        System.out.println(examen.traducirNota(6));
        System.out.println(examen.traducirNota(7));
        System.out.println(examen.traducirNota(9));
        System.out.println(examen.traducirNota(9.99f));
        System.out.println(examen.traducirNota(10));

        System.out.println("=================================");
        System.out.println("escribirPares (0,75 puntos)");
        System.out.println("=================================");
        examen.escribirPares(21);
        examen.escribirPares(-30);

        System.out.println("=================================");
        System.out.println("mostrarTrianguloNumeros (0,75 puntos)");
        System.out.println("=================================");
        examen.mostrarTrianguloNumeros(5);
        examen.mostrarTrianguloNumeros(10);

        System.out.println("=================================");
        System.out.println("mostrarFlechaAsteriscos (1,25 puntos)");
        System.out.println("=================================");
        examen.mostrarFlechaAsteriscos(5);
        examen.mostrarFlechaAsteriscos(10);

        System.out.println("=================================");
        System.out.println("mostrarTrianguloPrimos (1,5 puntos)");
        System.out.println("=================================");
        examen.mostrarTrianguloPrimos(5);
        examen.mostrarTrianguloPrimos(10);

        System.out.println("=================================");
        System.out.println("fibonacci (1 punto)");
        System.out.println("=================================");
        examen.fibonacci(21);

        System.out.println("=================================");
        System.out.println("calcularHipoteca (1,5 puntos)");
        System.out.println("=================================");
        examen.calcularHipoteca(200000, 1.75, 30);

        System.out.println("=================================");
        System.out.println("mostrarTablaChetada (1,5 puntos)");
        System.out.println("=================================");
        examen.mostrarTablaChetada(5);
        examen.mostrarTablaChetada(11);
        examen.mostrarTablaChetada(6);

        System.out.println("=================================");
        System.out.println("cambiarAMonedas (1 punto)");
        System.out.println("=================================");
        examen.cambiarAMonedas(20);
        examen.cambiarAMonedas(15);
    }

    /**
     * Los tramos impositivos para la declaracion de la renta en un determinado pais
     * son los siguientes:
     * <p>
     * Menos de 15000? 15%
     * <p>
     * Entre 15000? y 19999? 18%
     * <p>
     * Entre 20000? y 34999? 22%
     * <p>
     * Entre 35000? y 59999? 30%
     * <p>
     * M?s de 60000? (incluido) 50%
     * <p>
     * Escribir un metodo que reciba la renta anual y retorne el tipo impositivo que
     * corresponda.
     *
     * @param renta ingresos del usuario
     * @return el tipo impositivo. Por ejemplo, si el usuario introduce 12000, el
     * programa devolvera 15.
     */
    public int calcularRetencion(int renta) {
        if (renta < 15000) {
            return 15;
        } else if (renta <= 19999) {
            return 18;
        } else if (renta <= 34999) {
            return 22;
        } else if (renta <= 59999) {
            return 30;
        } else {
            return 50;
        }
    }

    /**
     * Escribe un metodo que transforme una nota numerica en su palabra
     * correspondiente teniendo en cuenta la siguiente equivalencia:
     * <p>
     * 0-5(no incluido) --> insuficiente
     * <p>
     * 5-7(no incluido) --> aprobado
     * <p>
     * 7-9(no incluido) --> notable
     * <p>
     * 9-10(no incluido) --> sobresaliente
     * <p>
     * 10 --> matricula de honor
     * <p>
     * Si la nota es menor que 0, retornara "nota no válida".
     *
     * @param nota la nota numerica a convertir
     * @return la cadena de texto en minusculas equivalente
     */
    public String traducirNota(float nota) {
        switch ((int) nota) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return "insuficiente";
            case 5:
            case 6:
                return "aprobado";
            case 7:
            case 8:
                return "notable";
            case 9:
                return "sobresaliente";
            case 10:
                return "matricula de honor";
            default:
                return "nota no válida";

        }
    }

    /**
     * Este metodo recibe un numero entero positivo y muestra por pantalla
     * todos los numeros pares desde ese numero hasta -numero (incluido) separados
     * por comas. Detras del ultimo numero no debe aparecer la coma.
     * Por ejemplo, para n=20, el resultado seria:
     * 20,18,16,14,12,10,8,6,4,2,0,-2,-4,-6,-8,-10,-12,-14,-16,-18,-20
     * <p>
     * Si el numero recibido es negativo se imprimirá la serie en sentido inverso:
     * Por ejemplo, para n=-9:
     * -8,-6,-4,-2,0,2,4,6,8
     * <p>
     * Si n es impar la serie parte del numero par inmediatamente menor. Para n=21 sería
     * 20 y para n=-5 sería -6
     *
     * @param n numero para el que se imprimira la serie
     */
    public void escribirPares(int n) {
        int negativo = n - 2;
        if (n > 0) {
            for (int i = n; i <= n && i >= (-n); i--) {
                if (i % 2 == 0) {
                    System.out.print(i + ",");
                }
            }
        } else {
            for (int j = negativo; j >= negativo && j <= (-negativo); j++) {
                if (j % 2 == 0) {
                    System.out.print(j + ",");
                }
            }
        }
        System.out.println();
    }

    /**
     * Este metodo debe mostrar un triangulo con el siguiente formato. Por ejemplo,
     * para n=5:
     * <p>
     * 5
     * <p>
     * 4 4
     * <p>
     * 3 3 3
     * <p>
     * 2 2 2 2
     * <p>
     * 1 1 1 1 1
     *
     * @param n numero de filas que tendra el triangulo mostrado
     */
    public void mostrarTrianguloNumeros(int n) {
        boolean puedeSeguir;
        int contador;
        int numero;
        for (int i = 0; i < n; i++) {
            puedeSeguir = true;
            contador = 0;
            numero = 2;
            while(puedeSeguir){
                if (esPrimo(numero)){
                    System.out.print(numero + " ");
                    contador++;
                }

                if (contador == i + 1){
                    puedeSeguir = false;
                }
                numero++;
            }
            System.out.println(i);
        }
    }

    /**
     * Este metodo recibe un numero e imprimirá una flecha cuya punta tendrá un número de
     * asteriscos igual al número recibido.
     * Por ejemplo, para n=5:
     * *
     * **
     * ***
     * ****
     * *****
     * ****
     * ***
     * **
     * *
     *
     * @param n numero de asteriscos que tendrá la punta de flecha
     */
    public void mostrarFlechaAsteriscos(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            suma++;
            for (int j = n - suma; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Este metodo debe mostrar un triangulo con el siguiente formato. Por ejemplo,
     * para n=5:
     * <p>
     * 2
     * <p>
     * 2 3
     * <p>
     * 2 3 5
     * <p>
     * 2 3 5 7
     * <p>
     * 2 3 5 7 11
     * <p>
     * Implementa también el método esPrimo y utilízalo para
     * determinar si un número es o no primo.
     *
     * @param n numero de filas que tendra el triangulo mostrado
     */
    public void mostrarTrianguloPrimos(int n) { // filas
        boolean puedeSeguir;
        int contador;
        int numero;
        for (int i = 0; i < n; i++) {
            puedeSeguir = true;
            numero = 2;
            contador = 0; // columnas
            while (puedeSeguir) {
                if (esPrimo(numero)) {
                    System.out.print(numero + " ");
                    contador++;
                }

                if (contador == i + 1) {
                    puedeSeguir = false;
                }
                numero++;
            }
            System.out.println();
        }
    }

    /**
     * Devuelve true cuando un número es primo. Un número es primo cuando tiene
     * más divisores aparte de sí mismo y 1.
     *
     * @param numero El número que queremos comprobar si es primo.
     * @return True si es primo y false en caso contrario.
     */
    private boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while (contador != numero) {
            if (numero % contador == 0) {
                return false;
            }
            contador++;
        }
        return primo;
    }

    /**
     * Este metodo debe mostrar la sucesion de Fibonacci, imprimiendo el numero de
     * elementos indicado por n. Por ejemplo, para n=10 mostrara:
     * <p>
     * 0 1 1 2 3 5 8 13 21 34
     * <p>
     * Como se puede apreciar, los dos primeros numeros de la serie siempre son 0 y
     * 1, y los siguientes son el resultado de sumar los dos numeros que le preceden
     * en la serie.
     * Utilizar bucles para su resolución. En caso contrario se considerará no válido.
     *
     * @param n
     */
    public void fibonacci(int n) {
        int suma = 0;
        int anterior = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(suma + " ");
            anterior += suma;
            suma = anterior - suma;
        }
        System.out.println();
    }

    /**
     * Este metodo calcula la cuota mensual de una hipoteca a tipo de interés fijo y
     * además calcula qué parte de esa cuota mensual se corresponden con intereses,
     * mostrando estos intereses por cada mes, año y además el importe total de los
     * intereses pagados al finalizar el préstamo hipotecario.
     * Por ejemplo, para una hipoteca por importe de 200.000?, 1,75% de interés y
     * 30 años de plazo, la cuota mensual será de 714? y los intereses totales pagados
     * al final de esos 30 años serán de 57.214?.
     * <p>
     * La fórmula para calcular la cuota mensual de la hipoteca es:
     * Cuota = importe * ((tipo interés * (1 + tipo interés) ^ periodo)) / ((1 + tipo interés) ^ periodo) - 1))
     * <p>
     * El tipo de interés será el resultado de dividir el interes recibido como parámetros
     * entre 1200.
     * El periodo es el número de años de la hipoteca multiplicado por 12 (12 meses por año).
     *
     * @param importe importe de la hipoteca
     * @param interes interés del préstamo hipotecario. Por ejemplo, 1,5%
     * @param anios   años que tardará el usuario en devolver el importe de la hipoteca.
     */
    public void calcularHipoteca(int importe, double interes, int anios) {
        double tipoInteres = interes / 1200;
        int periodo = anios * 12;
        double cuota = importe * ((tipoInteres * Math.pow(1 + tipoInteres, periodo)) / (Math.pow(1 + tipoInteres, periodo) - 1));
        double deuda = importe;
        double interesMensual;
        double cuotaAnual = 0;
        double interesesTotales = 0;
        System.out.println("Cuota hipoteca = " + cuota + "€");
        for (int i = 1; i <= anios; i++) {
            cuotaAnual = 0;
            for (int j = 1; j <= 12; j++) {
                interesMensual = deuda * tipoInteres;
                System.out.println("Mes " + j + " : " + interesMensual + "€");
                cuotaAnual += interesMensual;
                deuda = deuda - (cuota - interesMensual);
                interesesTotales += interesMensual;
            }
            System.out.println("---------------------------");
            System.out.println("Año " + i + ": " + cuotaAnual + "€");
            System.out.println("---------------------------\n");
        }
        System.out.println("Intereses totales pagados = " + interesesTotales + "€");
    }

    /**
     * La tabla Chetada es una celebre figura matematica utilizada por cierto
     * profesor de DAW1 que, por motivos de seguridad, prefiere permanecer en el
     * anonimato. La figura solo está disponible para valores impares y tiene el
     * siguiente formato. Para n = 9:
     * <p>
     * 1 9 9 9 9 9 9 9 1
     * 9 2 9 9 9 9 9 2 9
     * 9 9 3 9 9 9 3 9 9
     * 9 9 9 4 9 4 9 9 9
     * 9 9 9 9 5 9 9 9 9
     * 9 9 9 6 9 6 9 9 9
     * 9 9 7 9 9 9 7 9 9
     * 9 8 9 9 9 9 9 8 9
     * 9 9 9 9 9 9 9 9 9
     * <p>
     * Es decir, mostrará una tabla de n x n elementos, donde todo elemento será
     * igual a n, a excepción de aquellos que forman las diagonales, que tendrán
     * valores secuenciales empezando en 1 e incrementándose de 1 en 1 hasta llegar a n.
     *
     * @param n
     * @return
     */
    public void mostrarTablaChetada(int n) {
        if (n % 2 == 0) {
            System.out.println("Error: " + n + " es par");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == j || j == n - i + 1) {
                        System.out.print(i + " ");
                    } else {
                        System.out.print(n + " ");
                    }
                }
                System.out.println();
            }
        }
    }

    /**
     * Este metodo simula el funcionamiento de una máquina que cambia billetes a
     * monedas de euro. La máquina solo dispone de monedas de 2, 1 y 50 céntimos.
     * Para intentar no agotar monedas de un valor antes de tiempo, la máquina
     * intenta devolver un número de parejo de monedas de los distintos valores.
     * Para ello la dinámica más sencilla es ir restando a la cantidad a cambiar
     * una moneda de cada valor en cada pasada, hasta que el cambio sume la cantidad
     * a devolver.
     * <p>
     * Por ejemplo, para n = 20? mostrara:
     * <p>
     * Monedas de 2?: 6
     * Monedas de 1?: 5
     * Monedas de 50 céntimos: 6
     *
     * @param n Cantidad a cambiar
     */
    public void cambiarAMonedas(int n) {
        float moneda2 = 2f;
        int contador2 = 0;
        float moneda1 = 1f;
        int contador1 = 0;
        float moneda50 = 0.50f;
        int contador50 = 0;
        float contadorGeneral = n;


        for (int i = 1; i <= n; i++) {
            if (moneda2 <= contadorGeneral) {
                contadorGeneral -= moneda2;
                contador2++;
            }
            if (moneda1 <= contadorGeneral) {
                contadorGeneral -= moneda1;
                contador1++;
            }
            if (moneda50 <= contadorGeneral) {
                contadorGeneral -= moneda50;
                contador50++;
            }
        }
        System.out.println("Cambio billetes de " + n + "€");
        System.out.println("Monedas de 2€: " + contador2);
        System.out.println("Monedas de 1€: " + contador1);
        System.out.println("Monedas de 50 céntimos: " + contador50);
        System.out.println();
    }

}


