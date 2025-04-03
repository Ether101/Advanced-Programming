// LanguageLearningApp.java

import java.util.Scanner;

/**
 * The main class for the language learning application.
 */
public class LanguageLearningApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Language Learning App!");
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();

        System.out.println("Please enter the language you are learning:");
        String language = scanner.nextLine();

        System.out.println("Please enter your current level (1-5):");
        int level = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        User user = new User(name, language, level);

        System.out.println("Hello, " + user.getName() + "! You are learning " + user.getLanguage() + " at level " + user.getLevel());

        Practice practice = new Practice();

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add vocabulary word");
            System.out.println("2. Practice vocabulary");
            System.out.println("3. View progress");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println("Please enter the vocabulary word:");
                    String word = scanner.nextLine();

                    System.out.println("Please enter the translation:");
                    String translation = scanner.nextLine();

                    Vocabulary vocabulary = new Vocabulary(word, translation);
                    practice.addVocabulary(vocabulary);

                    System.out.println("Vocabulary word added successfully!");
                    break;
                case 2:
                    System.out.println("Let's practice your vocabulary!");

                    for (Vocabulary vocab : practice.getVocabularyList()) {
                        System.out.println("What is the translation of '" + vocab.getWord() + "'?");
                        String answer = scanner.nextLine();

                        if (answer.equals(vocab.getTranslation())) {
                            practice.incrementScore();
                            System.out.println("Correct!");
                        } else {
                            System.out.println("Incorrect. The correct answer is '" + vocab.getTranslation() + "'.");
                        }
                    }

                    System.out.println("Your score is " + practice.getScore() + "/" + practice.getVocabularyList().size());
                    break;
                case 3:
                    System.out.println("Your progress:");
                    System.out.println("Name: " + user.getName());
                    System.out.println("Language: " + user.getLanguage());
                    System.out.println("Level: " + user.getLevel());
                    System.out.println("Score: " + practice.getScore() + "/" + practice.getVocabularyList().size());
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
