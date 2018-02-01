import java.util.*;


public class VehicleRent1 {

	public static void main(String[] args) {
		
		 float rate;
		 float rent;
		 
		 String selectCity;
		 int selectVehicle;
		
		Scanner sc = new Scanner(System.in);
				 
		
			System.out.println("1. SUV\n");
			System.out.println("2. Swift\n");
			System.out.println("3. Bus\n");
			System.out.println("4. Exit\n");
			
			System.out.println("Select Vehicle: ");
			selectVehicle = sc.nextInt();
			//choice = sc.nextFloat();
			
			HashMap<String, Float> hs = new HashMap<>();
			hs.put("Pune", (float) 0);
			hs.put("Mumbai", (float) 200);
			hs.put("Bangalore", (float) 1000);
			hs.put("Delhi", (float) 2050);
			hs.put("Chennai", (float) 1234.5);
			
			System.out.println(hs);
			System.out.println("Select City: ");
			selectCity = sc.next();
			System.out.println(hs.get(selectCity));
			
			if (selectVehicle == 1) {
				//System.out.println(selectVehicle + "Pune"+"-"+ selectVehicle);
				rent = hs.get(selectCity)*9;
				System.out.println("Total Rent is "   +rent);
			}
		
		
		}
		
	
		
	}
	



