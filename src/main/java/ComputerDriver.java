import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputerDriver {
    public static void main(String[] args) {
        Scanner scanner = System.in;
        Computer computer = new Computer();
        printMenu();
        do {
            try {
                int userSelection = scanner.nextInt();
                switch (userSelection) {
                    case 1:
                        computer.select();
                        break;
                    case 2:
                        computer.copy();
                        break;
                    case 3:
                        computer.paste();
                        break;
                    case 4:
                        System.out.println("Enter a message to type: ");
                        String message = scanner.nextLine();
                        computer.type(message);
                        break;
                    default:
                        throw new InputMismatchException("Value must be a number 1-4 inclusive.");
                        break;
                }
            } catch (InputMismatchException inputMismatchException) {
                scanner.nextLine();    // Clear the invalid input
                System.out.println("Invalid input - " + inputMismatchException.getMessage());
            }
        } while(true);
    }

    public static void printMenu() {
        System.out.println("What would you like the computer to do?");
        System.out.println("1.    Left-Click to Select");
        System.out.println("2.    Right-Click to Copy");
        System.out.println("3.    Right-Click to Paste");
        System.out.println("4.    Type");
    }
}
