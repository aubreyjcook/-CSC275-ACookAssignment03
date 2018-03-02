import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Assignment3 {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Assignment3();
	}

	// This will act as our program switchboard
	public Assignment3() {
		
		ArrayList<Item> cargoHold = new ArrayList<Item>();
		
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
			System.out.println("0: Exit the BlackStar Cargo Hold interface.");

			// Get the user input
			int userChoice = input.nextInt();
			input.nextLine();
			
			switch (userChoice) {
				case 1:
					addItem(cargoHold);
					break;
				case 2:
					removeItem(cargoHold);
					break;
				case 3:
					sortItems(cargoHold);
					break;
				case 4:
					searchItems(cargoHold);
					break;
				case 5:
					displayItems(cargoHold);
					break;
				case 0:
					System.out.println("Thank you for using the BlackStar Cargo Hold interface. See you again soon!");
					System.exit(0);
				default:
					System.out.println("Invalid value. Choose a number 0-5 only.");
					break;
			}
		}

	}

	private void addItem(ArrayList<Item> cargohold) {
		cargohold.add(new Item());
		int index = cargohold.size(); 
		Item tempItem = new Item();
		System.out.println("Enter the Item's name");
		String userInput = input.nextLine();
		tempItem.setItemName(userInput);
		System.out.println("Enter the Item's weight");
		userInput = input.nextLine();
		tempItem.setItemWeight(userInput);
		System.out.println("Enter the Item's value");
		userInput = input.nextLine();
		tempItem.setItemValue(userInput);
		System.out.println("Enter the Item's durability");
		userInput = input.nextLine();
		tempItem.setItemDurability(userInput);
		System.out.println("Enter the Item's ID");
		userInput = input.nextLine();
		tempItem.setItemID(userInput);
		
		cargohold.set(index - 1, tempItem);
		System.out.println("Item added successfully");
		
		/*
		System.out.println("Enter the item name below.");
		String itemName = input.nextLine();
		
		System.out.println("Enter the item weight below.");
		String itemWeight = input.nextLine();
		
		System.out.println("Enter the item value below.");
		String itemValue = input.nextLine();
		
		System.out.println("Enter the item durability below.");
		String itemDurability = input.nextLine();
		
		cargohold.add(new Item(itemName, itemWeight, itemValue, itemDurability));
		
		//System.out.println(cargoHold[j].name + " has been added successfully.");
		
		System.out.println("The cargoHold is full. You need to remove an item to add a new one.");
		return;
		*/
	}

	private void removeItem(ArrayList<Item> cargohold) {
		/*
		System.out.println("Enter the name of the item to be removed.");
		String userInput = input.nextLine();
		
		for(int i = 0; i < cargoHold.length; i++) {
			if(cargoHold[i].name.equals(userInput)) {
				cargoHold[i].name = "none";
				cargoHold[i].weight = "none";
				cargoHold[i].value = "none";
				cargoHold[i].durability = "none";
				System.out.println("Item removed.");
				break;
			} else if (i == cargoHold.length - 1) {
				System.out.println("That item is not in the cargoHold.");
			}
		}*/
		return;
	}

	private void sortItems(ArrayList<Item> cargohold) {
		
		/*
		//checking for null values in the array
		int nullCounter = 0;
		
		for(int i= 0; i < cargoHold.length; i++) {
			if(cargoHold[i].name.equals("none")) {
				nullCounter++;					
			}
		}
		
		//moves all null values to the end of the array
		while(nullCounter > 0) {
			for(int i = 0; i < cargoHold.length; i++) {
				if(cargoHold[i].name.equals("none")) {
					for (int j = (i + 1); j < cargoHold.length; j++) {
						cargoHold[j - 1] = cargoHold[j];
					}
					cargoHold[cargoHold.length-1].name.equals("none");
					break;
				}
			}
			nullCounter--;
		}
		
		
		//sorting after moving null values to the end of the array
		for(int x = 0; x < cargoHold.length; x++) { //this for loop repeats the sorting process according to the length of the array to enhance sorting accuracy
			for (int i = 0; i < cargoHold.length-1; i++) {
				int minimum = i;
				//System.out.println(minimum);
				for (int j = i + 1; j < cargoHold.length; j++) {
					//System.out.println(j);
					//System.out.println(cargoHold[i].compareTo(cargoHold[minimum]));
					if(!cargoHold[j].name.equals("none")) {
						if(cargoHold[j].name.compareTo(cargoHold[minimum].name) < 0) {
							minimum = j;
							//Debug Note: Outputs array reassignments in real time. 
							//System.out.println("Swapping " + cargoHold[i] + " with " + cargoHold[minimum]);
							//System.out.println(Arrays.asList(cargoHold));
							Item transfer = cargoHold[i];
							cargoHold[i] = cargoHold[minimum];
							cargoHold[j] = transfer;
						}
					}
				}
			}
		}
		System.out.println("cargoHold sorted.");*/
		
		return;
	}

	private void searchItems(ArrayList<Item> cargohold) {
		
		/*
		System.out.println("Enter the item you wish to search for.");
		String userInput = input.nextLine();
		
		for(int i = 0; i < cargoHold.length; i++) {
			if(cargoHold[i].name.equals("none")) {
				continue;
			} else if (userInput.equals(cargoHold[i].name)) {
				System.out.println("The item was found at section number " + (i + 1));
				return;
			}
		}
		System.out.println("The item was not found in the cargo hold.");
		*/
	}

	private void displayItems(ArrayList<Item> cargohold) {
		
		
		//simple output
		/*for(int i = 0; i < cargohold.size(); i++) {
			System.out.println(cargohold.get(i).name);
			System.out.println(cargohold.get(i).weight);
			System.out.println(cargohold.get(i).value);
			System.out.println(cargohold.get(i).durability);
			System.out.println(cargohold.get(i).ID);
		
		}
		*/
	}
}