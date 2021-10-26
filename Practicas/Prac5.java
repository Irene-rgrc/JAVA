package Homework;

import java.util.Scanner;

public class Prac5 {

    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("Autor : Irene Rodriguez García");
        System.out.println("********************************");

        //variables de la funcion de valorar si es primo o no
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
                    System.out.println("******** NÚMEROS PRIMOS **********");
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
                    System.out.println(" ");

                    break;

                case 2:
                    System.out.println("******* SUMA INTERVALOS PRIMOS **********");
                    //Variables
                    int num1, num2, limi1, limi2, limi3, limi4; limi1 = 10; limi2 = 50; limi3 = 51; limi4 = 100;
                    int lista; lista = 0;
                    // Entrada
                    System.out.println("Introduzca un número entre el 10 y 50");
                    num1 = entrada.nextInt();
                    while (num1 < limi1 || num1 > limi2) {
                        System.out.println("El primer número no esta entre 10 y 50");
                        System.out.println("Introduzca un número entre el 10 y 50");
                        num1 = entrada.nextInt();
                    }
                    System.out.println("Introduzca un número entre el 51 y 100");
                    num2 = entrada.nextInt();
                    while (num2 < limi3 || num2 > limi4) {
                        System.out.println("El segundo número no esta entre 10 y 50");
                        System.out.println("Introduzca un número entre el 51 y 100");
                        num2 = entrada.nextInt();
                    }
                    // Salida
                    for (i = num1; i <= num2; i++) {
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
                            lista = lista + i;
                        }
                    }

                    System.out.println("Entre " + num1 + " y " + num2 + " la suma de primos es " + lista);
                    System.out.println(" ");

                    break;

                case 3:
                    System.out.println("******* GASTOS DE COMPRAS DE HOY **********");
                    // Variables
                    int numProductos, totalProductos; numProductos = 0; totalProductos = 0;
                    double totalPrecio, precio ; totalPrecio = 0; precio = 0;
                    int choose;
                    int lim1, lim2, lim3; lim1 = 50; lim2 = 100; lim3 = 150; 

                    do {
                        System.out.println("Introduzca el numero de productos a ese precio");
                        numProductos = entrada.nextInt();   
                    } while (numProductos < 0);
                    totalProductos += numProductos;
                    do {
                        System.out.println("Introduzca el numero de productos a ese precio");
                        precio = entrada.nextDouble();   
                    } while (precio <= 0);
                    totalPrecio += (precio*numProductos);

                    System.out.println("Quieres introducir mas productos? 1 Si, 2 No");
                    choose = entrada.nextInt();
                    while (choose != 2) {
                        do {
                            System.out.println("Introduzca el numero de productos a ese precio");
                            numProductos = entrada.nextInt();   
                        } while (numProductos < 0);
                        totalProductos += numProductos;

                        do {
                            System.out.println("Introduzca el numero de productos a ese precio");
                            precio = entrada.nextDouble();   
                        } while (precio <= 0);
                        
                        totalPrecio += (precio*numProductos);
    
                        System.out.println("Quieres introducir mas productos? 1 Si, 2 No");
                        choose = entrada.nextInt();
                    }
                    System.out.println("El numero de productos es: " + totalProductos);
                    System.out.println("El importe gastado hoy es: " + totalPrecio);

                    if (totalPrecio <= lim1){
                        System.out.println("Gasto contenido");
                    } else if (totalPrecio > lim1 && totalPrecio <= lim2){
                        System.out.println("Si era necesario...");
                    } else if (totalPrecio > lim2 && totalPrecio <= lim3){
                        System.out.println("Has gastado mucho");
                    } else {
                        System.out.println("Te has pasado bacalao");
                    }

                    System.out.println(" ");

                    break;

                default:
                    System.out.println("Hasta luego.");
            }

        } while (option != 4);
    }
}

