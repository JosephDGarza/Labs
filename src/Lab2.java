import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int x = 0;
		String userInput = "y";
		do {
		System.out.println("Enter a number between 1 and 100: ");
		x = scnr.nextInt();
		
		if (x <= 25 && x % 2 == 0) {
			System.out.println("Even and less than 25.");
		}
		if (x < 61 && x % 2 != 0) {
			System.out.println(x + " Odd");
		}
		if (x > 25 && x <= 60 && x % 2 == 0) {
			System.out.println("Even");
		}
		if (x > 60 && x % 2 ==0) {
		System.out.println(x + " Even");
		
	}
		if (x > 60 && x % 2 !=0) {
			System.out.println(x + " Odd and over 60");
			
		}
		System.out.println("Continue? y/n? ");
		userInput = scnr.next();
		}
		while (userInput.equals("y"));{
			
		}
		
		System.out.println("Bye.");


}
}
