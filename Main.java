
public class Keyword {
 private String key,color, capitalisation,style;

 public Keyword(String key, String color, String capitalisation,String style) {
  this.key = key;
  this.color = color;
  this.capitalisation = capitalisation;
  this.style=style;
 }
public Keyword() {
 // TODO Auto-generated constructor stub
}
 public String getStyle() {
  return style;
 }

 public String getKey() {
  return key;
 }

 public String getColor() {
  return color;
 }

 public String getCapitalisation() {
  return capitalisation;
 }

}




public class KeyWordHighlighter {
 public static String keyWordHighlighter(String inputText, ArrayList<Keyword> keywordList) {
  for (Keyword keyword : keywordList) {
   String key = keyword.getKey();
   String color = keyword.getColor();
   String style=keyword.getStyle();
   String capitalisation = keyword.getCapitalisation();
   if (capitalisation.equals("lower"))
    inputText = inputText.replaceAll(key, "[" + color + "]" +"[" +style + "]" +key.toLowerCase()  +"[" +style + "]"+"[" + color + "]");
   else if (capitalisation.equals("capital"))
    inputText = inputText.replaceAll(key, "[" + color + "]" +"[" +style + "]"+ key.toUpperCase() +"[" +style + "]"+ "[" + color + "]");
  }

  return inputText;
 }
}




public class Main {
 public static void main(String[] args) {
  String input = "if we write a program and compile it, then we can run the program to get output";
  ArrayList<Keyword> keyWordList = new ArrayList<Keyword>();
  keyWordList.add(new Keyword("as","blue","capital","normal"));
  keyWordList.add(new Keyword("if", "red", "capital","normal"));
  keyWordList.add(new Keyword("and", "red", "capital","bold"));
  keyWordList.add(new Keyword("then","green", "lower","bold"));
  keyWordList.add(new Keyword("when","blue", "lower","bold"));
  System.out.println(KeyWordHighlighter.keyWordHighlighter(input, keyWordList));
 
 }
}