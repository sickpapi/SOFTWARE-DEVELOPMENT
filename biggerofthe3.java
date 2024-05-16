import java.util.Scanner;

public class biggerofthe3 {
    
    public static void main(String[] args) {
        Scanner checker = new Scanner(System.in);
        System.out.println("Provide an integer");
        int integer = checker.nextInt();
        
        System.out.println("Provide another integer");
        int integer2 = checker.nextInt();

        System.out.println("Provide another integer");
        int integer3 = checker.nextInt();

    if (integer > integer2 && integer > integer2) {
        System.out.println("First integer (" + integer + ") is bigger than second integer (" + integer2 +") and is bigger than third integer (" + integer3 +")");
} 
    else if (integer2 > integer && integer2 > integer3) {
        System.out.print("Second integer (" + integer2 + ") is bigger than first integer (" + integer +") and is bigger than third integer (" + integer3 +")");
}
    else if (integer3 > integer && integer3 > integer2) {
        System.out.print("Third integer (" + integer3 + ") is bigger than first integer (" + integer +") and is bigger than second integer (" + integer2 +")");
}
    else {
        System.out.println("All integers are the same");
    }
checker.close();
}}