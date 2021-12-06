import java.util.Scanner;
import java.io.*;

public class Practica9 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    
        System.out.println("********************************");
        System.out.println("Autor : Irene Rodriguez García");
        System.out.println("********************************");

        // variables de la funcion de valorar si es primo o no
        int option;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Menu : ");
            System.out.println("1. Crear agenda.");
            System.out.println("2. Mostrar agenda.");
            System.out.println("3. Crear fichero amigo.");
            System.out.println("4. Mostrar fichero amigo.");
            System.out.println("5. Finalizar");

            System.out.println("Elija una opción: ");

            option = entrada.nextInt();

            switch (option) {
            case 1:

                System.out.println("*******CREAR AGENDA**********");
                
                break;

            case 2:
                System.out.println("*******MOSTRAR AGENDA**********");
                
                break;

            case 3:
                System.out.println("*******CREAR FICHERO AMIGO**********");
                
                break;

            case 4:
                System.out.println("*******MONSTRAR FICHERO AMIGO**********");
                
                break;

            default:
                System.out.println("Hasta luego.");
            }

        } while (option != 5);
    }
    
}
