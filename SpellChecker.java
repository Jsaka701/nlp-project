import java.util.ArrayList;

public class SpellChecker {
    private ArrayList<String> dictionary;
    private ArrayList<String> errors;

    public SpellChecker(String dictionaryFile) {
        dictionary = FileReader.toStringList(dictionaryFile);
        errors = new ArrayList<>();
    }

    public void checkSpelling(ArrayList<String> words) {
        errors = new ArrayList<>();
        for (String word : words) {
          
            if (!dictionary.contains(word)) {
                errors.add(word);
            }
        }
    }

    public void printErrors() {
        if (errors.size() == 0) {
            System.out.println("No spelling errors found!");
        } else {
            System.out.println("Misspelled words: " + errors);
        }
    }
}
