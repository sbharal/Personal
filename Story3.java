

import java.util.Scanner;

public class Story3 {

 public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  String line = sc.nextLine();
  StringBuffer newline = new StringBuffer();
  String[] words = line.split("\\s+"); 
  for (String word : words) {
   
   if (word.equals("as") || word.equals("and"))
   {
	
    newline.append( "[blue]" + word.toUpperCase() + "[blue]");
    newline.append(" ");
   }
   else if (word.equalsIgnoreCase("if"))
   {
    newline.append( "[red]" + word + "[red]");
    newline.append(" ");
   }
   else if (word.equals("and"))
   {
	
    newline.append( "[red]" + word.toUpperCase() + "[red]");
    newline.append(" ");
   }
   else if (word.equalsIgnoreCase("then"))
   {
    newline.append( "[green]" + word + "[green]");
    newline.append(" ");
   }
   else if (word.equalsIgnoreCase("when"))
   {
    newline.append( "[blue]" + word + "[blue]");
    newline.append(" ");
   }
   else 
   {
    newline.append(word);
    newline.append(" ");
   }
   
   }
  
  System.out.println(newline);
  

}
}


