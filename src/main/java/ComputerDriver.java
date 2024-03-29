import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputerDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer();
        int userSelection = -1;
        do {
            printMenu();
            try {
                userSelection = scanner.nextInt();
                switch (userSelection) {
                    case 0:
                        break;
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
                        String message = promptMessage();
                        computer.type(message);
                        break;
                    default:
                        throw new InputMismatchException("Value must be a number 0-4 inclusive.");
                }
            } catch (InputMismatchException inputMismatchException) {
                scanner.nextLine();    // Clear the invalid input
                System.out.println("Invalid input - " + inputMismatchException.getMessage());
            }

            System.out.println();
        } while(userSelection != 0);
    }

    public static void printMenu() {
        System.out.println("What would you like the computer to do?");
        System.out.println("0.    Exit");
        System.out.println("1.    Left-Click to Select");
        System.out.println("2.    Right-Click to Copy");
        System.out.println("3.    Right-Click to Paste");
        System.out.println("4.    Type");
        System.out.println();
    }

    public static String promptMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message to type: ");
        return scanner.nextLine();
    }
}
