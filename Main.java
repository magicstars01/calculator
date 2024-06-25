import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        welcome();

        System.out.println("Enter the first number: ");
        double a = input.nextDouble();
        System.out.println("Enter the second number: ");
        double b = input.nextDouble();


        System.out.println("Enter an operator: +, -, *, /, %");
        char operator = input.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+' : result = a + b;
            break;
            case '-' : result = a - b;
            break;
            case '*' : result = a * b;
            break;
            case '/' : result = a / b;
            break;
            case '%' : result = a % b;
            break;
            default: System.out.println("Error: this is not an operator.");

        }

        System.out.println("Result: " + result);

    }

    static void welcome() {
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Hello " + name + ", this is a calculator program");
    }
}