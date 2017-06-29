import java.util.Random;
import java.util.*;

public class Hangman {
  public String[] mHangmanArray = new String[3];
  public String[] mGameArray;

  public Hangman() {
    mHangmanArray = new String[]{"yokke", "anna", "witty"};
    mGameArray = new String[]{};
  }

  public String pickWord(){
    Random random = new Random(3);
    int randomNumber = random.nextInt(3);
    int wordToGuess = Arrays.asList(mHangmanArray).indexOf(randomNumber) + 1;
    // System.out.println(wordToGuess);
    String chosenWord = mHangmanArray[wordToGuess];
    return chosenWord;
  }
}
