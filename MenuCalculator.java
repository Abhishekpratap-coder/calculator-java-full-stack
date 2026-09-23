import java.util.Scanner;

public class MenuCalculator {

    private Scanner sc = new Scanner(System.in);
    private int num1, num2;

    // Method to take two numbers
    public void entry() {
        System.out.print("Enter first number : ");
        num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }

    // Addition
    public void add() {
        entry();
        int result = num1 + num2;

        System.out.println("Sum = " + result);
        System.out.println("Calculation: " + num1 + " + " + num2 + " = " + result);
    }

    // Subtraction
    public void subtract() {
        entry();
        int result = num1 - num2;

        System.out.println("Difference = " + result);
        System.out.println("Calculation: " + num1 + " - " + num2 + " = " + result);
    }

    // Multiplication
    public void multiply() {
        entry();
        int result = num1 * num2;

        System.out.println("Product = " + result);
        System.out.println("Calculation: " + num1 + " × " + num2 + " = " + result);
    }

    // Division
    public void divide() {
        entry();

        if (num2 == 0) {
            System.out.println("Error: Cannot divide by zero!");
        } else {
            double result = (double) num1 / num2;

            System.out.println("Quotient = " + result);
            System.out.println("Calculation: " + num1 + " / " + num2 + " = " + result);
        }
    }

    // Modulus
    public void modulus() {
        entry();

        if (num2 == 0) {
            System.out.println("Error: Cannot find modulus with zero!");
        } else {
            int result = num1 % num2;

            System.out.println("Remainder = " + result);
            System.out.println("Calculation: " + num1 + " % " + num2 + " = " + result);
        }
    }

    // Square of a number
    public void square() {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = number * number;

        System.out.println("Square = " + result);
        System.out.println("Calculation: " + number + "² = " + result);
    }

    // Power
    public void power() {
        entry();

        double result = Math.pow(num1, num2);

        System.out.println("Power = " + result);
        System.out.println("Calculation: " + num1 + "^" + num2 + " = " + result);
    }

    // Display menu
    public void showMenu() {

        int choice;

        do {
            System.out.println();
            System.out.println("======================================");
            System.out.println("         SMART MENU CALCULATOR");
            System.out.println("======================================");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus (Remainder)");
            System.out.println("6. Square");
            System.out.println("7. Power");
            System.out.println("0. Exit");
            System.out.println("======================================");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            System.out.println();

            switch (choice) {

                case 1:
                    add();
                    break;

                case 2:
                    subtract();
                    break;

                case 3:
                    multiply();
                    break;

                case 4:
                    divide();
                    break;

                case 5:
                    modulus();
                    break;

                case 6:
                    square();
                    break;

                case 7:
                    power();
                    break;

                case 0:
                    System.out.println("Thank you for using Smart Calculator!");
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 0);
    }

    // Main Method
    public static void main(String[] args) {

        MenuCalculator calc = new MenuCalculator();

        System.out.println("**************************************");
        System.out.println("      WELCOME TO SMART CALCULATOR");
        System.out.println("**************************************");

        calc.showMenu();
    }
}
