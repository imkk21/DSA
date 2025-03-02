import java.util.PriorityQueue;
import java.util.Scanner;

public class Lab16 {
    
    public static int minStepsToTargetSweetness(int[] candies, int targetSweetness) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        // Add all candies to the min-heap
        for (int candy : candies) {
            minHeap.add(candy);
        }
        
        int steps = 0;

        // Continue combining candies until the least sweet candy reaches or exceeds the target
        while (minHeap.peek() < targetSweetness) {
            // If we can't combine further (less than 2 candies left), return -1
            if (minHeap.size() < 2) {
                return -1; // or you could return steps, depending on how you want to handle it
            }

            // Remove the two least sweet candies
            int leastSweet = minHeap.poll();
            int secondLeastSweet = minHeap.poll();

            // Combine the two least sweet candies
            int newSweetness = leastSweet + 2 * secondLeastSweet;

            // Add the new sweetness back into the heap
            minHeap.add(newSweetness);

            // Increment the step count
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetSweetness = scanner.nextInt();
        
        scanner.nextLine();  // Consume the newline character
        String[] input = scanner.nextLine().split(" ");
        // Create an array to hold the candies
        int[] candies = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            candies[i] = Integer.parseInt(input[i]);
        }

        int steps = minStepsToTargetSweetness(candies, targetSweetness);
        System.out.println(steps);
        
        scanner.close();  
    }
}
