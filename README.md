# -CSC275-Assignment03

CSC 275 Assignment 3
Instructor: Andrew S. Webb
Question Subject Line: CSC 275 Online Assignment 3 Question
While out on a standard run we come across a strange planet that has a ship emitting an SOS beacon. We decide to proceed, not to help any survivors but to search for items. After our descent we find a crashed ship with a full cargo hold! We decide to take the time to empty their cargo hold and search through all of the items to determine what to take. We notice that they don’t store their items in the same boxes that we do, but rather have a system that creates specific size boxes for each item. This means that they can store 200 items if they are light enough, or 1 large heavy item (Remember, weight matters when trying to leave a planet!).
While you continue doing the grunt work of unloading the ship I head back to our ship to try and update it with the same features as the newly discovered, but wrecked, ship. I get started as you finish unloading and reloading everything, so I head out to search for survivors while you finish the upgrades.
•	Items now have attributes such as Name, Weight, Value, Durability and ID. (Create an object called ‘Item’)
•	We can carry an unlimited number of items, as long as they don’t exceed the maximum weight of the cargo bay, 25 Tons. (Use an ArrayList that checks an item’s weight before placing it in the cargo hold)
•	We need to be able to add and remove items by their name.
•	We need to be able to search for a specific type of item in our cargo bay based on the item’s name and one of its attributes (Implement 2 searches – one on name and another on any attribute you choose).
•	We need to be able to sort items by their names alphabetically in descending order (A-Z)
•	We need to know how many of each item we have in our cargo bay and display their attributes.
•	We must also add a partial search (think of this as a ‘filter’ option).

Using the same code as assignment 2 you can make your changes. I have included some base code for your convenience (This is 2 classes, Assignment2 and Item.

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment03Driver {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Assignment01Driver();
	}

	// This will act as our program switchboard
	public Assignment03Driver() {
		ArrayList<Item> cargohold = new ArrayList<Item>();

		System.out.println("Welcome to the BlackStar Cargo Hold interface.");
		System.out.println("Please select a number from the options below");
		System.out.println("");

		while (true) {
			// Give the user a list of their options
			System.out.println("1: Add an item to the cargo hold.");
			System.out.println("2: Remove an item from the cargo hold.");
			System.out.println("3: Sort the contents of the cargo hold.");
			System.out.println("4: Search for an item.");
			System.out.println("5: Display the items in the cargo hold.");
			System.out.println("6: Perform a partial search for an item.");
			System.out.println("0: Exit the BlackStar Cargo Hold interface.");

			// Get the user input
			int userChoice = input.nextInt();
			input.nextLine();

			switch (userChoice) {
			case 1:
				addItem(cargohold);
				break;
			case 2:
				removeItem(cargohold);
				break;
			case 3:
				sortItems(cargohold);
				break;
			case 4:
				searchItems(cargohold);
				break;
			case 5:
				displayItems(cargohold);
				break;
			case 6:
				partialSearch(cargohold);
				break;
			case 0:
				System.out.println("Thank you for using the BlackStar Cargo Hold interface. See you again soon!");
				System.exit(0);
			}
		}

	}

	private void addItem(ArrayList<Item> cargohold) {
		// TODO: Add an item that is specified by the user

	}

	private void removeItem(ArrayList<Item> cargohold) {
		// TODO: Remove an item that is specified by the user

	}

	private void sortItems(ArrayList<Item> cargohold) {
		// TODO: Sort the items in the cargo hold (No need to display them here) - Use Selection or Insertion sorts
		// NOTE: Special care is needed when dealing with strings! research the compareTo() method with strings

	}

	private void searchItems(ArrayList<Item> cargohold) {
		// TODO: Search for a user specified item

	}

	private void displayItems(ArrayList<Item> cargohold) {
		// TODO: Display only the unique items along with a count of any duplicates
		//
		// For example it should say
		// Food - 2
		// Water - 3
		// Ammunition - 5

	}

	private void partialSearch(ArrayList<Item> cargohold) {
		// Search for an item based on a partial name
	}
}

// This item class should be stored in its own file.
public class Item {
	// Declare attributes here
	
	public Item(){
		
	}
	
	// Create an overridden constructor here
	
	// Create accessors and mutators for your traits
}

