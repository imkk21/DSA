import java.util.Scanner;

public class Lab7
{

    public static int countDivisiblePairs(int[] arr, int k)
    {
        int count = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if ((arr[i] + arr[j]) % k == 0)
                {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int divisor = scanner.nextInt();
        int[] array = new int[6];

        for (int i = 0; i < 6; i++) {
            array[i] = scanner.nextInt();
        }
        // Calculate and print the output
        int output = countDivisiblePairs(array, divisor);
        System.out.println(output);

        scanner.close();
    }
}
