import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int opcion, num1, num2;
        
        do{
            System.out.print("Introduzca un número ");
            num1 = entrada.nextInt();
            System.out.print("Introduzca otro un número ");
            num2 = entrada.nextInt();

        do {
            System.out.println(" ");
            System.out.println("1, Suma ");
            System.out.println("2, Resta ");
            System.out.println("3, Multiplicación ");
            System.out.println("4, División ");
            System.out.println("5, Resto ");
            System.out.println("6, Salir ");
            System.out.println(" ");
            
            opcion = entrada.nextInt(); 
            
            switch (opcion) {
                case 1:
                    System.out.print("La suma es " + (num1+num2));
                    break;
                case 2:
                    System.out.println("La resta es " + (num1-num2));
                    break;
                case 3:
                    System.out.print("La multiplicacion es "+ (num1 * num2));
                    break;   
                case 4:
                    System.out.print("La division es "+ (num1/num2));
                    break;
                case 5:
                    System.out.print("La resto es "+ (num1%num2));
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                
                default:
                    System.out.print("Opcion no correcta");      
            }
            
 
        } while (opcion != 6);
        
    }while (num1 > 0 && num2 > 0);
  }
}
    

