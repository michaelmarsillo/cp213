package cp213;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Wraps around an Order object to ask for MenuItems and quantities.
 *
 * @author Michael Marsillo 169057769 mars7769@mylaurier.ca
 * @author Abdul-Rahman Mawlood-Yunis
 * @author David Brown
 * @version 2024-10-15
 */
public class Cashier {

    private Menu menu = null;

    /**
     * Constructor.
     *
     * @param menu A Menu.
     */
    public Cashier(Menu menu) {
	this.menu = menu;
    }

    /**
     * Reads keyboard input. Returns a positive quantity, or 0 if the input is not a
     * valid positive integer.
     *
     * @param scan A keyboard Scanner.
     * @return
     */
    private int askForQuantity(Scanner scan) {
	int quantity = 0;
	System.out.print("How many do you want? ");

	try {
	    String line = scan.nextLine();
	    quantity = Integer.parseInt(line);
	} catch (NumberFormatException nfex) {
	    System.out.println("Not a valid number");
	}
	return quantity;
    }

    /**
     * Prints the menu.
     */
    private void printCommands() {
	System.out.println("\nMenu:");
	System.out.println(menu.toString());
	System.out.println("Press 0 when done.");
	System.out.println("Press any other key to see the menu again.\n");
    }

    /**
     * Asks for commands and quantities. Prints a receipt when all orders have been
     * placed.
     *
     * @return the completed Order.
     */
    public Order takeOrder() {
	System.out.println("Welcome to WLU Foodorama!");

	// your code here
	int command = -1;
	Order order = new Order();
	printCommands();

	try (Scanner input = new Scanner(System.in)) {
	    while (command != 0) {
		int q = 0;
		System.out.print("Command: ");
		try {
		    command = input.nextInt();
		} catch (InputMismatchException e) {
		    System.out.println("Not a valid number");
		    continue;
		} finally {
		    input.nextLine();
		}

		if (command == 0) {
		} else if (command < 0 || command > menu.size()) {
		    printCommands();
		} else {
		    while (q == 0) {
			System.out.print("How many do you want? ");
			try {
			    q = input.nextInt();
			    if (q <= 0) {
				break;
			    }
			} catch (InputMismatchException e) {
			    System.out.println("Not a valid number");
			} finally {
			    input.nextLine();
			}
		    }

		    if (q > 0) {
			order.add(menu.getItem(command - 1), q);
		    }
		}
	    }
	}

	System.out.println(order);

	return order;
    }
}