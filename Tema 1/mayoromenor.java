import java.util.Scanner;

public class mayoromenor {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int res;

        System.out.print("Primer numero:");
        num1 = input.nextInt();
        System.out.print("Segundo numero:");
        num2 = input.nextInt();

        if (num1 > num2){
            res = num1-num2;
            System.out.printf("Resta is %d\n", res);
        }
        else {
            res = num2-num1;
            System.out.printf("Resta is %d\n", res);
        }

        
    }  
}
