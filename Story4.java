
import java.util.Scanner;

public class Story4 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		StringBuffer strb= new StringBuffer();
		String arr []= str.split("\\s+");
		for(String word: arr)
		{
			if (word.equals("as")){
				strb.append("[blue]" + word.toUpperCase() + "[blue]" );
				strb.append(" ");
			}else if (word.equals("if")){
				strb.append("[red][bold]" + word + "[bold][red]" );
				strb.append(" ");
			}else if (word.equals("then")){
				strb.append("[green]" + word + "[green]" );
				strb.append(" ");
			}else if (word.equals("and")){
				strb.append("[red][bold]" + word.toUpperCase() + "[bold][red]" );
				strb.append(" ");
			}else if (word.equals("when")){
				strb.append("[blue]" + word + "[blue]" );
				strb.append(" ");
			}else{
				strb.append(word);
				strb.append(" ");
			}
		}
		
		System.out.println(strb);
	}

	

}
