/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author i.rodriguezga.2021
 */
public class Clas12 {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        // EJERCICIO 6
        //CREAR FICHERO STRING Y QUE PUEDAS METER LOD NUMEROS
        /*try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("datos1.dat"));
            System.out.println("Dame la frase para escribi4r en dicho fichero");
            String frase = sc.nextLine();
            out.writeObject(frase);
            out.close();
        } catch(IOException e1){
            System.out.println(e1.getMessage());
        }
        try {
            //Monto un flujo para leer el fichero en binario
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("datos1.dat"));
            System.out.print(" la frase guradada es: "+ (String) in.readObject());
        } catch (IOException e2){
            System.out.println(e2.getMessage());
        }
        */
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("datos1.txt"));
            System.out.println("Dame la frase para escribi4r en dicho fichero");
            String frase = sc.nextLine();
            out.write(frase);
            out.close();
        } catch(IOException e1){
            System.out.println(e1.getMessage());
        }
        try {
            //Monto un flujo para leer el fichero en binario
            BufferedReader in = new BufferedReader(new FileReader("datos1.txt"));
            System.out.print(" la frase guradada es: "+  in.readLine());
        } catch (IOException e2){
            System.out.println(e2.getMessage());
        }
        //SACAR LOS CARACTERES POR PANTALLA Y CONTAR LOS CARACTERES QUE TIENE
        
    }
    
}

