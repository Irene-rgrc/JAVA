import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args){
        System.out.println("Programa realizado por : ");
        System.out.println("Irene Rodriguez García");
        System.out.println("--------------------------------");
        Scanner entrada = new Scanner(System.in);
        String cadena1;
        String cadena2;
        double num1, num2, angulo;
        //*COMPARACIÓN DE DOS CADENAS
        do {
            System.out.println("-----------CADENAS-----------");
            System.out.println("Introduzca la primera cadena : ");
            cadena1 = entrada.nextLine();
            System.out.println("Introduzca la segunda cadena : ");
            cadena2 = entrada.nextLine();
            
            System.out.println("La longuitud de " + cadena1 + " es "+ cadena1.length());
            System.out.println("La longuitud de " + cadena2 + " es "+ cadena2.length());
            
            if(cadena1.compareTo(cadena2)==0){
                System.out.println("¿Son iguales las cadenas? True");
            }
            else{
                System.out.println("¿Son iguales las cadenas? False");
            }
            
            System.out.println("¿Son iguales las cadenas ignorando las minusculas y mayusculas?"+ cadena1.equalsIgnoreCase(cadena2));
            
            System.out.println("Primera cadena en mayusculas "+ cadena1.toUpperCase());
            System.out.println("Segunda cadena en mayusculas "+ cadena2.toLowerCase());
                    
            
            
    
        //*TRIANGULO
        
            System.out.println("----------TRIANGULO----------");
            System.out.println("Introduzca el primer lado : ");
            num1 = entrada.nextInt();
            System.out.println("Introduzca el otro lado : ");
            num2 = entrada.nextInt();
            System.out.println("Introduzca el angulo : ");
            angulo = entrada.nextInt();
            
            System.out.print("El área del triangulo es : "+ ((num1*num2*sin(angulo))/2))
            System.out.println(" ");

        
    }while (True);
  }
} 
