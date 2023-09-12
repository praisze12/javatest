package extension;

public class add {
        public static int addDigits(int number) {
            if (number < 10 || number > 99) {
                throw new IllegalArgumentException("Number must be between 10 and 99 (inclusive).");
            }

            int tensDigit = number / 10;     // to take out the the tens digit
            int onesDigit = number % 10;     // to take out the ones digit

            int sum = tensDigit + onesDigit; // Add the digits together

            return sum;
        }

        public static void main(String[] args) {
            // Test the addDigits method
            int number = 45; // Change this to any number between 10 and 99
            int result = addDigits(number);
            System.out.println("The sum of the digits of " + number + " is: " + result);
        }
    }


