
import java.util.StringTokenizer;


public class Story_1_By_StringTokenizer {
	public static void main(String[] args) {
		
		String str = "as if and then when";
		 
		StringTokenizer st = new StringTokenizer(str);
		 System.out.println("---- Story-1 by StringTokenizer ------");
		 
			while (st.hasMoreElements()) {
				System.out.print("[blue]"+st.nextElement()+"[blue]");
		 
	}
		
	}
}