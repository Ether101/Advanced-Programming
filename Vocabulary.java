// Vocabulary.java

/**
 * Represents a vocabulary word.
 */
public class Vocabulary {
    private String word;
    private String translation;

    /**
     * Constructor for the Vocabulary class.
     * 
     * @param word       the vocabulary word
     * @param translation the translation of the word
     */
    public Vocabulary(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    // Getters and setters
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
