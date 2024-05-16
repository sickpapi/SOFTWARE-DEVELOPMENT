import java.util.Scanner;

public class integerchecker {
    public static void main(String[] args) {
        try (Scanner checker = new Scanner(System.in)) {
            System.out.println("Provide an integer:");
            int integer = checker.nextInt();

   if (integer > 0) {
            System.out.println("This number is positive.");
}
   else if (integer < 0) {
   System.out.println("This number is negative.");
}
   else {
   System.out.println("This number is neither positive or negative.");
}}}}