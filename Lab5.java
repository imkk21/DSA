import java.util.Scanner;

public class Lab5 {


    // single digit cumulative sum
    public static int getSingleDigitSum(int number) {
        while (number > 9) {
            int sum = 0;
            while (number != 0) {
                sum += number % 10;
                number /= 10;
            }
            number = sum;
        }
        return number;
    }
    // code building for even and odd digits
    public static String decodeDigit(int digit) {
        if (digit % 2 != 0) {
            return String.valueOf((char) ('a' + (digit - 1)));
        } else {
            return String.valueOf(digit);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // input the PIN Code
        String input = scanner.nextLine();
        
        // initializing the array 
        String[] numbers = input.split(" ");
        
        StringBuilder decodedPin = new StringBuilder(); // string builder class and object
        
        for (String num : numbers) {
            int number = Integer.parseInt(num);
            int singleDigit = getSingleDigitSum(number);
            decodedPin.append(decodeDigit(singleDigit));
        }
        
        // final output
        System.out.println(decodedPin.toString());
        
        scanner.close();
    }
}
