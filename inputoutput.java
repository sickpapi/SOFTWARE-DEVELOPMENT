import java.util.Scanner;

public class inputoutput {
    public static void main(String[] args) {
        String name = "";
        Scanner checker = new Scanner(System.in);
        System.out.println("Say my name.");
        name = checker.next();

    if (name.equalsIgnoreCase("Heisenberg")) {
        System.out.println("You're goddamn right.");
}
    else {
        System.out.println("Come on. You know exactly who I am.");
    }
checker.close();
}}
