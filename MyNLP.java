import java.util.ArrayList;
import java.util.Scanner;

public class MyNLP {
    private SpellChecker spellChecker;
    private String[] symbols = {".", ",", "!", "-", "?", "//"};

    public MyNLP() {
        spellChecker = new SpellChecker("Dictionary.txt");
    }

    public void prompt() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your text to check spelling:");
        String userText = input.nextLine().toLowerCase();

        ArrayList<String> words = new ArrayList<>();
        for (String word : userText.split(" ")) {
           for (String s : symbols) {
          word = word.replace(s, "");
        }
            words.add(word);
        }

        spellChecker.checkSpelling(words);
        spellChecker.printErrors();

        input.close();
    }
}