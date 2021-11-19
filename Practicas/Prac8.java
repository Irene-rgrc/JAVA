import java.util.Scanner;

public class Prac8 {

    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("Autor : Irene Rodriguez García");
        System.out.println("********************************");

        //variables de la funcion de valorar si es primo o no
        int option;
        int tope = 0;

        double[] notas = new double[20];
        int[] alumnos = new int[20];

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Menu : ");
            System.out.println("1 Introducir notas.");
            System.out.println("2 Mostrar notas.");
            System.out.println("3 Calcular estadísticas:");
            System.out.println("4 Mostrar la nota de un alumno concreto.");
            System.out.println("5 Modificar la nota de un alumno concreto");
            System.out.println("6 Mostrar la nota escrita");
            System.out.println("7 Mostrar la nota del alumno con peor nota");
            System.out.println("8 Modificar todas las notas en un porcentaje,");
            System.out.println("9 Salir ");

            //System.out.println("");
            option = entrada.nextInt();

            switch (option) {
                case 1:
                    int seguir;
                    double a;

                    System.out.println("¿Quieres introducir mas números?");
                    seguir = entrada.nextInt();
                    while (seguir == 1) {
                        for (tope<notas.length; tope++) {
                            a = entrada.nextDouble();
                            notas[tope] = a;
                            System.out.println("¿Quieres introducir mas números?");
                            seguir = entrada.nextInt();
                        }
                    }

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    break;

                case 6:

                    break;

                case 7:

                    break;

                case 8:

                    break;

                default:
                    System.out.println("Hasta luego.");
            }

        } while (option != 9);
    }
}
