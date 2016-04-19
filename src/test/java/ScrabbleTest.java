import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

public class ScrabbleTest {


  //Since function calculateScore is an Integer, the expected return must match and be an Integer for all tests.
  @Test
  public void calculateScore_returnsScoreForSingleLetter_1To10() {
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
  @Test
  public void calculateScore_returnsScoreForWordCat_5() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("cat"));
  }
  @Test
  public void calculateScore_returnInputtedWordInLowerCase_dog() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("DOG"));
  }

  @Test
  public void calculateScore_returnInputtedWordInMixedCase_dog() {
    Scrabble testScrabble = new Scrabble();
    Integer expected = 5;
    assertEquals(expected, testScrabble.calculateScore("dOg"));
  }

  @Test
  public void calculateScore_returnInputtedBlank_0(){
    Scrabble testScrabble = new Scrabble();
    Integer expected = 0;
    assertEquals(expected, testScrabble.calculateScore(" "));
  }

}
