import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretMessageExtractor {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the input text:");
            String input = reader.readLine();

            String secretMessage = extractSecretMessage(input);
            System.out.println("Secret Message: " + secretMessage);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input: " + e.getMessage());
        }
    }

    public static String extractSecretMessage(String input) {
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isUpperCase(c)) {
                if (c == 'X') {
                    message.append(' ');
                } else {
                    message.append(c);
                }
            }
        }

        return message.toString();
    }
}
