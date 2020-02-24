import java.util.*;
public class HansenLiAssign1 {

	public static void main(String[] args){
		String courseInfo = "Welcome to COSC 1436!";
		courseInfo = courseInfo + "\nSemester: Spring 2017";
		//changes courseInfo to add information on next line
		String courseName = "Introduction To Java";
		String name = "Li, " + "Hansen";
		//declaring and initializing strings
		double pie = 3.142;
		//initializing pie value
		
		double r;
		//initializes radius r double
		
		
		Scanner keyboard = new Scanner(System.in);
		//creates scanner object
	
		
		System.out.println(courseInfo);
		System.out.println(courseName);
		System.out.println("By " + name);
		//printing out strings
		
		System.out.println("\n\n+++++++++++++++++++++++++++++++++++++++++++++\n\n");
		//printing line
		
		System.out.println("Please Enter the Radius(R): ");
		//asks user for radius input
		r = keyboard.nextDouble();
		double area = pie * (r * r);
		//circle area function
		System.out.println("Area of the circle is: " +  area + " in whatever you unit squared you thought of");
		//displays area result
		
		System.out.println("\n\n+++++++++++++++++++++++++++++++++++++++++++++\n\n");
		
		
		double h;
		double b;
		//initializes height and base doubles
		
		System.out.println("Enter h (height): ");
		h = keyboard.nextDouble();
		System.out.println("Enter b (base): ");
		b = keyboard.nextDouble();
		//asks user to input values
		
		double trianglearea = (h*b)/2;
		
		System.out.println("Area of the triangle is: " + trianglearea);
		System.out.println("(the area units are whatever you wanted h and b to be, but squared)");
		
		
	}
}
