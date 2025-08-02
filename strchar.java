package skill;

public class strchar {
	public static void main(String[] args) {
        String str = "hello world";
        String str2 = "HELLO WORLD";

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Substring (0, 5): " + str.substring(0, 5));
        System.out.println("Contains 'world': " + str.contains("world"));
        System.out.println("Starts with 'hello': " + str.startsWith("hello"));
        System.out.println("Ends with 'world': " + str.endsWith("world"));
        System.out.println("Index of 'o': " + str.indexOf('o'));
        System.out.println("Last Index of 'o': " + str.lastIndexOf('o'));
        System.out.println("Replace 'l' with 'x': " + str.replace('l', 'x'));
        System.out.println("To Upper Case: " + str.toUpperCase());
        System.out.println("To Lower Case: " + str.toLowerCase());
        System.out.println("Equals str2: " + str.equals(str2));
        System.out.println("EqualsIgnoreCase str2: " + str.equalsIgnoreCase(str2));
        String strWithSpaces = "   hello world   ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");
        String[] words = str.split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Concatenated: " + str.concat("!!!"));
        System.out.println("Is Empty: " + str.isEmpty());
        System.out.println("CompareTo 'hello': " + str.compareTo("hello"));
        System.out.println("Matches regex '.*world': " + str.matches(".*world"));
        char[] chars = str.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }

        // Format
        String formatted = String.format("Welcome to %s", str);
        System.out.println("\nFormatted string: " + formatted);

        // Intern
        String interned = str.intern();
        System.out.println("Interned string: " + interned);

        // Repeat (Java 11+)
        System.out.println("Repeat 3 times: " + str.repeat(3));
    }
}