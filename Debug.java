public class Metodos {
    public static int imprimirPrimos(int max, int num) {
        int aux = 0;
        num = 3;
        //System.out.println("1\n2"); Es lo mismo que las 2 sentencias siguientes
        System.out.println("1");
        System.out.println("2");
        for (int i = 3; i <= max; i++) {
            int divisor = 2;
            while (i % divisor != 0 && divisor < i - 1) {
                divisor++;
            }
            if (divisor == i - 1) {
                System.out.println(i);
                aux = num++;
            }

        }
        return aux;
    }

    public static void main(String[] args) {
        int maximo = 25, numero = 0, n = 0, resultado = 0;
        System.out.println("Números primos hasta " + maximo + ": ");
        resultado = imprimirPrimos(maximo, numero);
        System.out.println("Total " + resultado + " primos");
    }
}


//METODOS1---------------------------------------------------------------------

import java.io.*;

public class Metodos1 {

    public static void main(String[] args) {
        double res = 0;
        res = cubo(7.5);// llamada
        System.out.println("El cubo de 7.5 es: " + res); 
        res = producto(7,3);// llamada
        System.out.println("El producto de 7 X 3 es: " + res); 
    }

    public static double cubo(double x) { // declaracion
        return x * x * x;
    } 
   public static int producto (int a, int b) { // declaracion
       int c;
       c = a*b;
       return c;
    }
}

//PRUEBA TABLA-------------------------------------------------------
import java.io.*;
import java.util.Scanner;

public class PruebaTabla {

    public static void main(String[] args) throws IOException {
        int val = 0;
        val = leer();
        tabla(val); // ejemplo de llamada
    }

    public static void tabla(int n) { // de tipo void
        System.out.println("Tabla de multiplicar del numero " + n);
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + producto(n, i));
        }
    }

    public static int leer() throws IOException {
        Scanner entrada = new Scanner(System.in);
        int valor;
        System.out.println("Teclea un numero del 1 al 10 seguido de ENTER");
        valor = entrada.nextInt();;
        return valor;
    }

    public static int producto(int a, int b) {
        return a * b;
    }
}


//AMBITO------------------------------------------
public class Ambito {

    public static void main(String[] args) {
        int i; boolean salida;
        for (i = 5; i >= -5; i--) {
            salida = esPositivo(i);
            System.out.println(i + " es positivo: " + salida);
            System.out.println("   y espar: " + esPar(i));
        }
    }

    public static boolean esPar(int p) {
        if (p % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esPositivo(int x) {
        if (x < 0) {
            return false;
        } else {
            return true;
        }
    }
}
