import java.io.*;
import java.util.*;

public class HansenLi2 {

	public static void main(String[] args) throws IOException{
		char value;
		// initialize char value variable
		
		System.out.println("You may choose whether to find the area of a circle or find the perimeter of a rectangle.");
		System.out.println("Please enter 'A' or 'a' for the area of a circle;");
		System.out.println("Or please enter 'P' or 'p' for the perimeter of a rectangle.");
		// opens menu options for user and asks for input
		
		
		Scanner choice = new Scanner(System.in);
		value = choice.next().charAt(0);
		// creates scanner and reads the first char user input
		
		
		// following lines determine course of action depending on input
		if ((value == 'a') || (value == 'A')){
			// checks to see if option entered was for area using char value
			
			System.out.println("You have picked to find the area of a circle.");
			System.out.println("Please enter the radius of the circle. It must be positive: ");
			// prompts user to enter circle radius.
			
			Scanner radius = new Scanner(System.in);
			double r;
			double area;
			r = radius.nextDouble();
			
			// initializes relevant variables and converts input to double value
			
			if (r < 0){
				// checks to see if r is negative, and returns error
				System.out.println("Error. Cannot have negative radius");
				
			}else{
				
			area = Math.PI * Math.pow(r, 2);
			System.out.println("Your circle's area is " + area + " units squared");
			// calculates area with input variables and returns value for user
			
			}
			
		}else if ((value == 'p') || (value == 'P')){
			//checks to see if input char value is the option for finding rectangle perimeter
			System.out.println("You have picked to find the area of a rectangle.");
			System.out.println("Please enter the length and width of your rectangle with one space separating the values. These values must be whole numbers.");
			System.out.println("In the case that you are calculating on a graph with x and y axis, you may use negative numbers.");
			// prompts user to enter two values to use in calculating the area of the rectangle
			int i;
			int j;
			// initializes variables for length and width to be used in later calculations
			BufferedReader in = new BufferedReader
					(new InputStreamReader(System.in));
			// reads user input
			String s = " ";
			// initializes string for the input to convert to
			while((s = in.readLine()) != null){
				StringTokenizer st = new StringTokenizer(s, " ");
				// creates new string tokenizer to later parse through for user input values
				while (st.hasMoreElements()){
					i = Integer.parseInt(st.nextElement().toString());
					j = Integer.parseInt(st.nextElement().toString());
					int area = i * j;
					System.out.println("The area of your rectangle is " + area + " units squared.");
					// parses through string in order to retrieve values of length and width inputs
					// calculates the area from the inputs and returns the value to the user
				}
		}


		
	}else {
		System.out.println("Error. Please restart program and enter an available option.");
		// error message if the user has entered a character that was not available
	}
}
}

