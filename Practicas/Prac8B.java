import java.io.Serializable;
import java.util.Scanner;

//CLASES
class Alumno implements Serializable {
    String nombre;
    int edad;
    double nota;
    int matricula;
}


public class Prac8B{
    public static void main(String[] args) {

        // DEFINICION DE VARIABLES
        int option, posicion;
        int tope = 0;
        int dato = 0;
        double nuevaNota, min;

        Scanner entrada = new Scanner(System.in);
        Alumno [] miClase = new Alumno[20];
        for (int i = 0; i < miClase.length; i++) {
            miClase[i] = new Alumno();
        }

        System.out.println("De cuantas filas quieres crear la tabla");

        System.out.println("De cuantas columnos quieres crear la tabla");

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
                tope = insertarDatos(miClase, tope, entrada);
                break;

            case 2:
                System.out.println("*******MOSTRAR DATOS**********");
                mostrarDatos(miClase, tope);
                break;

            case 3:
                System.out.println("*******CALCULAR ESTADISTICAS**********");
                 mostrarEstadistica(miClase, tope);
                break;

            case 4:
                System.out.println("*******MONSTRAR NOTA DE ALUMNO**********");
                buscarAlumno(miClase, dato, entrada);
                break;

            case 5:
                System.out.println("*******MODIFICAR NOTA**********");
               
                break;

            case 6:
                System.out.println("*******MOSTRAR LA NOTA ESCRITA**********");
               
                break;

            case 7:
                System.out.println("*******MOSTRAR LA PEOR NOTA**********");
                
                break;

            case 8:
                System.out.println("*******MOSTRAR LAS NOTAS DE PORCENTAJE**********");
                
                break;

            default:
                System.out.println("Hasta luego.");
            }

        } while (option != 9);
    }

    static int insertarDatos(Alumno [] array,int tope, Scanner entrada) {
        int seguir;
        //Meter notas
        //System.out.println("¿Quieres introducir mas números? 1 Si 2 No");
        //seguir = entrada.nextInt();
        array[tope] = new Alumno();
        do {
            array[tope].matricula = tope + 1;
            System.out.println("Introduzca el nombre del alumno: ");
            entrada.nextLine();
            array[tope].nombre = entrada.nextLine();
            System.out.println("Introduzca la edad del alumno: ");
            array[tope].edad = entrada.nextInt();
            System.out.println("Introduzca la nota del alumno: ");
            array[tope].nota = entrada.nextDouble();
            System.out.println("¿Quieres introducir mas números? 1 Si 2 No");
            seguir = entrada.nextInt();
            tope++;
        } while (seguir == 1 && tope < array.length);
        return tope;
    }
    
    static void mostrarDatos(Alumno [] array, int tope) {
        // System.out.println("Las notas son:");
        for (int i = 0; i < tope; i++) {
            System.out.println("El nombre del alumno  [" + array[i].matricula + "] es " + array[i].nombre);
            System.out.println("La edad del alumno  [" + array[i].matricula + "] es " + array[i].edad);
            System.out.println("La nota del alumno  [" + array[i].matricula + "] es " + array[i].nota);
        }
        System.out.println("");
    }
    
    static void mostrarEstadistica(Alumno [] arrayNotas, int tope) {
        // System.out.println("Las notas son:");
        // La media de la clase.
        double media = 0;
        double max = 0;
        int posicion = 0;
        for (int i = 0; i < tope; i++) {
            media = media + arrayNotas[i].nota;
        }
        media = media / (tope);
        System.out.println("La media de la clase es: " + media);

        // El porcentaje de aprobados
        int suficiente = 0;
        int notable = 0;
        int sobresaliente = 0;
        for (int i = 0; i < arrayNotas.length ; i++) {
            if (arrayNotas[i].nota >= 5 && arrayNotas[i].nota < 7 ) {
                suficiente++;
            }if (arrayNotas[i].nota >= 7 && arrayNotas[i].nota < 9) {
                notable ++;
            }if (arrayNotas[i].nota >= 9 && arrayNotas[i].nota < 9.7) {
                sobresaliente++;
            }
        }
        System.out.println("El porcentaje de aprobados es: " + (suficiente * 100) /tope);
        System.out.println("El porcentaje de notables es: " + (notable * 100) / 100);
        System.out.println("El porcentaje de sobresalientes es: " + (sobresaliente * 100) / tope);

        // Nota maxima
        max = maxArray(arrayNotas, tope);
        posicion = buscarNotas(arrayNotas, tope, max);
        System.out.println("El alumno " + (posicion + 1) + " ha obtenido " + max);

    }
    
    static double maxArray(Alumno [] array, int tope) {
        double max = array[0].nota;
        for (int i = 1; i < tope; i++) {
            if (array[i].nota > max) {
                max = array[i].nota;
            }
        }
        return max;
    }
    
    static void buscarAlumno(Alumno [] array, int tope, Scanner entrada) {
        System.out.print("Dime el número de matricula del alumno que buscas");
        int dato; dato = entrada.nextInt();
        for (int i = 0; i < tope; i++) {
            System.out.println("El nombre del alumno" + dato + " es "+ array[i].nombre);
            System.out.println("La edad del alumno" + dato + " es "+ array[i].edad);
            System.out.println("La nota del alumno" + dato + " es "+ array[i].nota);
        }
    }
    
    public static int buscarNotas(Alumno [] array, int tope, double dato) {
        boolean encontrado = false;
        int i = 0;
        while (i < tope && !encontrado) {
            if (dato == array[i].nota) {
                encontrado = true;
            } else {
                i++;
            }
        }
        return i;
    }
    
}
