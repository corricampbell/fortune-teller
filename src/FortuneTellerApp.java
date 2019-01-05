import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("FORTUNE TELLER");
//Part 1
		System.out.println("What is your first name?");
		String firstName = input.next();
		System.out.println("What is your last name?");
		String lastName = input.next();
		System.out.println("What is your age?");
		int numberAge = input.nextInt();
		System.out.println("What is your birth month? (1-12)");
		String birthMonth = input.next();
		System.out.println("What is your favorite ROYGBIV color?");
		String favoriteColor = input.next();
		while (favoriteColor.toLowerCase().equals("help")) {
			System.out.println("Red, Orange, Yellow, Green, Blue, Indigo, Violet");
			favoriteColor = input.next();
		}
		System.out.println("How many siblings do you have?");
		int numberSibling = input.nextInt();

//Part 2
		System.out.println("Your years to retirement: ");
		   if (numberAge % 2 == 0) {
			System.out.println("You will retire in 10 years.");
		  } else {
			System.out.println("You will retire in 15 years.");

		System.out.println("Your vacation home location:");
			if (numberSibling == 0) {
				System.out.println("Detroit");
			} else {
				System.out.println("Hawaii");
			}
		System.out.println("Your mode of transportation:");
		if (favoriteColor == green) {
			System.out.println("Jaguar");
			else {
				System.out.println("Pinto");
			}
		}
		}System.out.println("Your bank balance at retirement:");
			if (birthMonth > 12)
				System.out.println("$0");
			else 
				System.out.println("1 million dollars");			
//Part 3
			
		System.out.println(firstName + lastName "will retire in" + numberAge "with" birthMonth "in the bank, a vacation home in" + numberSibling ", and travel by" + favoriteColor "." );
	}

}
