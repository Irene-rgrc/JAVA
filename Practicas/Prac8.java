import java.util.Scanner;

public class Prac8 {

    public static int insertarDatos(double[] array, int tope, Scanner entrada) {
        int seguir;
        System.out.println("¿Quieres introducir mas números? 1 Si 2 No");
        seguir = entrada.nextInt();
        while (seguir == 1 && tope < array.length) {
            array[tope] = entrada.nextDouble();
            System.out.println("¿Quieres introducir mas números? 1 Si 2 No");
            seguir = entrada.nextInt();
            tope++;
        } return tope;
    }

    public static void mostrarDatos(double[] array, int tope) {
        //System.out.println("Las notas son:");
        for (int i = 0; i < tope; i++) {
            System.out.print("La nota del alumno ["+ (i+1) + "]: " + array[i] + "\t");    
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
        if (encontrado) {
            System.out.println("Encontrado en la posicion: "+ i);
        } else {
            System.out.println("No encontrado");
        }
        return i;
    }
    
    public static double buscarAlumno(double[] array, int dato) {
        double nota = 0;
        for (int i=0; i<=dato; i++){
            if (dato == i+1){
                System.out.println("El alumno [" + dato + "] tiene una nota de "+ array[i]);
            }
        } return nota;
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
    
    public static void mostrarEstadistica(double[] arrayNotas,int tope) {
        //System.out.println("Las notas son:");
        //La media de la clase.
        double media = 0; double max = 0; int posicion = 0;
        for (int i = 0; i < tope; i++) {
            media = media +arrayNotas[i];    
        }
        media = media/(tope);
        System.out.println("La media de la clase es: " + media);
        
        //El porcentaje de aprobados
        int suficiente = 0;int notable = 0; int sobresaliente = 0;
        for (int i = 0; i < tope; i++) {
            if (arrayNotas[i] >= 5){
                suficiente++;
            } 
            if (arrayNotas[i] >= 7){
                notable++;
            } 
            if (arrayNotas[i] >= 9){
                sobresaliente++;
            } 
        }
        System.out.println("El porcentaje de aprobados es: " + (suficiente/tope)*100);
        System.out.println("El porcentaje de notables es: " + (notable/tope)*100);
        System.out.println("El porcentaje de sobresalientes es: " + (sobresaliente/tope)*100);
        
        //Nota maxima
        max = maxArray(arrayNotas,tope);
        posicion = buscarDato(arrayNotas, tope, max);
        System.out.println("El alumno " + (posicion+1) + " ha obtenido " + max );
        
        
    }
        
    public static double modificarDatos(double[] array, int tope, Scanner entrada) {
        double nota, nuevaNota = 0; int dato = 0;
        //Buscar nota del alumno
        System.out.println("Introduzca número de matricula: ");
        dato = entrada.nextInt();
        nota = buscarAlumno(array,tope);
        System.out.println("La nota actual del alumno "+dato+" es "+ nota);
        //Modificar nota del alumno
        System.out.println("Introduzca la nueva nota: ");
        array[dato-1]=entrada.nextDouble();
        nuevaNota = array[dato-1];
        return nuevaNota;
    }
    
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("Autor : Irene Rodriguez García");
        System.out.println("********************************");

        //variables de la funcion de valorar si es primo o no
        int option;
        int tope = 0;
        int dato = 0;
        double nuevaNota;

        double[] notas = new double[20];

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
                    System.out.println("*******INTRODUCIR NOTAS**********");
                    tope = insertarDatos(notas, tope, entrada);
                    break;

                case 2:
                    System.out.println("*******MOSTRAR DATOS**********");
                    mostrarDatos(notas, tope);
                    break;

                case 3:
                    System.out.println("*******CALCULAR ESTADISTICAS**********");
                    mostrarEstadistica(notas,tope);

                    break;

                case 4:
                    System.out.println("*******MONSTRAR NOTA DE ALUMNO**********");
                    System.out.println("Introduzca número de matricula: ");
                    dato = entrada.nextInt();
                    buscarAlumno(notas,dato);

                    break;

                case 5:
                    System.out.println("*******MODIFICAR NOTA**********");
                    nuevaNota = modificarDatos(notas, tope, entrada);

                    break;

                case 6:
                    System.out.println("*******MOSTRAR LA NOTA ESCRITA**********");
                    

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
