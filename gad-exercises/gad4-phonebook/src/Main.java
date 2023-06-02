import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        String phonebookUrl = "https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/phonebook.txt";

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(phonebookUrl).openStream()));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] entry = line.split(" ");

                if (entry.length >= 2) {
                    String name = entry[0];
                    String phoneNumber = entry[1];

                    if (name.equals("Abbey") || name.equals("Abdul")) {
                        System.out.println(name + " " + phoneNumber);
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
