import java.util.Scanner;

public class Lab1 {
public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	double length = 0;
	double width = 0;
	double area = 0;
	double perimeter = 0;
	String userInput = "y";
	
	do {
	System.out.print("Enter Length: ");
	length = scnr.nextDouble();
	System.out.print("Enter Width: ");
	width = scnr.nextDouble();
	
	
	area = length * width;
	perimeter = length * 2 + width * 2;
	
	System.out.println("Area: " + area);
	System.out.println("Perimeter: " + perimeter);
	
	System.out.println("Continue? (y/n)");
	userInput = scnr.next();
	
	}
	while (userInput.equals("y")); {
}
	System.out.println("Bye.");
}
}