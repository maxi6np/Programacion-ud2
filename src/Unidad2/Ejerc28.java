package Unidad2;

import java.util.Scanner;

public class Ejerc28 {

    public static void main(String[] args) {
        int numeroActual = 0;
        int opcionMenu = 0;
        boolean stop = true;

        do {
            System.out.println("********************************");
            System.out.println("Número actual: " + numeroActual);
            System.out.println("********************************");
            System.out.println("1.- Validación");
            System.out.println("2.- Factorial");
            System.out.println("3.- Primo");
            System.out.println("4.- Dígitos de una cifra");
            System.out.println("5.- Capicúa");
            System.out.println("6.- Salir del programa");
            opcionMenu = sc.nextInt();

            if (opcionMenu >= 1 && opcionMenu <= 6) {
                switch (opcionMenu) {
                    case 1:
                        System.out.println(esEntero(numeroActual));
                        break;
                    case 2:
                        System.out.println(factorial(numeroActual));
                        break;
                    case 3:
                        System.out.println(esPrimo(numeroActual));
                        break;
                    case 4:
                        System.out.println(composicion(numeroActual));
                        break;
                    case 5:
                        System.out.println(esCapicua(numeroActual));
                        break;
                    case 6:
                        System.out.println(finPrograma());
                        stop = false;
                        break;
                }
            } else {
                System.out.println("Entrada incorrecta");

            }
            opcionMenu = 0;
        } while (stop);
    }

    static Scanner sc = new Scanner(System.in);

    public static Boolean esEntero(int numero) {
        System.out.println("Introduzca un numero para saber si es entero o no");

        if (!sc.hasNextInt()) {
            return false;
        } else {
            return true;

        }
    }


    public static String factorial(int fact) {
        System.out.println("Introduzca un numero para realizar su factorial: ");
        fact = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= fact; i++) {
            resultado *= i;
        }
        return "El factorial de " + fact + " es " + resultado;
    }


    public static Boolean esPrimo(int primo) {
        primo = 0;
        System.out.println("Introduzca un número para saber si es primo:");
        primo = sc.nextInt();
        int x;

        for (x = 2; x < primo / 2; x++) {
            if (primo % x == 0)
                return false;
        }
        return true;
    }


    public static String composicion(int num) {
        System.out.println("Introduzca un número para saber si es primo");
        num = sc.nextInt();
        int resultado = 0;
        int aux = num;

        while (num > 0) {
            num = num / 10;
            resultado++;
        }
        return "El número  " + aux + " tiene " + resultado + " dígitos";

    }


    public static Boolean esCapicua(int numero) {
        System.out.println("Introduce un numero entero para saber si es capicua ");
        numero = sc.nextInt();

        String copia = String.valueOf(numero);
        String inverso = "";

        for (int i = copia.length() - 1; i >= 0; i--) {
            inverso += copia.charAt(i);
        }

        return copia.equals(inverso);
    }


    public static String finPrograma() {
        return "Fin del programa";

    }

    private static boolean capicua(int num) {
        boolean resultado = true;
        String copia = String.valueOf(num);

        for (int i = 0; i < (copia.length() / 2); i++) {
            if (copia.charAt(i) != copia.charAt(copia.length() - 1 - i)) {
                resultado = false;
                break;
            }
        }
        return resultado;
    }
}
