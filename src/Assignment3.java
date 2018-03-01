import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Assignment3 {
	Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		new Assignment3();
	}

	// This will act as our program switchboard
	public Assignment3() {
		
		Item[] cargoHold = new Item[10];
		for(int i = 0; i < cargoHold.length; i++) {
			cargoHold[i] = new Item();
			cargoHold[i].ID = Integer.toString(i + 1);
		}

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

	private void addItem(Item cargoHold[]) {
		for (int j = 0; j < cargoHold.length; j++) {
			if (cargoHold[j].name.equals("none")) {
				System.out.println("Enter the item name below.");
				String userInput = input.nextLine();
				cargoHold[j].name = userInput;
				System.out.println("Enter the item weight below.");
				userInput = input.nextLine();
				cargoHold[j].weight = userInput;
				System.out.println("Enter the item value below.");
				userInput = input.nextLine();
				cargoHold[j].value = userInput;
				System.out.println("Enter the item durability below.");
				userInput = input.nextLine();
				cargoHold[j].durability = userInput;
				System.out.println(cargoHold[j].name + " has been added successfully.");
				break;
			} else if (j == cargoHold.length - 1) {
				System.out.println("The cargoHold is full. You need to remove an item to add a new one.");
			}
		}
		return;
	}

	private void removeItem(Item cargoHold[]) {
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
		}
		return;
	}

	private void sortItems(Item cargoHold[]) {
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
		System.out.println("cargoHold sorted.");
		return;
	}

	private void searchItems(Item cargoHold[]) {
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
	}

	private void displayItems(Item cargoHold[]) {
		// TODO: Display only the unique items along with a count of any duplicates
		//
		// For example it should say
		// Food - 2
		// Water - 3
		// Ammunition - 5
		/*System.out.println(Arrays.asList(cargoHold));*/
		
		int count = 1;
		
		for(int i = 0; i < cargoHold.length; i++) {
			if(cargoHold[i].name.equals("none")) {
				count++;
			}
		}
		
		Item[] itemsFound = new Item[10];
		
		if(count > 0) {
			System.out.println("There are " + count + " empty spaces in the cargoHold.");
		}
		
		for (int i = 0; i < cargoHold.length; i++) {
			if (!cargoHold[i].name.equals("none") && !(Arrays.asList(itemsFound).contains(cargoHold[i]))) {
				
				count = Collections.frequency(Arrays.asList(cargoHold), cargoHold[i].name);					
				System.out.println("There are " + count + " " + cargoHold[i].name + " items in the cargoHold.");
				itemsFound[i] = cargoHold[i];
				
			}
		}
		/* simple output
		for(int i = 0; i<cargoHold.length; i++) {
			System.out.println(cargoHold[i].name);
			System.out.println(cargoHold[i].weight);
			System.out.println(cargoHold[i].value);
			System.out.println(cargoHold[i].durability);
			System.out.println(cargoHold[i].ID);
			
		}*/
	}
}