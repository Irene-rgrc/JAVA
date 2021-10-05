import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args){
        System.out.println("Programa realizado por : ");
        System.out.println("Irene Rodriguez García");
        System.out.println("--------------------------------");
        
        Scanner entrada = new Scanner(System.in);
        int num1, num2;

        //Entrada de los numbers
        System.out.print("Introduzca el primer numero entero : ");
        num1 = entrada.nextInt();
        System.out.print("Introduzca el segundo numero entero : ");
        num2 = entrada.nextInt();
        //Salida
        System.out.println( num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println( num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println( num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println( num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println( num1 + " % " + num2 + " = " + (num1%num2));


    }
}
