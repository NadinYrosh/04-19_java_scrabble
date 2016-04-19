import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ScrabbleTest {

  @Test
  public void calculateScore_returnsScoreForSingleLetter_1() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 1;
    assertEquals(expected, testScrabble.calculateScore("a"));
    expected = 2;
    assertEquals(expected, testScrabble.calculateScore("d"));
    expected = 3;
    assertEquals(expected, testScrabble.calculateScore("b"));
    expected = 4;
    assertEquals(expected, testScrabble.calculateScore("f"));
    expected = 5;
    assertEquals(expected, testScrabble.calculateScore("k"));
    expected = 8;
    assertEquals(expected, testScrabble.calculateScore("j"));
    expected = 10;
    assertEquals(expected, testScrabble.calculateScore("q"));
  }
}