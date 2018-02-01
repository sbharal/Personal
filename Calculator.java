import java.util.Scanner;

public class Calculator {
 
 public static void main(String args[]){
 
 float a;
 float b;
 float res;
 char choice;
 
 Scanner s =new Scanner(System.in);
 do{
  System.out.println("1. Add\n");
  System.out.println("2. Sub\n");
  System.out.println("3. Mul\n");
  System.out.println("4. Div\n");
  System.out.println("5. Exit\n");
  System.out.println("Enter Choice: " );
  choice = s.next().charAt(0);
        switch(choice){
        
        case '1' : System.out.print("Enter Two Number : ");
        a = s.nextFloat();
        b = s.nextFloat();
        res = a + b;
        System.out.print("Result = " + res);
        break;
    case '2' : System.out.print("Enter Two Number : ");
        a = s.nextFloat();
        b = s.nextFloat();
        res = a - b;
        System.out.print("Result = " + res);
        break;
    case '3' : System.out.print("Enter Two Number : ");
        a = s.nextFloat();
        b = s.nextFloat();
        res = a * b;
        System.out.print("Result = " + res);
        break;
    case '4' : System.out.print("Enter Two Number : ");
        a = s.nextFloat();
        b = s.nextFloat();
        res = a / b;
        System.out.print("Result = " + res);
        break;
    case '5' : 
    System.out.println("Thank-You");
    System.exit(0);
        break;
    default : System.out.print("Wrong Choice!!!");
        break;
        
        }
        System.out.println("\n----------------------------------------\n");
 }while(choice !=5);
 
 
 }

}