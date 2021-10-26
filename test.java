
import java.util.Scanner;  //import de la clase Scanner

public class test {

    public static void main(String[] args) {  

           Scanner sc = new Scanner(System.in);  //Se crea un objeto Scanner
           String nombre;
           double radio;
           int n;

               
        

           String s1 = "Hello";
           System.out.print("Introduzca s2: ");  

           String s2 = sc.nextLine();
           String s3 = "Hello";
           String s4=s1 + s2 + s3;

          System.out.println( s1.equalsIgnoreCase(s2)+ "  " + (s1 == s2));

          System.out.println(s1);
          System.out.println(s2);
          if (s1==s3) {
            System.out.println("Equals");
          }
          System.out.println(s4);

          String s5 = "Irene";
          String s6 = new String("Irene");
          String s7 = "iREne";
          String s8 = "Irene";

          System.out.println(s6);
          System.out.println(s5 == s6);
          if ( s6.equalsIgnoreCase(s7)) {
            System.out.println("Idems");
          }
          if ( s1==s3) {
            System.out.println("......clavao");
          }
          if ( s1.equals(s2)) {
            System.out.println("!!!clavao");
          }
          int total=2, num=3;

          total=++num;
          System.out.println(total);
          System.out.println(num);
          num=4;
          for (num++;num<8;num++){
            System.out.println(num);
          }
     }
}
