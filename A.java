import java.util.Scanner;


public class A {
	
	 static String dc;
	 static String sc;
	 static String veh;
	 static float dis;
	 static float fare;
	 static char choice;
	 static Scanner scan = new Scanner(System.in);
	 
	 public static void sourceCity(){
			System.out.println("enter source city: ");
			sc = scan.nextLine();
			return;
	 }
	 
	 public static void destinationCity(){
			System.out.println("enter destination city: ");
			dc = scan.nextLine();
			return;
	 }
	 
	 public static void distance(){
		 	System.out.println("enter distance: ");
		 	dis = scan.nextFloat();
		 	return;
	 }
	 
	 public static void vehicleAndFare(){
		 	System.out.println("1. Swift\n");
		 	System.out.println("2. XUV\n");
		 	System.out.println("3. Bus\n");
		 	veh = scan.nextLine();
		 	System.out.println("select vehicle: ");
		 	choice = scan.next().charAt(0);
		 	switch(choice){
		 	case '1': 
		 		System.out.println("Swift is Rs.9/KM");
		 		fare = dis*9;
		 		break;
		 	case '2': 
		 		System.out.println("XUV is Rs.12/KM");
		 		fare = dis*12;
		 		break;
		 	case '3': 
		 		System.out.println("Bus is Rs.8/KM");
		 		fare = dis*8;
		 		break;
		 	}
		 	return;
	 }
}
