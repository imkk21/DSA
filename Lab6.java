import java.util.Scanner;

public class Lab6 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] generatePrimes(int limit) {
        int[] primes = new int[limit];
        int primeCount = 0;

        for (int num = 2; num < limit; num++) {
            if (isPrime(num)) {
                primes[primeCount] = num;
                primeCount++;
            }
        }

        int[] primeList = new int[primeCount];
        System.arraycopy(primes, 0, primeList, 0, primeCount);

        return primeList;
    }

    public static int largestSpecialPrime(int limit) {
        int[] primes = generatePrimes(limit);

        for (int i = primes.length - 1; i >= 0; i--) {
            int prime = primes[i];
            String primeStr = String.valueOf(prime);

            boolean isSpecialPrime = true;
            for (int j = 1; j < primeStr.length(); j++) {
                int prefix = Integer.parseInt(primeStr.substring(0, j));
                if (!isPrime(prefix)) {
                    isSpecialPrime = false;
                    break;
                }
            }

            if (isSpecialPrime) {
                return prime;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();
        int result = largestSpecialPrime(inputNumber);
        if (result != -1) {
            System.out.println("The largest special prime less than " + inputNumber + " is: " + result);
        } else {
            System.out.println("No special prime found less than " + inputNumber);
        }

        scanner.close();
    }
}
