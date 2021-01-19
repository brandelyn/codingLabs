
public class labsWeek1 {

	public static void main(String[] args) {
		
        // create a variable to hold the quantity of available plane seats left on a flight
		int planeSeatsAvailable = 16;
		
		// create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 149.57;
		
		// create a variable to hold a persons middle initial
		char middleInitial = 'M';
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		
		boolean isHotOutside = false;
		
		//create a variable to hold a customer's first name
		String customersFirstName = "Art";
		
		//create a variable to hold a street address
		String streetAddress = "3498 W newman st";
		
		//print all variables to the console
		System.out.println("Available seats left on plane: " + planeSeatsAvailable);
		System.out.println("Total price of groceries " + costOfGroceries + ".");
		System.out.println("My middle initial is " + middleInitial);
		System.out.println("It is hot outside - " + isHotOutside);
		System.out.println("The customer's first name is " + customersFirstName);
		System.out.println(streetAddress + "," + " is my street address.");
		
		// a customer booked 2 plane seats, remove 2 seats from the available seats variable
		planeSeatsAvailable -= 2;
		System.out.println(planeSeatsAvailable);
		
		// impulse candy bar purchase, add 2.15 to the grocery total
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'J';
		System.out.println(middleInitial);
		
		// the season has changed, update the hot outside variable to be the opposite of what it was
		//isHotOutside = true;
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		
		//create a new variable called full name using the customers first name, middle initial, and a last name of your choice
		String fullName = customersFirstName +" " + middleInitial + " Vandalay";
		System.out.println(fullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable 
		System.out.println("Hello, my name is " + fullName + ", and I live at " + streetAddress + ".");
		
		

		
	
		
		
		
		
	}

}
