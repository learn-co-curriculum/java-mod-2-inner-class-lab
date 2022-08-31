# Inner Class Lab

## Learning Goals

- Use inner classes in Java

## Instructions

Time to get some practice with inner classes and using them in Java!

In this lab, there will be one outer class and inner classes to model how a
computer works. The outer class will be `Computer` and the two inner classes
will be `Mouse` and `Keyboard`. Consider the following starter code below:

```java
/**
 * Outer class Computer
 */
public class Computer {

    // Your outer class code here

    /**
     * Inner class Mouse to perform a click event
     */
    private class Mouse {
        // Your code here
    }

    /**
     * Inner class Keyboard to perform a keyboard event
     */
    private class Keyboard {
        // Your code here
    }
}
```

Write the code for the three classes you see above so that we can operate the
computer in the `ComputerDriver` class. Follow the instructions below and use
the driver class as a reference for the methods that are expected:

- The `Mouse` class should have a left-click method to select and a right-click
  method to copy or paste.
- The `Keyboard` class should have a method to type a specific message to the
  screen. The message will come from the user in the driver class.
- The `Computer` class should have methods that make use of the appropriate
  inner class instances to `select()`, `copy()`, `paste()`, and
  `type(String msg)`.

Reference the driver class as needed:

```java
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
```

## Example Output


