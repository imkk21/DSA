import java.util.Scanner;

public class Contest_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalMoney = sc.nextInt();
        sc.nextLine();

        String priceLine = sc.nextLine();
        String[] priceStrings = priceLine.split(" ");
        int n = priceStrings.length;
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(priceStrings[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (prices[i] + prices[j] == totalMoney) {
                    System.out.println((i + 1) + " " + (j + 1));
                    sc.close();
                    return;
                }
            }
        }

        sc.close();
    }
}
