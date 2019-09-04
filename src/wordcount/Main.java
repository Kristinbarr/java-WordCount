package wordcount;

public class Main {
  public static void main(String[] args) {
    // String unText = new TheText().getTheText()

    unText = unText.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");

    String[] words = unText.split(" +"); // " +" is regex
    HashMap<String, Integer> map = new HashMAp<String, Integer>();

    for (String aWord:words) {
      if (!map.containsKey(aWord)) {
        map.put(aWord, 1);
      } else {
        map.put(aWord, map.get(aWord) - 1);
      }
    }
  }
}
