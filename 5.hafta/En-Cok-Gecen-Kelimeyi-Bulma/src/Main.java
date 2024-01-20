import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Metni girin:");
        String textToCount = scanner.nextLine();

        String[] words = textToCount.split("\\s+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String w : words) {
            w = w.toLowerCase();
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }
        String mostUsedWord = "";
        int mostUsedWordCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > mostUsedWordCount) {
                mostUsedWord = entry.getKey();
                mostUsedWordCount = entry.getValue();
            }
        }
        System.out.println("En çok geçen kelime: " + mostUsedWord + " (" + mostUsedWordCount + " kez)");
    }
}
