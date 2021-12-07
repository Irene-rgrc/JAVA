import java.util.Scanner;
import java.io.*;

class Alumno {
    String nombre, direccion;
    int edad;
}

class Persona {
    String nombre;
    String telefono;
}


public class Prac9 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
    
        System.out.println("********************************");
        System.out.println("Autor : Irene Rodriguez García");
        System.out.println("********************************");

        // DEFINICION DE VARIABLES
        int option;
        int tope = 0;

        Scanner entrada = new Scanner(System.in);
        Alumno [] miAlumno = new Alumno[20];
        for (int i = 0; i < miAlumno.length; i++) {
            miAlumno[i] = new Alumno();
        }

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
                tope = crearFichero(miAlumno, tope, entrada);
                break;

            case 4:
                System.out.println("*******MONSTRAR FICHERO AMIGO**********");
                leerFichero(miAlumno, tope, entrada);
                break;

            default:
                System.out.println("Hasta luego.");
            }

        } while (option != 5);
    }

    static int crearAgenda(Alumno [] array, int tope, Scanner entrada){
        int seguir = 0;
        String nombre = array[tope].nombre;
        String telefono = array[tope].telefono;
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("datos1.txt"));
            do {
                System.out.println("Introduzca el nombre");
                String frase = entrada.nextLine();
                nombre = entrada.nextLine();
                out.write(nombre);
                System.out.println("Introduzca el telefono");
                telefono = entrada.nextLine();
                out.write(telefono);
                System.out.println("Desea introducir mas contactos: 1 Si 2 No");
                seguir = entrada.nextInt();
                tope++;
            } while (seguir !=  2);
            out.close();
        } catch(IOException e1){
            System.out.println(e1.getMessage());
        }
        return tope;

    }
    
    static int crearFichero(Alumno [] array, int tope, Scanner entrada){
        int seguir = 0;
        String nombre = array[tope].nombre;
        int edad = array[tope].edad;
        String direccion = array[tope].direccion;
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("fichero.dat"));
            do {
                System.out.println("Dame el nombre");
                entrada.nextLine();
                nombre = entrada.nextLine();
                out.writeObject(nombre);
                System.out.println("Dame la edad");
                edad = entrada.nextInt();
                out.writeObject(edad);
                System.out.println("Dame la direccion");
                entrada.nextLine();
                direccion = entrada.nextLine();
                out.writeObject(direccion);
                System.out.println("Desea introducir mas numeros: 1 Si 2 No");
                seguir = entrada.nextInt();
                tope++;
            } while (seguir !=  2);
            
            out.close();
        } catch(IOException e1){
            System.out.println(e1.getMessage());
        }
        return tope;
    }

    static void leerFichero (Alumno [] array, int tope, Scanner entrada) throws ClassNotFoundException{   
        try {
            //Monto un flujo para leer el fichero en binario
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("fichero.dat"));
            System.out.println("Nombre: "+ (String) in.readObject());
            String nombre = (String) in.readObject();
            String palabras1[] = nombre.split(" ");
            System.out.println("Edad: "+ (int) in.readObject());
            int edad = (int) in.readObject();
            System.out.println("Direccion: "+ (String) in.readObject());
            String direccion = (String) in.readObject();
            String palabras2[] = direccion.split(" ");

        } catch (IOException e2){
            System.out.println(e2.getMessage());
        }
    }
    
}
