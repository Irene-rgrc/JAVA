package recursionlineal;

import java.io.*;

/**
 *
 * @author raquel.hijon
 */
public class RecursionLineal {

    public static void main(String[] args) {
        /*
         int num;
         num = 6;
         int fac = factorial(num);
         System.out.println("El factorial de " + num + " es " + fac);
         System.out.println("la division por restas sucesivas es de 5 y 2 es " + division(5,2));
        System.out.println("la sumas de los digitos 357 es " + sumarDig(357));
        System.out.println("El máximo comun divisor de 5 y 4 es " + mcd(5,4));
        System.out.println("los digitos del nuero 351 son " );
        imprimeNumero(351);
         */
        
         int fac = factorial(6);
         System.out.println("El factorial de 6 es " + fac);
        
    }//fin main
// factorial recursivo

    static int factorial(int n) {
        if (n > 1) {
            return factorial(n - 1) * n; // caso recursivo      
        } else {
            return 1;//caso base
        }
    }//fin fatorial
    // Division por restas sucesivas

    static int division(int a, int b) {
        if (b > a) {
            return 0;
        } else {
            return division(a - b, b) + 1;
        }
    }//fin division
    //Suma de los digitos de un numero

    static int sumarDig(int n) {
        if (n == 0) {
            return n;
        } else {
            return sumarDig(n / 10) + (n % 10);
        }//fin si

    }//fin sumar_dig
    // maximo comun divisor de dos números

    static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }//fin si
    }//fin mcd
    //Imprime un numero digito a digito

    static void imprimeNumero(int n) {
        if (n < 10) {
            System.out.println(n % 10);
        } else {
            imprimeNumero(n / 10);
            System.out.println(n % 10);
        }//finsi
    }
}// fin Recursion lineal
