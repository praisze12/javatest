package switc;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12: ");
       // System.out.println("Your number is " + number);

        String number = scanner.nextLine();
        switch (number) {
            // if
            case "12":
            case "1":
            case "2":
                System.out.println(" your season is winter");
                break;
            case "3":
            case "4":
            case "5":
                System.out.println(" your season is spring");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println(" your season is summer");
                break;
            default:
                System.out.println("Invalid number entry, enter a valid number between 1 and 12");
        }

            //System.out.println("Enter an operator + - / ");
            //String ope = scanner.nextLine();
            // System.out.println("Your chosen operator  is " + ope);


        }
    }
