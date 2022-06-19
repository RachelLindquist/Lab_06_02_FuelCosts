import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Write a program that asks the user to input
	//The number of gallons of gas in the tank
	//The fuel efficiency in miles per gallon
	//The price of gas per gallon
        //Then print the cost per 100 miles and how far the car can go with the gas in the tank.
        // Again, check for valid input and exit with an error msg if you do not have it.
        // Testing: here just use some reasonable values that you can inspect the calculations and
        // determine they are correct.  Be sure to check of integer calculations truncating the results.

        Scanner in = new Scanner(System.in);

        double gasInTank = 0;
        double fuelEfficiency = 0;
        double gasPrice = 0; // I wish

        String trash = ""; // use for bad input which will read as a String
        System.out.print("Please enter the number of gallons of gas in the tank ");
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            gasInTank = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said you had " + trash + " gallons");
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }
        System.out.print("Please enter the fuel efficiency in miles per gallon ");
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            fuelEfficiency = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said you had " + trash + " fuel efficiency");
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }

        System.out.print("Please enter the cost of gas in dollars ");
        if(in.hasNextDouble())
        {
            // OK safe to read in a double
            gasPrice = in.nextDouble();
            in.nextLine(); // clears the newline from the buffer
        }
        else
        {
            // Not a double can’t use nextDouble() read as String with nextLine() instead
            trash = in.nextLine();
            System.out.println("\nYou said gas was " + trash + " dollars");
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);  // terminate the program
        }

        double hundredMileCost = (100/fuelEfficiency) * gasPrice;
        double curDistance = gasInTank * fuelEfficiency;

        System.out.println("To travel 100 miles in this economy it will cost you " + hundredMileCost + " dollars.");
        System.out.println("With your current tank, you can travel " + curDistance + " miles.");





    }
}