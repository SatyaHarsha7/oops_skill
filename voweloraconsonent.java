package skill;

import java.util.Scanner;

public class voweloraconsonent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for a character
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);

        ch = Character.toLowerCase(ch);

        if ((ch >= 'a' && ch <= 'z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet letter.");
        }

        scanner.close();
    }
}
