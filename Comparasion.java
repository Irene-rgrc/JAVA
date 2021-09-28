import java.util.Scanner;

public class Comparasion {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Primer numero:");
        number1 = input.nextInt();
        System.out.print("Segundo numero:");
        number2 = input.nextInt();
        input.close();

        if (number1 == number2)
            System.out.printf("%d == %d\n", number1, number2);
        if (number1 != number2)
            System.out.printf("%d != %d\n", number1, number2);
        if (number1 < number2)
            System.out.printf("%d < %d\n", number1, number2);
        if (number1 > number2)
            System.out.printf("%d > %d\n", number1, number2);
        if (number1 >= number2)
            System.out.printf("%d >= %d\n", number1, number2);
        if (number1 <= number2)
            System.out.printf("%d <= %d\n", number1, number2);
    }   
}
