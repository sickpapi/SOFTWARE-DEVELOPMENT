import java.util.Scanner;

public class infiniteaddition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integer;
        int initialinteger = 0;
        do{
            System.out.println("Provide an integer");
            integer = input.nextInt();
            initialinteger = (integer + initialinteger);
            System.out.println(initialinteger);

        }while(integer != 0);{}
input.close();
}}