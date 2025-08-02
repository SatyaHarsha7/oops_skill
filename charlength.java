package skill;
import java.util.Scanner;

class CharLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        if (s.length() >= 3) {
            System.out.println("charAt(2): " + s.charAt(2));
        } else {
            System.out.println("String is too short to get character at index 2.");
        }

        System.out.println("length(): " + s.length());

        scanner.close();
    }
}
