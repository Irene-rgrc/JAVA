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
        System.out.println("-----------CADENAS-----------");
        System.out.print("Introduzca la primera cadena : ");
        cadena1 = entrada.nextLine();
        System.out.print("Introduzca la segunda cadena : ");
        cadena2 = entrada.nextLine();
            
        System.out.println("La longuitud de " + cadena1 + " es : "+ cadena1.length());
        System.out.println("La longuitud de " + cadena2 + " es : "+ cadena2.length());
            
        if(cadena1.compareTo(cadena2)==0){
            System.out.println("¿Son iguales las cadenas? true");
          }
        else{
            System.out.println("¿Son iguales las cadenas? false");
          }
            
        System.out.println("¿Son iguales las cadenas ignorando las minusculas y mayusculas? "+ cadena1.equalsIgnoreCase(cadena2));
            
        System.out.println("Primera cadena en mayusculas es : "+ cadena1.toUpperCase());
        System.out.println("Segunda cadena en minusculas es : "+ cadena2.toLowerCase());
            
        if (cadena1.contains("a")){
            System.out.println("Indice de la primera aparición de 'a' es : "+ cadena1.indexOf('a'));
            System.out.println("Indice de la última aparición de 'a' es : "+ cadena1.lastIndexOf('a'));
          }
       
                    
    
        //*TRIANGULO
        
        System.out.println("----------TRIANGULO----------");
        System.out.print("Introduzca el primer lado : ");
        num1 = entrada.nextDouble();
        System.out.print("Introduzca el otro lado : ");
        num2 = entrada.nextDouble();
        System.out.print("Introduzca el angulo : ");
        angulo = entrada.nextDouble();
            
        System.out.print("El área del triangulo es : "+ ((num1*num2*Math.sin((Math.toRadians(angulo)))/2)));
        System.out.println(" ");
        
    }
}
