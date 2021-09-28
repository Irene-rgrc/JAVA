import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int opcion, num1, num2;
        
        do{
            System.out.print("Introduzca un número");
            num1 = entrada.nextInt();
            System.out.print("Introduzca otro un número");
            num2 = entrada.nextInt();

        do {
            System.out.println("1, Suma");
            System.out.println("2, Resta");
            System.out.println("3, Multiplicación");
            System.out.println("4, División");
            System.out.println("5, Resto");
            System.out.println("6, Salir");
            opcion = entrada.nextInt(); 
            
            switch (opcion) {
                case 1:
                    System.out.print("La suma es" + (num1+num2));
                    break;
                case 2:
                    System.out.print("La resta es"+ (num1-num2));
                    break;
                case 3:
                    System.out.print("La multiplicacion es"+ (num1 * num2));
                    break;   
                case 4:
                    System.out.print("La division es"+ (num1/num2));
                    break;
                case 5:
                    System.out.print("La resto es"+ (num1%num2));
                    break;
                default:
                    System.out.print("adios");      
            }
 
        } while (opcion != 6);
        
    }
  }
}
    
