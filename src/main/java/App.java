import java.util.*;


public class App {
  public static void main(String[] args) {

    System.out.println("This is a hangman application!");
    // public Hangman newGame = new Hangman
    Hangman testman = new Hangman();
    System.out.println(testman.mHangmanArray);
    String testing = testman.pickWord();
    System.out.println(testing + "");
  }
}
