import java.util.Scanner;


public class Tarea3 {
    public static void main(String[] args){
        System.out.println("Programa realizado por : ");
        System.out.println("Irene Rodriguez García");
        System.out.println("--------------------------------");
        
        Scanner entrada = new Scanner(System.in);
        int num1;

        //Entrada de los numbers
        System.out.println("----------CUATRIMESTRE----------");
        System.out.print("Introduzca mes (entre 1 y 12) : ");
        num1 = entrada.nextInt();

        //Procesador de datos5
        
        if (num1<=3) {
            //Salida
            System.out.println("Primer cuatrimestre");
        }
        if (num1>3 && num1<=6) {
            System.out.println("Segundo cuatrimestre");
        }
        if (num1>6 && num1<=9) {
            System.out.println("Tercer cuatrimestre");
        }
        if (num1 >= 10) {
            System.out.println("Cuarto cuatrimestre");
        }

    }
    
}
