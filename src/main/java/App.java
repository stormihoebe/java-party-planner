import java.io.Console;

public class App{
	public static void main(String[] args) {
		Console myConsole = System.console();
		boolean programRunning = true;

		System.out.println("Hello! We make party planning easy. I'll ask you a few simple details about your party, and give you a quote in seconds. Press 1 to continue or 2 to quit");
		String userContinue = myConsole.readLine();
		if (userContinue.equals("2")){
			programRunning = false;
		}
		while(programRunning) {
			System.out.println("How many guests will be attending your party or event?");
			Integer guests = Integer.parseInt(myConsole.readLine());

			System.out.println("What kind of food would you like to serve at the party or event? Enter the number corrisponding with your choice:\n0. No Food\n1. Light Snacks\n2. Hors doeuvres\n3. Pizza\n4. 5 course meal");
			Integer food = Integer.parseInt(myConsole.readLine());

			System.out.println("What kind of drinks would you like available for your guests? Enter the number corrisponding with your choice:\n0. No Drinks\n1. Coffee or Tea\n2. Beer\n3. Open Bar");
			Integer drinks = Integer.parseInt(myConsole.readLine());

			System.out.println("What kind of entertainment would you like to offer? Enter the number corrisponding with your choice:\n0. No Entertainment\n1. DJ\n2. Clowns\n3. Magician\n4. Keynote Speaker");
			Integer entertainment = Integer.parseInt(myConsole.readLine());

			System.out.println("Please enter your coupon code now if applicable");
			String coupon = myConsole.readLine();
			Party newParty = new Party(guests, food, drinks, entertainment, coupon);

			System.out.println("Your responses were recorded as follows:");
			System.out.println("Number of guests: " + newParty.getGuests());
			System.out.println("Food Option # " + newParty.getFoodChoice());
			System.out.println("Drink Option # " + newParty.getDrinkChoice());
			System.out.println("Entertainment Option # " + newParty.getEntertainmentChoice());
			System.out.println("Coupon Code: " + newParty.getCoupon());


			System.out.println("\n----------------------\nYour total cost for this party comes to: $" + newParty.partyPrice(guests, food, drinks, entertainment, coupon)+"\n----------------------\n");

			System.out.println("Choose from the following options: \n1. Submit your responses and quit application \n2. Start over to make adjustments to your previous responses");
			userContinue = myConsole.readLine();
			if (userContinue.equals("1")){
				programRunning = false;
			}


		}
	}
}
