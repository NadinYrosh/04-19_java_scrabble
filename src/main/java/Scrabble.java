
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Scrabble {
  // public static void main(String[] args) {
  //
  // }

  public Integer calculateScore(String word) {
    HashMap<String, Integer> score = new HashMap<String, Integer>();
    score.put("a", 1);
    score.put("d", 2);
    score.put("b", 3);
    score.put("f", 4);
    score.put("k", 5);
    score.put("j", 8);
    score.put("q", 10);
    return score.get(word);
  }
}
