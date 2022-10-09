import java.util.Scanner;

public class CountANumberAppearCharacter {
    public static void main(String[] args) {
        String name = "Welcome to summonrift";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char letter = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (letter == name.charAt(i)) {
                count++;
            }
        }
        System.out.println("String '" + name + "' have " + count + " character '" + letter + "'");
    }
}
