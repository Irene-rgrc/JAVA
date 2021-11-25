import java.io.Serializable;
import java.util.Scanner;

//CLASES
class Notas implements Serializable {
    String nombre;
    int edad;
    double nota;
}


public class Prac8B{
    public static void main(String[] args) {

        // DEFINICION DE VARIABLES
        int option, posicion;
        int tope = 0;
        int dato = 0;
        double nuevaNota, min;

        Scanner entrada = new Scanner(System.in);
        Notas [] miClase = new Notas[20];
        for (int i = 0; i < miClase.length; i++) {
            miClase[i] = new Notas();
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
                tope = insertarDatos(Notas[tope].nombre,Notas[tope].edad, Notas[tope].nota, tope, entrada);
                break;

            case 2:
                System.out.println("*******MOSTRAR DATOS**********");
                
                break;

            case 3:
                System.out.println("*******CALCULAR ESTADISTICAS**********");
               
                break;

            case 4:
                System.out.println("*******MONSTRAR NOTA DE ALUMNO**********");
                
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

    public static int insertarDatos(Notas [] nombre,Notas [] edad, Notas [] nota,int tope, Scanner entrada) {
        int seguir;
        //Meter notas
        System.out.println("¿Quieres introducir mas números? 1 Si 2 No");
        seguir = entrada.nextInt();
        do {
            System.out.println("Introduzca el nombre del alumno: ");
            Notas[tope].nombre = entrada.nextDouble();
            System.out.println("Introduzca la edad del alumno: ");
            Notas[tope].edad = entrada.nextDouble();
            System.out.println("Introduzca la nota del alumno: ");
            Notas[tope].nota = entrada.nextDouble();
            System.out.println("¿Quieres introducir mas números? 1 Si 2 No");
            seguir = entrada.nextInt();
            tope++;
        } while (seguir == 1 && tope < array.length);
        return tope;
    }

}




