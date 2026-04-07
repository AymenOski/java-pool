import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Capitalize {
    public static void capitalize(String[] args) throws IOException {
        if (args.length < 2) {
            return;
        }

        String input = new String(Files.readAllBytes(Paths.get(args[0])));
        StringBuilder result = new StringBuilder();

        boolean newWord = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isLetter(c)) {
                if (newWord) {
                    result.append(Character.toUpperCase(c));
                    newWord = false;
                } else {
                    result.append(Character.toLowerCase(c));
                }
            } else {
                result.append(c);
                newWord = !Character.isDigit(c);
            }
        }

        Files.write(Paths.get(args[1]), result.toString().getBytes());
    }
}