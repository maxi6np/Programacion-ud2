package Unidad2;


/**
 * Esta clase contiene algunos metodos con usos de la sentencia condicional if y
 * switch
 */
public class Tarea4 {

    /**
     * Punto de entrada de la ejecucion.
     */
    public static void main(String[] args) {
        Tarea4 ej = new Tarea4();
        ej.printDescripcion(54, "Ramiro");
        ej.printDescripcionOtraVersion(17, "Jonathan");
        ej.printDescripcion(12, "Marco");

        System.out.println(ej.esPositivoPar(3));
        System.out.println(ej.esPositivoPar(34));

        System.out.println(ej.metodoMisterioV1(34));
        System.out.println(ej.metodoMisterioV2(-34));
        System.out.println(ej.metodoMisterioV3(-4));

        System.out.println(ej.demoSwitch(4));

        ej.repartirCaramelos(5, 3);
        ej.repartirCaramelos(1, 3);
        ej.repartirCaramelos(5, 5);

        System.out.println(ej.obtenerValorAbsoluto(54));
        System.out.println(ej.obtenerValorAbsoluto(-754));

        ej.mostrarNumeroEnLetra(45);
        ej.mostrarNumeroEnLetra(450);

        System.out.println(ej.esImparUltimaCifra(683));
        System.out.println(ej.esImparUltimaCifra(872));
        System.out.println(ej.esImparUltimaCifra(333333330));

        ej.hacerFct('p', true);
        ej.hacerFct('P', false);
        ej.hacerFct('s', true);
        ej.hacerFct('S', false);

        ej.mostrarNumero(43);
        ej.mostrarNumero(-68);
        ej.mostrarNumero(-57);

        ej.demoSwitch2("Lunes");
        ej.demoSwitch2("Domingo");

        System.out.println(ej.esVocalV1('a'));
        System.out.println(ej.esVocalV1('I'));
        System.out.println(ej.esVocalV1('J'));

        System.out.println(ej.calcularDiasMes(2, 2004));
        System.out.println(ej.calcularDiasMes(2, 2006));
        System.out.println(ej.calcularDiasMes(8, 2000));
        System.out.println(ej.calcularDiasMes(9, 2001));

        ej.detectarTipoLetra('a');
        ej.detectarTipoLetra('*');
        ej.detectarTipoLetra('O');
        ej.detectarTipoLetra('p');
        ej.detectarTipoLetra('W');
        ej.detectarTipoLetra('@');
    }

    /**
     * if con else completo (if anidado)
     */
    public void printDescripcion(int edad, String nombre) {

        if (edad < 13) {
            System.out.println(nombre + " es un nino");
        } else {
            if (edad < 18) {
                System.out.println(nombre + " es un adolescente ");
            } else {
                System.out.println(nombre + "es un adulto");
            }
        }

    }

    /**
     * if anidado, if ... else if
     */
    public void printDescripcionOtraVersion(int edad, String nombre) {

        if (edad < 13)
            System.out.println(nombre + " es un nino");
        else if (edad < 18)
            System.out.println(nombre + " es un adolescente ");
        else
            System.out.println(nombre + " es un adulto");
    }

    /**
     *
     */
    public boolean esPositivoPar(int numero) {

        return numero % 2 == 0 && numero >= 0;
    }

    /**
     *
     */
    public boolean metodoMisterioV1(int valor) {
        if (valor >= 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Uso de una variable local para devolver el valor despues con return
     */
    public boolean metodoMisterioV2(int valor) {
        boolean resultado = false;

        if (valor >= 0) {
            resultado = true;
        }

        return resultado;
    }

    /**
     * El metodo anterior con expresion booleana
     */
    public boolean metodoMisterioV3(int valor) {

        return (valor >= 0);
    }

    /**
     * Demo de la sentencia switch
     */
    public String demoSwitch(int dia) {
        String nombreDia;
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miercoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Incorrecto";
                break;
        }
        return nombreDia;
    }

    /**
     * Mostrar uno de estos tres mensaje: " xxxx personas sin caramelos" " cada
     * persona con un caramelo" " xxxx personas con mas de un caramelo"
     */
    public void repartirCaramelos(int personas, int caramelos) {
        if (personas > caramelos) {
            int personasDeMas = personas - caramelos;
            System.out.println(personasDeMas + "  personas sin caramelos");
            ;
        } else if (personas == caramelos) {
            System.out.println("cada persona con un caramelo");
            ;
        } else {
            int caramelosDeMas = caramelos - personas;
            System.out.println(caramelosDeMas + " personas con mas de un caramelo");
            ;
        }
    }

    /**
     * Calcula y devuelve el valor absoluto de numero
     */
    public int obtenerValorAbsoluto(int numero) {

        return Math.abs(numero);

    }

    /**
     * Muestra como letra el valor de numero Para practicar if ... elseif ....
     * Comprobar que el numero esta dentro del rango de los codigos que contienen
     * letras (65-90)(97-122)
     */
    public void mostrarNumeroEnLetra(int numero) {
        boolean esLetra = ((numero >= 60 && numero <= 90) || (numero >= 97 && numero <= 122));

        if (esLetra) {
            System.out.println((char) numero);
        } else {
            System.out.println("ERROR. Entrada incorrecta");
        }

    }

    /**
     * Devuelve true si es impar la ultima cifra de numero
     */
    public boolean esImparUltimaCifra(int numero) {
        return numero % 2 != 0;
    }

    /**
     * Escribir "El alumno hara la FCT" si es del curso segundo 'S' / 's' y '
     * ha aprobado tod
     * En cualquier caso mostrar el mensaje "Final de este método"
     */
    public void hacerFct(char curso, boolean haAprobado) {
        if ((curso == 'S' || curso == 's') && haAprobado) {
            System.out.println("El alumno hará la FCT");
        }
        System.out.println("Final del método");
    }

    /**
     * Si numero es positivo se decrementa su valor, se multiplica por 2 y se
     * escribe
     * Si es negativo se incrementa, se divide entre 2 y se escribe tambien
     */
    public void mostrarNumero(int numero) {
        int copia = numero;
        if (numero >= 0) {
            copia--;
            copia *= 2;
            System.out.println(copia);
        } else {
            copia++;
            copia /= 2;
            System.out.println(copia);
        }
    }

    /**
     * Demo de la sentencia switch Escribe dia laborable/ No laborable
     */
    public void demoSwitch2(String dia) {
        switch (dia) {
            case "Lunes":
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
                System.out.println("dia laborable");
                break;
            default:
                System.out.println("dia no laborable");
                break;
        }
    }

    /**
     * Demo de la sentencia switch devuelve true si es vocal / false en otro caso
     */
    public boolean esVocalV1(char letra) {
        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    /**
     * Calcula y devuelve los dias del mes indicado
     * Para el mes febrero habra que tener en cueta si anio es o no bisiesto (multiplo de 4)
     * Si el mes es incorrecto devolver -1
     */
    public int calcularDiasMes(int mes, int anio) {
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("este mes tiene 31 días");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("este mes tiene 30 días");
                break;
            case 2:
                if (anio % 4 == 0 && (anio % 100 == 0 || anio % 400 == 0)) {
                    System.out.println("este mes tiene 29 días");
                } else {
                    System.out.println("este mes tiene 28 días");
                }
                break;
        }
        return 0;
    }

    /**
     * si no es una letra, mensaje error
     * si letra vocal mayuscula, escribir vocal mayuscula
     * si letra vocal minuscula, escribir minuscula
     * escribir consonante en otro caso
     */
    public void detectarTipoLetra(char letra) {
        boolean esLetra = ((letra > 64 && letra < 91) || (letra > 96 && letra < 123)); ;
        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("es minuscula");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("es mayuscula");
                break;
            default:
                System.out.println("Consonante");
                break;

        }
    }

}


