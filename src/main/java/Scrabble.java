
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.io.*;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {
  public static void main(String[] args){
    String layout = "templates/layout.vtl";

      get("/", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/index.vtl");
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());

      get("/results", (request, response) -> {
        Map<String, Object> model = new HashMap<String, Object>();
        model.put("template", "templates/results.vtl");

        String word = request.queryParams("word");
        Scrabble myScrabble = new Scrabble();
        Integer totalScore = myScrabble.calculateScore(word);

        model.put("totalScore", totalScore);
        return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
    }

  //Key value pairs for scrabble alphabet and each letter value
  public Integer calculateScore(String word) {
    word = word.toLowerCase(); //This overwrites original word to lower case
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
    score.put(' ', 0);

    //Splitting word into charArray (word)
    Integer totalScore = 0;
    char[] charArray = word.toCharArray();

    //Using for loop to cycle through EACH char in charArray (word)
    for (char item : charArray){
      System.out.println(item);//Java version of console logging
      totalScore = totalScore + score.get(item);//score.get(item)=value of each char letter run during for loop
    }
    return totalScore;
  }
}
