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

        // Creacion de matriz bidimensional
        System.out.println("De cuantas filas quieres crear la tabla");
        int m = entrada.nextInt();
        System.out.println("De cuantas columnos quieres crear la tabla");
        int n = entrada.nextInt();
        
        int matriz[][] = new int[m][n];

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
            System.out.println("9. Rellenar matriz");
            System.out.println("10. Mostrar matriz");
            System.out.println("11. Buscar un elemento en la matriz");
            System.out.println("12. Modificar un elemento en la matriz");
            System.out.println("13. Salir ");
            System.out.println("Elija una opción: ");


            // System.out.println("");
            option = entrada.nextInt();

            switch (option) {
            //APARTADO A
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
                System.out.println("Introduzca número de matricula: ");
                dato = entrada.nextInt();
                buscarAlumno(miClase, dato);
                break;

            case 5:
                System.out.println("*******MODIFICAR NOTA**********");
                nuevaNota = modificarDatos(miClase, tope, entrada);
               
                break;

            case 6:
                System.out.println("*******MOSTRAR LA NOTA ESCRITA**********");
                mostrarEscrito(miClase, tope, entrada);
               
                break;

            case 7:
                System.out.println("*******MOSTRAR LA PEOR NOTA**********");
                min = minArray(miClase, tope);
                System.out.println("La peor nota es:" + min);
                posicion = buscarNotas(miClase, tope, min);
                System.out.println("El alumno con la peor nota es " + (posicion + 1));
                break;

            case 8:
                System.out.println("*******MOSTRAR LAS NOTAS DE PORCENTAJE**********");
                modificarPocerntaje(miClase, tope, entrada);
                break;
            
            //APARTADO B

            case 9:
                System.out.println("*******RELLENAR MATRIZ**********");
                rellenarMatriz (matriz,entrada);
                break;

            case 10:
                System.out.println("*********MOSTRAR MATRIZ********");
                mostrarMatriz(matriz);
                break;

            case 11:
                System.out.println("*********BUSCAR ELEMENTO EN LA MATRIZ********");
                buscarMatriz (matriz, entrada);
                break;

            case 12:
                System.out.println("*********MODIFICAR ELEMENTO EN LA MATRIZ********");
                modificarMatriz (matriz, entrada);
                break;

            default:
                System.out.println("Hasta luego.");
            }

        } while (option != 13);
    }

//APARTADO A

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
    
    static double buscarAlumno(Alumno [] array, int dato) {
        double nota = 0;
        for (int i = 0; i <= dato; i++) {
            if (dato == i + 1) {
                System.out.println("El alumno [" + dato + "] tiene una nota de " + array[i].nota);
            }
        }
        return nota;
    }
    
    static int buscarNotas(Alumno [] array, int tope, double dato) {
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
    
    static double modificarDatos(Alumno [] array, int tope, Scanner entrada) {
        double notu, nuevaNota = 0;
        int dato;
        // Buscar nota del alumno
        System.out.println("Introduzca número de matricula: ");
        dato = entrada.nextInt();
        System.out.println("El alumno [" + array[dato-1].matricula + "] tiene una nota de " + array[dato-1].nota);
        
        // Modificar nota del alumno
        System.out.println("Introduzca la nueva nota: ");
        array[dato - 1].nota = entrada.nextDouble();
        nuevaNota = array[dato - 1].nota;
        return nuevaNota;
    }
    
    static void mostrarEscrito(Alumno [] arrayNotas, int tope, Scanner entrada) {
        for (int i = 0; i < tope; i++) {
            if (arrayNotas[i].nota < 5) {
                System.out.println("El alumno " + arrayNotas[i].matricula + " ha obtenido un suspenso");
            } else if (arrayNotas[i].nota >= 5 && arrayNotas[i].nota < 7) {
                System.out.println("El alumno " + arrayNotas[i].matricula + " ha obtenido un aprobado");
            } else if (arrayNotas[i].nota >= 7 && arrayNotas[i].nota < 9) {
                System.out.println("El alumno " + arrayNotas[i].matricula + " ha obtenido un notable");
            } else if (arrayNotas[i].nota >= 9 && arrayNotas[i].nota < 9.6) {
                System.out.println("El alumno " + arrayNotas[i].matricula + " ha obtenido un sobresaliente");
            } else {
                System.out.println("El alumno " + arrayNotas[i].matricula + " ha obtenido una matricula de honor");
            }

        }

    }
    
    static double minArray(Alumno [] array, int tope) {
        double min = array[0].nota;
        for (int i = 1; i < tope; i++) {
            if (array[i].nota < min) {
                min = array[i].nota;
            }
        }
        return min;
    }
    
    static void modificarPocerntaje(Alumno [] array, int tope, Scanner entrada){
        System.out.println("Dime el porcentaje en el que quieres modificar la nota");
        int dato;
        dato = entrada.nextInt();
        for (int i = 0; i < tope; i++) {
            array[i].nota = ((array[i].nota*dato/100)+ array[i].nota);
            if (array[i].nota > 10) {
                array[i].nota = 0;  
            } else if (array[i].nota > 10){
                array[i].nota = 10;
            }
            System.out.print("El alumno con matricula" + (i + 1)+ " ha sido modificada y es " + array[i].nota);
        }
    }

//APARTADO B

    static void rellenarMatriz (int array[][], Scanner entrada) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++ ){
                System.out.print("Insertar numero en la posicion ["+i+"]["+j+"]: ");
                array[i][j] = entrada.nextInt();
            }
        }

    }

    static void mostrarMatriz (int array[][]) {
        System.out.println("La matriz es: ");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++ ){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }

    }

    static void buscarMatriz (int array[][], Scanner entrada) {
        System.out.println("Introducir la fila a buscar: ");
        int fila = entrada.nextInt();
        System.out.println("Introducir la columna a buscar: ");
        int colum = entrada.nextInt();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++ ){
                if (i==fila && j==colum ){
                    System.out.println("El valor de la matriz en la posicion ["+i+"]["+j+"] es: "+ array[i][j]);
                }
            }
        }

    }

    static void modificarMatriz (int array[][], Scanner entrada) {
        System.out.println("Introducir la fila a modificar: ");
        int fila = entrada.nextInt();
        System.out.println("Introducir la columna a modificar: ");
        int colum = entrada.nextInt();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length;j++ ){
                if (i==fila && j==colum ){
                    System.out.println("Que dato desea introducir en lugar de : "+ array[i][j]);
                    array[i][j] = entrada.nextInt();
                }
            }
        } 
        System.out.println("El dato ha sido modificado ");

    }

}
