
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {
public static void main(String[] args){}

  //Key value pairs for scrabble alphabet and each letter value
  public Integer calculateScore(String word) {
    word = word.toLowerCase(); //This overwrites original word to lower case
    // String input = "Dog";
    // String lower = input.toLowerCase();
    HashMap<Character, Integer> score = new HashMap<Character, Integer>();
    score.put('a', 1);
    score.put('e', 1);
    score.put('i', 1);
    score.put('o', 1);
    score.put('u', 1);
    score.put('l', 1);
    score.put('n', 1);
    score.put('r', 1);
    score.put('s', 1);
    score.put('t', 1);
    score.put('d', 2);
    score.put('g', 2);
    score.put('b', 3);
    score.put('c', 3);
    score.put('m', 3);
    score.put('p', 3);
    score.put('f', 4);
    score.put('h', 4);
    score.put('v', 4);
    score.put('w', 4);
    score.put('y', 4);
    score.put('k', 5);
    score.put('j', 8);
    score.put('x', 8);
    score.put('q', 10);
    score.put('z', 10);

    //Splitting word into charArray (word)
    Integer totalScore = 0;
    char[] charArray = word.toCharArray();

    //Using for loop to cycle through EACH char in charArray (word)
    for (char item : charArray){
      System.out.println(item);//Java version of console logging
      //score.get(item)=value of each char letter run during for loop
      totalScore = totalScore + score.get(item);
    }
    return totalScore;
  }
}
