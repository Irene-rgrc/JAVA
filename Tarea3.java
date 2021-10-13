import java.util.Scanner;

public class Tarea3{
    public static void main(String[] args){
        System.out.println("Programa realizado por : ");
        System.out.println("Irene Rodriguez García");
        System.out.println("--------------------------------");
        
        Scanner entrada = new Scanner(System.in);
        int num1;
        double num2, x;

        //APARTADO C

        //Entrada de los numbers
        System.out.println("----------CUATRIMESTRE----------");
        System.out.print("Introduzca mes (entre 1 y 12) : ");
        num1 = entrada.nextInt();

        //Salida de datos
        
        if (num1<=3) {
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

        //APARTADO D

        //Entrada
        System.out.println("----------FUNCION F(X)----------");
        System.out.print("Introduzca el valor de x : ");
        num2 = entrada.nextDouble();

        //Salida
        if (num2 < 0) {
            System.out.println("Error, negative number");
        }
        if (0 <= num2 && num2 < 1) {
            x = ((num2*num2)-5);
            System.out.println("f(" + num2 +") = " + x);
        }
        if (1 <= num2 && num2 < 3) {
            x = ((num2)+ Math.sin(Math.toRadians(num2)));
            System.out.println("f(" + num2 +") = " + x);
        }
        if (3 <= num2 && num2 < 5) {
            x = 3;
            System.out.println("f(" + num2 +") = " + x);
        }
        if (num2 >= 5) {
            x = (num2*num2);
            System.out.println("f(" + num2 +") = " + x);
        }


    }  
}

