import org.junit.*;
import static org.junit.Assert.*;

public class HangmanTest {

  @Test
  public void pickWord_shouldBeAString_true() {
    Hangman newGame = new Hangman();
    String wordToGuess =  newGame.pickWord();
    assertEquals(true, wordToGuess instanceof String);
  }
}
