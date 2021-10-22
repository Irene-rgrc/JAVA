import java.util.Scanner;

public class Prac5 {

    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("Autor : Irene Rodriguez García");
        System.out.println("********************************");

        int option;
        int i, j, tope;
        boolean esPrimo;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Menu) : ");
            System.out.println("1 Números primos en un rango");
            System.out.println("2 Suma de primos en un rango");
            System.out.println("3 Gasto de compras");
            System.out.println("4 Salir");

            //System.out.println("");
            option = entrada.nextInt();

            switch (option) {
                case 1:
                    //Meto los dos valores
                    int prim1,
                     prim2;
                    int a;
                    int b;
                    b = 0;

                    do {
                        System.out.println("Introduzca un número");
                        prim1 = entrada.nextInt();

                    } while (prim1 < 0);
                    do {
                        System.out.println("Introduzca un número");
                        prim2 = entrada.nextInt();
                    } while (prim2 < 0);
                    // Sacar la cadena entre un número y otro
                    if (prim1 < prim2) {
                        a = prim1;
                        prim1 = prim2;
                        prim2 = a;
                    }
                    for (i = prim2; i <= prim1; i++) {
                        esPrimo = true;
                        j = 2;
                        for (j = 2; j < i; j++) {
                            if (i % j == 0) {
                                esPrimo = false;
                            }
                        }
                        while (esPrimo && j < i) {
                            if (i % j == 0) {
                                esPrimo = false;
                            }
                            j++;
                        }
                        if (esPrimo) {
                            b++;

                        }

                    }
                    System.out.println("Entre " + prim1 + " y " + prim2 + " hay " + b);

                    break;

                case 2:
                    System.out.println("******* SUMA INTERVALOS PRIMOS **********");

                    break;

                case 3:
                    System.out.println("******* GASTOS DE COMPRAS DE HOY **********");

                    break;

                default:
                    System.out.println("");
            }
        } while (option != 4);
    }
}
