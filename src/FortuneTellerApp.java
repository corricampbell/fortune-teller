import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String yearsRetirement = "0";
		String vacationHome = "0";

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
		System.out.println("Years until retirement:");
		if (numberAge % 2 == 0) {
			yearsRetirement = "10";
		} else {
			yearsRetirement = "15";
		}

		System.out.println("Vacation Home Location:");
		if (numberSibling <= 0) {System.out.println("Detroit");} 
		else if (numberSibling == 1) {System.out.println("Hawaii");}
		else if (numberSibling == 2) {System.out.println("Florida");}
		else if (numberSibling == 3) {System.out.println("Idaho");}
		else if (numberSibling > 3) {System.out.println("Texas");}
		}
		
		
			System.out.println(yearsRetirement);

		System.out.println(firstName);

	}
}}
