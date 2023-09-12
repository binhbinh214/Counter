import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        // Initialize a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Request the user to enter content
        System.out.print("Enter your content: ");
        String content = scanner.nextLine();

        // Initialize a map to store the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Initialize a map to store the frequency of each character
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Split the content into words and count the frequency of each word
        String[] words = content.split("\\s+");
        for (String word : words) {
            word = word.toLowerCase(); // Convert to lowercase to make it case-insensitive
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Count the frequency of each character
        for (char character : content.toCharArray()) {
            if (Character.isLetter(character)) {
                character = Character.toLowerCase(character); // Convert to lowercase to make it case-insensitive
                charFrequency.put(character, charFrequency.getOrDefault(character, 0) + 1);
            }
        }

        // Display the results
        System.out.println("Word frequency:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println("{" + entry.getKey() + "=" + entry.getValue() + "}");
        }

        System.out.println("Character frequency:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println("{" + entry.getKey() + "=" + entry.getValue() + "}");
        }
//hello
        // Close the Scanner object
        scanner.close();
    }
}
