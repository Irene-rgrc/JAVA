/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author i.rodriguezga.2021
 */
public class Prac6 {

    public static int sumaEnteros(int a) { //N es la longuitud de cifras que tiene q la voy a declar en otra sentencia en el main
        int cifraSuma = 0;
        while (a > 0) {
            cifraSuma += a % 10;
            a = a / 10;
        }
        return cifraSuma;
    }

    public static void mostrarSinceros(int base, int tope) {
        int b = 0;
        int i = base;
        if (tope < base) {
            tope = b;
            tope = base;
            base = b;
        }
        while (i <= tope) {
            if (sumaEnteros(i) == base) {
                System.out.print(i + ", ");
            } else {
                System.out.print('-');
            }
            i += base;

        }
        System.out.println(" ");
    }
        /**
         * @param args the command line arguments
         */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int option;

        do {
            System.out.println("1- Multiplos sinceros");
            System.out.println("2- Números colegas");
            System.out.println("3- Salir");

            //System.out.println("");
            option = entrada.nextInt();

            switch (option) {
                case 1:
                    System.out.println("******** MULTIPLOS SINCEROS**********");
                    mostrarSinceros(9, 30);

                    break;

                case 2:
                    System.out.println("******* NUMEROS COLEGAS **********");

                    break;

                default:
                    System.out.println("Hasta luego.");
            }

        } while (option != 3);
    }
}

// TODO code application logic here}
