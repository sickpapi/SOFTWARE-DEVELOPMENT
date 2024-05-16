import java.util.Scanner;

public class limitedaddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Provide an integer ");
        int integer = input.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= integer; i++) {
            sum += i;
        }

        System.out.println("The sum of " + integer + " and the numbers before it is " + sum);
        
    input.close();
}}