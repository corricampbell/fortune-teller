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
		int birthMonth = input.nextInt();

		System.out.println("What is your favorite ROYGBIV color? Unsure what ROYGBIV is? Type Help!");
		String favoriteColor = input.next();
		String needHelp = "";
		if (favoriteColor == "Help") {
			needHelp = "Red, Orange, Yellow, Green, Blue, Indigo, Violet";
		}
		System.out.println(needHelp);

		System.out.println("How many siblings do you have?");
		int numberSibling = input.nextInt();

//Part 2
		String yearsRetirement = "";
		System.out.println("Years until retirement:");
		if (numberAge % 2 == 0) {
			yearsRetirement = "10";
		} else {
			yearsRetirement = "15";
		}
		System.out.println(yearsRetirement);

		String vacationLocation = "";
		System.out.println("Vacation Home Location:");
		if (numberSibling <= 0) {
			vacationLocation = "Detroit";
		} else if (numberSibling == 1) {
			vacationLocation = "Hawaii";
		} else if (numberSibling == 2) {
			vacationLocation = "Mississippi";
		} else if (numberSibling == 3) {
			vacationLocation = "Idaho";
		} else if (numberSibling > 3) {
			vacationLocation = "Ohio";
		}
		System.out.println(vacationLocation);

		String transportationMode = "";
		System.out.println("Mode of transportation:");
		if (favoriteColor.equals("red")) {
			transportationMode = "Corvette";
		} else if (favoriteColor.equals("orange")) {
			transportationMode = "69 Charger";
		} else if (favoriteColor.equals("yellow")) {
			transportationMode = "Pinto";
		} else if (favoriteColor.equals("green")) {
			transportationMode = "68 Firebird";
		} else if (favoriteColor.equals("blue")) {
			transportationMode = "Prius";
		} else if (favoriteColor.equals("indigo")) {
			transportationMode = "VW Bug";
		} else if (favoriteColor.equals("violet")) {
			transportationMode = "Schwinn";
		}
		System.out.println(transportationMode);

		String bankBalance = "";
		System.out.println("Bank Balance:");
		if (birthMonth <= 4) {
			System.out.println("$500,000");
		} else if ((birthMonth >= 5) && (birthMonth <= 8)) {
			bankBalance = "$400,000";
		} else if ((birthMonth >= 9) && (birthMonth <= 12)) {
			bankBalance = "$300,000";
		}
		System.out.println(bankBalance);

//Part 3
		String myOutput = firstName + lastName + " will retire in " + yearsRetirement + " years with " + bankBalance
				+ " in the bank, a vacation home in " + vacationLocation + " and travel by " + transportationMode + ".";
		System.out.println(myOutput);

		input.close();

	}
}
