import java.util.Scanner;

public class Prac8 {

    public static int insertarDatos(double[] array, int tope, Scanner entrada) {
        int seguir;
        System.out.println("¿Quieres introducir mas números? 1 Si 2 No");
        seguir = entrada.nextInt();
        do {
            System.out.println("Introduzca la nota del alumno: ");
            array[tope] = entrada.nextDouble();
            System.out.println("¿Quieres introducir mas números? 1 Si 2 No");
            seguir = entrada.nextInt();
            tope++;
        } while (seguir == 1 && tope < array.length);
        return tope;
    }

     
    public static void ModificarPorcentaje(double[] array, int tope, Scanner entrada) {
        System.out.println("Dime el porcentaje en el que quieres modificar la nota");
        int dato;
        double modificacion;
        dato = entrada.nextInt();
        dato = dato / 100;

        for (int i = 0; i < tope; i++) {
            if (dato <= 100 && dato >= 0) {
                modificacion = (dato / 100) * array[i] + array[i];
                System.out.println("El alumno " + array[i] + " ha sido modificada en " + modificacion);
            } else {
                if (dato > 100 && dato < -100) {
                    System.out.println("Porcentaje no vÃ¡lido");
                }
                if (dato < 0 && dato < -100) {
                    modificacion = ((dato / 10) - 10) * array[i] + array[i];
                    System.out.println("El alumno " + array[i] + " ha sido modificada en " + modificacion);
                }
            }
        }
    }

    public static void mostrarDatos(double[] array, int tope) {
        // System.out.println("Las notas son:");
        for (int i = 0; i < tope; i++) {
            System.out.print("La nota del alumno [" + (i + 1) + "]: " + array[i] + "\t");
        }
        System.out.println("");
    }

    public static int buscarDato(double[] array, int tope, double dato) {
        boolean encontrado = false;
        int i = 0;
        while (i < tope && !encontrado) {
            if (dato == array[i]) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return i;
    }

    public static double buscarAlumno(double[] array, int dato) {
        double nota = 0;
        for (int i = 0; i <= dato; i++) {
            if (dato == i + 1) {
                System.out.println("El alumno [" + dato + "] tiene una nota de " + array[i]);
            }
        }
        return nota;
    }

    public static double maxArray(double[] array, int tope) {
        double max = array[0];
        for (int i = 1; i < tope; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double minArray(double[] array, int tope) {
        double min = array[0];
        for (int i = 1; i < tope; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void mostrarEstadistica(double[] arrayNotas, int tope) {
        // System.out.println("Las notas son:");
        // La media de la clase.
        double media = 0;
        double max = 0;
        int posicion = 0;
        for (int i = 0; i < tope; i++) {
            media = media + arrayNotas[i];
        }
        media = media / (tope);
        System.out.println("La media de la clase es: " + media);

        // El porcentaje de aprobados
        int suficiente = 0;
        int notable = 0;
        int sobresaliente = 0;
        for (int i = 0; i < arrayNotas.length ; i++) {
            if (arrayNotas[i] >= 5 && arrayNotas[i] < 7 ) {
                suficiente++;
            }if (arrayNotas[i] >= 7 && arrayNotas[i] < 9) {
                notable ++;
            }if (arrayNotas[i] >= 9 && arrayNotas[i] < 9.7) {
                sobresaliente++;
            }
        }
        System.out.println("El porcentaje de aprobados es: " + (suficiente * 100) /tope);
        System.out.println("El porcentaje de notables es: " + (notable * 100) / 100);
        System.out.println("El porcentaje de sobresalientes es: " + (sobresaliente * 100) / tope);

        // Nota maxima
        max = maxArray(arrayNotas, tope);
        posicion = buscarDato(arrayNotas, tope, max);
        System.out.println("El alumno " + (posicion + 1) + " ha obtenido " + max);

    }

    public static double modificarDatos(double[] array, int tope, Scanner entrada) {
        double nota, nuevaNota = 0;
        int dato = 0;
        // Buscar nota del alumno
        System.out.println("Introduzca número de matricula: ");
        dato = entrada.nextInt();
        nota = buscarAlumno(array, tope);
        // Modificar nota del alumno
        System.out.println("Introduzca la nueva nota: ");
        array[dato - 1] = entrada.nextDouble();
        nuevaNota = array[dato - 1];
        return nuevaNota;
    }

    public static void mostrarEscrito(double[] arrayNotas, int tope, Scanner entrada) {
        for (int i = 0; i < tope; i++) {
            if (arrayNotas[i] < 5) {
                System.out.println("El alumno " + (i + 1) + " ha obtenido un suspenso");
            } else if (arrayNotas[i] >= 5 && arrayNotas[i] < 7) {
                System.out.println("El alumno " + (i + 1) + " ha obtenido un aprobado");
            } else if (arrayNotas[i] >= 7 && arrayNotas[i] < 9) {
                System.out.println("El alumno " + (i + 1) + " ha obtenido un notable");
            } else if (arrayNotas[i] >= 9 && arrayNotas[i] < 9.6) {
                System.out.println("El alumno " + (i + 1) + " ha obtenido un sobresaliente");
            } else {
                System.out.println("El alumno " + (i + 1) + " ha obtenido una matricula de honor");
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("Autor : Irene Rodriguez García");
        System.out.println("********************************");

        // variables de la funcion de valorar si es primo o no
        int option, posicion;
        int tope = 0;
        int dato = 0;
        double nuevaNota, min;

        double[] notas = new double[20];

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Menu : ");
            System.out.println("1. Introducir notas.");
            System.out.println("2. Mostrar notas.");
            System.out.println("3. Calcular estadísticas:");
            System.out.println("4. Mostrar la nota de un alumno concreto.");
            System.out.println("5. Modificar la nota de un alumno concreto");
            System.out.println("6. Mostrar la nota escrita");
            System.out.println("7.Mostrar la nota del alumno con peor nota");
            System.out.println("8. Modificar todas las notas en un porcentaje,");
            System.out.println("9. Salir ");
            System.out.println("Elija una opción: ");


            // System.out.println("");
            option = entrada.nextInt();

            switch (option) {
            case 1:
                System.out.println("*******INTRODUCIR NOTAS**********");
                tope = insertarDatos(notas, tope, entrada);
                break;

            case 2:
                System.out.println("*******MOSTRAR DATOS**********");
                mostrarDatos(notas, tope);
                break;

            case 3:
                System.out.println("*******CALCULAR ESTADISTICAS**********");
                mostrarEstadistica(notas, tope);
                break;

            case 4:
                System.out.println("*******MONSTRAR NOTA DE ALUMNO**********");
                System.out.println("Introduzca número de matricula: ");
                dato = entrada.nextInt();
                buscarAlumno(notas, dato);
                break;

            case 5:
                System.out.println("*******MODIFICAR NOTA**********");
                nuevaNota = modificarDatos(notas, tope, entrada);
                break;

            case 6:
                System.out.println("*******MOSTRAR LA NOTA ESCRITA**********");
                mostrarEscrito(notas, tope, entrada);
                break;

            case 7:
                System.out.println("*******MOSTRAR LA PEOR NOTA**********");
                min = minArray(notas, tope);
                System.out.println("La peor nota es:" + min);
                posicion = buscarDato(notas, tope, min);
                System.out.println("El alumno con la peor nota es " + (posicion + 1));
                break;

            case 8:
                System.out.println("*******MOSTRAR LAS NOTAS DE PORCENTAJE**********");
                ModificarPorcentaje(notas, tope, entrada);
                break;

            default:
                System.out.println("Hasta luego.");
            }

        } while (option != 9);
    }
}
