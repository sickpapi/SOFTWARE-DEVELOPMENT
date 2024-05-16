import java.util.Scanner;

public class biggerofthe2 {
    
    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);
        System.out.println("Provide an integer");
        int integer = checker.nextInt();
        
        System.out.println("Provide another integer");
        int integer2 = checker.nextInt();

    if (integer > integer2) {
        System.out.println("First integer (" + integer + ") is bigger than second integer (" + integer2 +")");
} 
    else if (integer == integer2) {
        System.out.print("First integer (" + integer + ") is the same as second integer (" + integer2 +")");
}
    else {
        System.out.println("Second integer (" + integer2 + ") is bigger than first integer (" + integer +")");
    }
checker.close();
}}