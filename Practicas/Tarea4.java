
import java.util.Scanner;

public class Tarea4 {

    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("Autor : Irene Rodriguez García");
        System.out.println("********************************");

        Scanner entrada = new Scanner(System.in);

        double agua, temperatura, temperaturaTotal;
        int option, i, d, a, azar, x, multi;
        final double tram1, tram2, tram3;
        tram1 = 100;
        tram2 = 600;
        tram3 = 1100;

        do {
            System.out.println("Menu) : ");
            System.out.println("1 Calcular el consumo del agua");
            System.out.println("2 Calcular la temperatura");
            System.out.println("3 Jugar al adivino");
            System.out.println("4 Monstrar la tabla de multiplicar al reves");
            System.out.println("5. - Salir");

            //System.out.println("");
            option = entrada.nextInt();

            switch (option) {
                case 1:
                    System.out.println("********* PRECIO DEL AGUA ************");
                    System.out.println("Introduzca el consumo de agua en metros cubicos ");
                    agua = entrada.nextDouble();

                    if (agua <= tram1) {
                        System.out.println("Primer tramo");
                        System.out.println("El coste del agua este mes es: " + ((agua) * (0.15)));
                    } else if (agua <= tram2) {
                        System.out.println("Segundo tramo");
                        System.out.println("El coste del agua este mes es: " + (((agua - tram1) * (0.20)) + 15));
                    } else if (tram2 < agua && agua <= tram3) {
                        System.out.println("Tercer tramo");
                        System.out.println("El coste del agua este mes es: " + ((((agua - tram2)) * (0.35)) + 115));
                    } else {
                        System.out.println("Cuarto tramo");
                        System.out.println("El coste del agua este mes es: " + (((agua - (tram3)) * (0.80)) + 290));
                    }

                    break;

                case 2:
                    System.out.println("***********TEMPERATURAS**************");
                    temperaturaTotal = 0;
                    a = 0;
                    
                    do {
                    System.out.println("Introduzca el numero de temperatura (POSITIVIO) ");
                    i = entrada.nextInt();
                    } while (i < 0);

                    for (d = 1; d <= i; d++) {
                        System.out.println("Temperatura numero " + d);
                        temperatura = entrada.nextDouble();
                        //Comparacion de 0
                        if (temperatura < 0) {
                            a += 1;
                        }
                        temperaturaTotal = temperaturaTotal + temperatura;
                    }
                    System.out.println("Has introducido " + a + "temperaturas inferiores a 0");
                    System.out.println("La temperatura media es " + ((temperaturaTotal) / i));

                    break;

                case 3:
                    System.out.println("***********ADIVINO**************");
                    azar = (int) ((Math.random() * 100) + 1);
                    int b = 1, numero2;
                    boolean encontrado = false;
                    do {
                        System.out.println("INTENTO NÚMERO " + b);

                        System.out.println("Introduzca un numero");
                        numero2 = entrada.nextInt();
                        if (numero2 == azar){
                            
                            encontrado = true;
                        }
                        else if (numero2 > azar) {
                            System.out.println("El numero a adivinar es menor");
                        } else {
                            System.out.println("El numero a adivinar es mayor");
                        }
                        b += 1;
                        
                       
                    } while (b <= 7 && !encontrado);
                    if (!encontrado) {
                            System.out.println("El numero era " + azar);
                            System.out.println("HAS PERDIDO");
                        }
                    else {
                        System.out.println("ENORABUENA HAS ACERTADO");
                    }

                            break;
                        
                    
                    case 4:
                System.out.println("********TABLA DE MULTIPLICAR*********");
                
                do {
                    System.out.println("Introduzca el numero a la tabla a mostrar (entre 1 y 10)");
                    multi = entrada.nextInt();   
                } while (multi < 0);
                
                for(x = 10; x > 0; x--){
                    System.out.println(multi + " * " + x + " = " + (multi*x));   
                }
                
                break;
            default:
                System.out.println("Hasta luego");
            } 
        } while (option != 5);
            }
        }
