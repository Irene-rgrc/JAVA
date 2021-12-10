import java.util.Scanner;
import java.io.*;
import static java.lang.System.in;

class Alumno implements Serializable{
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
        int tope = 0; int tope2 = 0;

        Scanner entrada = new Scanner(System.in);
        Alumno [] miAlumno = new Alumno[20];
        for (int i = 0; i < miAlumno.length; i++) {
            miAlumno[i] = new Alumno();
        }
        Persona[] miAgenda = new Persona[40];
        for(int i=0 ; i<miAgenda.length ; i++){
            miAgenda[i] = new Persona();
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
                tope2 = crearAgenda(miAgenda, tope2, entrada);
                break;

            case 2:
                System.out.println("*******MOSTRAR AGENDA**********");
                leerAgenda(miAgenda, tope2);
                break;

            case 3:
                System.out.println("*******CREAR FICHERO AMIGO**********");
                crearFichero(entrada);
                break;

            case 4:
                System.out.println("*******MONSTRAR FICHERO AMIGO**********");
                leerFichero();
                break;

            default:
                System.out.println("Hasta luego.");
            }

        } while (option != 5);
    }

    static int crearAgenda(Persona [] array, int tope2, Scanner entrada){
        int seguir = 0;
        String nombre = array[tope2].nombre;
        String telefono = array[tope2].telefono;
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("agenda.txt", true));
            do {
                System.out.println("Introduzca el nombre");
                entrada.nextLine();
                nombre = entrada.nextLine();
                System.out.println("Introduzca el telefono");
                telefono = entrada.nextLine();
                out.write("Nombre: " + nombre + " Telefono: " + telefono + "\n");
                System.out.println("Desea introducir mas contactos: 1 Si 2 No");
                seguir = entrada.nextInt();
                tope2++;
            } while (seguir !=  2);
            out.close();
        } catch(IOException e1){
            System.out.println(e1.getMessage());
        }
        return tope2;

    }

    static void leerAgenda (Persona [] array, int tope2)  throws FileNotFoundException, IOException{
        
        try {
            BufferedReader in = new BufferedReader(new FileReader("agenda.txt"));
            String vacio;
            vacio = in.readLine();
            //METER BUCLE while (nosequeponeraqui != null){ aqui como las separo?}
            while (vacio != null){
                System.out.println(vacio);
                vacio = in.readLine();
            }
            
        } catch (IOException e2){
            System.out.println(e2.getMessage());
        }
    }
    
    static void crearFichero(Scanner entrada){
        int seguir = 0;
        Alumno alumno;
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("amigos.dat", true));
            do {
                alumno = new Alumno();
                System.out.println("Dame el nombre");
                entrada.nextLine();
                alumno.nombre = entrada.nextLine();
                System.out.println("Dame la edad");
                alumno.edad = entrada.nextInt();
                System.out.println("Dame la direccion");
                entrada.nextLine();
                alumno.direccion = entrada.nextLine();
                out.writeObject(alumno);
                System.out.println("Desea introducir mas numeros: 1 Si 2 No");
                seguir = entrada.nextInt();
               
            } while (seguir !=  2);
            
            out.close();
        } catch(IOException e1){
            System.out.println(e1.getMessage());
        } 
    }

    static void leerFichero () throws ClassNotFoundException{   
        try {
            Alumno alumno;
            //Monto un flujo para leer el fichero en binario
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("fichero.dat"));
            alumno = (Alumno) in.readObject();
            while (alumno != null){
                System.out.println("Nombre: " + alumno.nombre);
                System.out.println("Edad: " + alumno.edad);
                System.out.println("Direccion: " + alumno.direccion);
                alumno = (Alumno) in.readObject();  
            }
        } catch (IOException e2){
            System.out.println(" ");
        }
    }
    
}
