import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] arr = new int[inputArray.length];
        scanner.close();

        // Check for array size constraint
        if (arr.length < 1 || arr.length > 10) {
            System.out.println("Array size must be between 1 and 10");
            return;
        }

        // Exception Code for -10 to 10
        try {
            for (int i = 0; i < inputArray.length; i++) {
                arr[i] = Integer.parseInt(inputArray[i]);
                if (arr[i] < -10 || arr[i] > 10) {
                    System.out.println("Array elements must be from -10 to 10");
                    return;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Array elements must be integers");
            return;
        }

        //  check all subarrays
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == 0) {
                    System.out.println("True");
                    System.out.println(arr.length);
                    return;
                }
            }
        }

        System.out.println("False");
        System.out.println(arr.length);
    }
}


//4 -2 3 1 6