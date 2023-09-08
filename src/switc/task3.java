package switc;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number ");
        float number1 = scanner.nextFloat();
        System.out.println("Enter your second number ");
        float number2 = scanner.nextFloat();
        System.out.println("Enter a math operator: ");
        String operator = scanner.next();
        // System.out.println("Your number is " + number);

        switch (operator) {
            // if
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            default:
                System.out.println("Invalid entry, enter a valid entry");
        }
    }
}
