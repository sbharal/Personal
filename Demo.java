
import java.util.*;
import java.util.Map.Entry;


public class Demo {

 public static void main(String[] args){
	 TreeMap<String, String> hm = new TreeMap<String, String>();
	  byValue v = new byValue();
	  hm.put("Aditya" , "Kharote");
	  hm.put("Shikha" , "Dashore");
	  hm.put("Sahil" , "Bharal");
	  hm.put("Dhaval" , "Hazare");
	  for (Map.Entry<String, String> entry : hm.entrySet()){
		  String values = entry.getValue();
	      String key = entry.getKey();
	      System.out.print(key +" " +values + "\n"); 
	  }
 }
}

class byValue implements Comparator<Map.Entry<Integer,Integer>> {
    public int compare(Map.Entry<Integer,Integer> e1, Map.Entry<Integer,Integer> e2) {
        if (e1.getValue() < e2.getValue()){
            return 1;
        } else if (e1.getValue() == e2.getValue()) {
            return 0;
        } else {
            return -1;
        }
    }
}