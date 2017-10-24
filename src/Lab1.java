import java.util.Scanner;

public class Lab1 {
	   public static void main (String [] args) {
		      Scanner scnr = new Scanner(System.in);
		      
		      System.out.println("Please enter a number:");
		      
		      int userNumber = 0;
		      
		      userNumber = scnr.nextInt();
		      
		      System.out.println(userNumber + 1);
}
}