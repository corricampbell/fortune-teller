import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("FORTUNE TELLER");

//Part 1
		System.out.println("What is your first name?");
		String firstName = input.next();
		if (firstName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter.");
			System.exit(0);
		}

		System.out.println("What is your last name?");
		String lastName = input.next();
		if (lastName.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter.");
			System.exit(0);}

		System.out.println("What is your age?");
		String numberAge = input.next();
		if (numberAge.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter.");
			System.exit(0);}
		int foo = Integer.parseInt (numberAge);
			
		System.out.println("What is your birth month? (1-12)");
		String birthMonth = input.next().toLowerCase();
		if (birthMonth.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter.");
			System.exit(0);}
		int birth = Integer.parseInt (birthMonth);

		System.out.println("What is your favorite ROYGBIV color? Unsure what ROYGBIV is? Type Help!");
		String favoriteColor = input.next().toLowerCase();

		String needHelp = "";
		while (favoriteColor.toLowerCase().equals("help")) {
			needHelp = "Red, Orange, Yellow, Green, Blue, Indigo, Violet";
			System.out.println(needHelp);

			favoriteColor = input.next();

		}

		System.out.println("How many siblings do you have?");
		String numberSibling = input.next().toLowerCase();
		if (numberSibling.toLowerCase().equals("quit")) {
			System.out.println("Nobody likes a quitter.");
			System.exit(0);}
		int sibling = Integer.parseInt(numberSibling);

//Part 2
		String yearsRetirement = "";
		System.out.println("Years until retirement:");
		if (foo % 2 == 0) {
			yearsRetirement = "10";
		} else {
			yearsRetirement = "15";
		}
		System.out.println(yearsRetirement);

		String vacationLocation = "";
		System.out.println("Vacation Home Location:");
		if (sibling <= 0) {
			vacationLocation = "Detroit";
		} else if (sibling == 1) {
			vacationLocation = "Hawaii";
		} else if (sibling == 2) {
			vacationLocation = "Mississippi";
		} else if (sibling == 3) {
			vacationLocation = "Idaho";
		} else if (sibling > 3) {
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
		if (birth <= 4) {
			System.out.println("$500,000");
		} else if ((birth >= 5) && (birth <= 8)) {
			bankBalance = "$400,000";
		} else if ((birth >= 9) && (birth <= 12)) {
			bankBalance = "$300,000";
		}
		System.out.println(bankBalance);

//Part 3
		String myOutput = firstName + " " + lastName + " will retire in " + yearsRetirement + " years with "
				+ bankBalance + " in the bank, a vacation home in " + vacationLocation + " and travel by "
				+ transportationMode + ".";
		System.out.println(myOutput);
		
		input.close();

		}
		}
