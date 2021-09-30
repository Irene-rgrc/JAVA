import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int sum;

        System.out.print("Primer numero:");
        num1 = input.nextInt();

        System.out.print("Segundo numero:");
        num2 = input.nextInt();

        input.close();

        sum = num1 + num2;
        System.out.printf("Sum is %d\n", sum);
    }  
}
