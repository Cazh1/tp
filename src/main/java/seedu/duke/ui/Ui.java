package seedu.duke.ui;

import java.util.Scanner;

public class Ui {
    private final Scanner scanner;

    /**
     * Constructs a UI instance with a Scanner for user input.
     */
    public Ui() {
        scanner = new Scanner(System.in);
    }

    public String receiveUserInput() {
        return scanner.nextLine();
    }

    public void showWelcome() {
        System.out.println(UserOutput.WELCOME_MESSAGE.message);
    }

    public void showGoodbye() {
        System.out.println(UserOutput.GOODBYE_MESSAGE.message);
    }
    /** Shows messages(s) to the user **/
    public void showToUser(String... message) {
        for (String m: message) {
            System.out.println(m);
        }
    }

    public void showEditPriceMessage(String menuItem) {
        System.out.println("Modified the following dish: ");
        showToUser(menuItem);
    }
}
