// Practice.java

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a practice session.
 */
public class Practice {
    private List<Vocabulary> vocabularyList;
    private int score;

    /**
     * Constructor for the Practice class.
     */
    public Practice() {
        this.vocabularyList = new ArrayList<>();
        this.score = 0;
    }

    /**
     * Adds a vocabulary word to the practice session.
     * 
     * @param vocabulary the vocabulary word to add
     */
    public void addVocabulary(Vocabulary vocabulary) {
        vocabularyList.add(vocabulary);
    }

    /**
     * Increments the score.
     */
    public void incrementScore() {
        score++;
    }

    // Getters and setters
    public List<Vocabulary> getVocabularyList() {
        return vocabularyList;
    }

    public void setVocabularyList(List<Vocabulary> vocabularyList) {
        this.vocabularyList = vocabularyList;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
