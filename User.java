/**
 * This herrepresents a user's language learning profile.
 */
public class User {
    private String name;
    private String language;
    private int level;

    /**
     * Constructor for the User ,class.
     */
    public User(String name, String language, int level) {
        this.name = name;
        this.language = language;
        this.level = level;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
