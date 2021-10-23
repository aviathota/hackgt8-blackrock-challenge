import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class BlackrockChallenge {
    public static void main (String[] args) throws FileNotFoundException {

        // Add your own specific path to the file here!
        File inputFile = new File("/Users/aviathota/Desktop/blackrockspeech.txt");

        Scanner scanner = new Scanner(inputFile);

        scanner.useDelimiter("\\Z");

        int counter = 0;
        String userInput = scanner.next().toLowerCase();

        String[] lines = userInput.split("\\n");
        for (String line : lines) {
            String[] words = line.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].contains("bl") || words[i].contains("la") || words[i].contains("ac") ||
                        words[i].contains("ck") || words[i].contains("kr") || words[i].contains("ro") ||
                        words[i].contains("oc")) {
                    counter++;
                }
            }
        } System.out.println("Found " + counter + " instances.");
    }
}
