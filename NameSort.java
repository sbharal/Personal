import java.util.ArrayList;
import java.util.Collections;

class NameSort implements Comparable<NameSort> {
 
	public String Fname;
    public String Lname;
 
 public NameSort(String string, String string2) {
  
  this.Fname = string;
  this.Lname = string2;
 }
 	public void setFname(String fname) {
  Fname = fname;
 }
 	public void setLname(String lname) {
  Lname = lname;
 }
    
  /* public int compareTo(NameSort other) {
         return Lname.compareTo(other.Lname);
     }*/
   
 	public int compareTo(NameSort other){
 		if(Lname.compareTo(other.Lname)){
 			return 0;
 			
 		}else if(Fname.compareTo(other.Fname)){
 			return 0;
 			
 		}else{
 			return 1;
 		}
 	}
 	
 	
 	/*public int compare(Fname fname, Lname lname) {
        int res =  fname.Fname().compareToIgnoreCase(fname.Fname());
        if (res != 0)
            return res;
        return lname.Lname().compareToIgnoreCase(lname.Lname());
   }*/

 	
 	
 	
 	
 	
   public String toString()
   {
    return "\n" +Fname + " " +Lname +"\n";
   }
   
   public static void main(String[] args)
  {
   
   ArrayList<NameSort> nameList = new ArrayList<NameSort>();
  
   nameList.add(new NameSort("Shikha","Dashore"));
   nameList.add(new NameSort("Sahil","Bharal"));
   nameList.add(new NameSort("Aditya","Kharote"));
   nameList.add(new NameSort("Pranjali","Bharal"));
 
   Collections.sort(nameList);
   System.out.println(nameList);
   
  }
    
}