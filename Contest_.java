import java.util.Scanner;

public class Contest_Vandana {

  
    public static void findCombinations(int[] prices, int budget, int[] quantities, int idx, int currentSum, int[][] result, int[] resultCount) {
        if (currentSum == budget) {
            for (int i = 0; i < quantities.length; i++) {
                result[resultCount[0]][i] = quantities[i]; 
            }
            resultCount[0]++;
            return;
        }
        if (currentSum > budget || idx == prices.length) {
            return;
        }

    
        for (int i = 0; i <= 5; i++) {
            quantities[idx] = i;
            findCombinations(prices, budget, quantities, idx + 1, currentSum + prices[idx] * i, result, resultCount);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
        String budgetInput = scanner.nextLine();    //Maximum budget
        int budget;
        scanner.close();
        try {
            budget = Integer.parseInt(budgetInput);
            if (budget <= 0) {
                System.out.println("Invalid Input");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
            return;
        }


        int numStocks;        //Number of stocks
        try {
            numStocks = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
            return;
        }

        String[] stockNames = new String[numStocks];
        int[] prices = new int[numStocks];

     
        
        for (int i = 0; i < numStocks; i++) {           //Stock names and prices
            String[] stockInput = scanner.nextLine().split(" ");
            stockNames[i] = stockInput[0];

            try {
                int price = Integer.parseInt(stockInput[1]);
                if (price <= 0) {
                    System.out.println("The stock prices should be at least greater than 0");
                    return;
                }
                if (price > budget) {
                    System.out.println("One of the stock prices is higher than the target price");
                    return;
                }
                prices[i] = price;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input");
                return;
            }
        }

       
        int maxCombinations = (int) Math.pow(6, numStocks);
        int[][] result = new int[maxCombinations][numStocks];
        int[] resultCount = new int[1]; 

      
        int[] quantities = new int[numStocks];
        findCombinations(prices, budget, quantities, 0, 0, result, resultCount);

        for (int i = 0; i < resultCount[0]; i++) {
            for (int j = 0; j < numStocks; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

       
        System.out.println(resultCount[0]);
    
    }
}
