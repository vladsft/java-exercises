import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    private static boolean isVowel(char c) {
        return switch (Character.toLowerCase(c)) {
            case 'a', 'e', 'i', 'o', 'u' -> true;
            default -> false;
        };
    }
    private static String pigLatinWord(String word) {
        assert word.length() > 0;
        if (Character.isDigit(word.charAt(0))) {
            return word;
        }
        if (isVowel(word.charAt(0))) {
            return word + "way";
        }
        if (word.length() == 1) {
            return word + "ay";
        }
        return (Character.isUpperCase(word.charAt(0)) ? Character
                .toUpperCase(word.charAt(1)) : word.charAt(1))
                + word.substring(2)
                + Character.toLowerCase(word.charAt(0)) + "ay";
    }
    private static String pigLatinLine(String line) {
        final StringBuilder builder = new StringBuilder();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (Character.isLetterOrDigit(line.charAt(i))) {
                word.append(line.charAt(i)); // when it comes across a space or a punctuation, we know that a word has been created by the accumulated letters beforehand
            } else {
                if (word.length() > 0) {
                    builder.append(pigLatinWord(word.toString()));
                    word = new StringBuilder(); // once we created a word, we go on to create a new one from scratch
                }
                builder.append(line.charAt(i));
            }
        }
        builder.append("\n");
        return builder.toString();
    }

    public static void main(String[] args) throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringBuilder stringBuilder = new StringBuilder();
        String line = br.readLine();
        while (line != null) {
            stringBuilder.append(pigLatinLine(line));
            line = br.readLine();
        }
        System.out.print(stringBuilder);

    }
}