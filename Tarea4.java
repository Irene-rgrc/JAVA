import java.util.Scanner;

public class Tarea4{
    public static void main(String[] args){
        System.out.println("********************************");
        System.out.println("Autor : Irene Rodriguez García");
        System.out.println("********************************");
        
        Scanner entrada = new Scanner(System.in);
        
        double agua, temperatura, temperaturaTotal, numero, multi;
        int option, i, d, a, azar, x;
           
        do {
            System.out.println("Menu) : ");
            System.out.println("1 Calcular el consumo del agua");
            System.out.println("2 Calcular la temperatura");
            System.out.println("3 Jugar al adivino");
            System.out.println("4 Monstrar la tabla de multiplicar al reves");
            System.out.println("5. - Salir");
        
            System.out.println("");
            option = entrada.nextInt();
            
            
            switch (option) {
            case 1:
                System.out.println("********* PRECIO DEL AGUA ************");
                System.out.println("Introduzca el consumo de agua en metros cubicos ");
                agua = entrada.nextDouble();
                
                if (agua <= 100){
                    System.out.println("Primer tramo");
                    System.out.println("El coste del agua este mes es: " + ((agua)*(0.15)));    
                }
                else if ( agua <= 600){
                    System.out.println("Segundo tramo");
                    System.out.println("El coste del agua este mes es: " + ((agua)*(0.20)));   
                }
                else if (600 < agua && agua <= 1100){
                    System.out.println("Tercer tramo");
                    System.out.println("El coste del agua este mes es: " + ((agua)*(0.35)));   
                }
                else {
                    System.out.println("Cuarto tramo");
                    System.out.println("El coste del agua este mes es: " + ((agua)*(0.35)));   
                }
                
                break;
                
            case 2:
                System.out.println("***********TEMPERATURAS**************");
                System.out.println("Introduzca el numero de temperatura (POSITIVIO) ");
                i = entrada.nextInt();
                temperaturaTotal = 0;
                a = 0;
                
                for (d = 1; d <= i; d++){
                    System.out.println("Temperatura numero " + d);
                    temperatura = entrada.nextDouble();
                    //Comparacion de 0
                    if (temperatura < 0){
                        a += 1;
                }
                    temperaturaTotal = temperaturaTotal + temperatura; 
                }
                System.out.println("Has introducido " + a + "temperaturas inferiores a 0");
                System.out.println("La temperatura media es " + ((temperaturaTotal)/i));
                
                break;
                
            case 3:
                System.out.println("***********ADIVINO**************");
                azar = (int) ((Math.random() * 100) + 1);
                
                System.out.println("Introduzca un numero");
                numero = entrada.nextDouble();
                int b = 0;
                while (azar != numero){
                    System.out.println("INTENTO NÚMERO" + b);
                    if (numero > azar){
                        System.out.println("El numero a adivinar es menor");
                    }
                    else{
                        System.out.println("El numero a adivinar es mayor");
                    }
                    b+=1;  
                }
                System.out.println("ENORABUENA HAS ACERTADO");
                
                break;
            case 4:
                System.out.println("********TABLA DE MULTIPLICAR*********");
                
                do {
                    System.out.println("Introduzca el numero a la tabla a mostrar (entre 1 y 10)");
                    multi = entrada.nextDouble();   
                } while (multi < 0);
                
                for(x = 10; x > 0; x--){
                    System.out.println(multi + "*" + x);   
                }
                
                break;
            default:       
            } 
        } while(option != 5);
    }  
}
