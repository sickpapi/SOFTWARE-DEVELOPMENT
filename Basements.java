import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Basements {
    public static void main(String[] args) {
        String filePath = "Java/puzzleKey.txt";
        String parentheses = "";
        int floor = 0;
        int positionEnteringBasement = -1;

        try {
            parentheses = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < parentheses.length(); i++) {
            char c = parentheses.charAt(i);
            if (c == '(') {
                floor++;
            } else if (c == ')') {
                floor--;
                if (floor == -1 && positionEnteringBasement == -1) {
                    positionEnteringBasement = i + 1;
                }
            }
        }
        
        System.out.println("You are in floor: " + floor);
        if (positionEnteringBasement != -1) {
            System.out.println("Fulano entered the basement at position: " + positionEnteringBasement);
        }
    }
}
