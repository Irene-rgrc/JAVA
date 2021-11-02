import java.util.Scanner;

/**
 *
 * @author i.rodriguezga.2021
 */
public class Prac6 {

    public static int sumaEnteros(int a) {
        int cifraSuma = 0;
        while (a > 0) {
            cifraSuma += a % 10;
            a = a / 10;
        }
        return cifraSuma;
    }

    
    public static void comparacionNumero(int a, int b) {
        int numi = a;
        int primerDigito = 0;
        int ultimoDigito = 0;

        ultimoDigito = a % 10;

        while (a != 0) {
            primerDigito = a % 10;
            a /= 10;
        }
 
        if (primerDigito == b && ultimoDigito == b) {
            System.out.println("El numero " + numi + " es colega de " + b);
        } else {
            System.out.println("El numero " + numi + " no es colega de " + b);
        }
    }

    public static void mostrarSinceros(int base, int tope) {
        int i = base;
        while (i <= tope) {
            if (sumaEnteros(i) == base) {
                System.out.print(i + ", ");
            } else {
                System.out.print("");
            }
            i += base;

        }
        System.out.println(" ");
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int option;

        do {
            System.out.println("1- Multiplos sinceros");
            System.out.println("2- Números colegas");
            System.out.println("3- Salir");

            option = entrada.nextInt();

            switch (option) {
                case 1:
                    int num1, num2;
                    //Entrada de datos
                    do {
                        System.out.println("Introduzca un número positivo de una cifra: ");
                        num1 = entrada.nextInt();
                    } while (num1 < 0);
                    do {
                        System.out.println("Introduzca un número mayor que " + num1);
                        num2 = entrada.nextInt();
                    } while (num2 < num1);
                    //Salida de datos
                    mostrarSinceros(num1, num2);
                    break;

                case 2:
                    System.out.println("******* NUMEROS COLEGAS **********");
                    int num01, num02;
                    do {
                        System.out.println("Introduzca un número mayor que cero: ");
                        num01 = entrada.nextInt();
                    } while (num01 < 0);
                    do {
                        System.out.println("Introduzca un número positivo de una cifra: ");
                        num02 = entrada.nextInt();
                    } while (num02 < 0 && num02 < 10);

                    comparacionNumero(num01, num02);

                    break;

                default:
                    System.out.println("Hasta luego.");
            }

        } while (option != 3);
    }

}
