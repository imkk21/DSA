import java.util.Scanner;

public class Lab8

{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Read the input values
        String[] input = scanner.nextLine().split(" ");
        int[] sightings = new int[input.length];

        for (int i = 0; i < input.length; i++)
        {
            sightings[i] = Integer.parseInt(input[i]);
        }

        // Call the method to find the most common plant
        System.out.println(findMostCommonPlant(sightings));

        scanner.close();
    }

    public static int findMostCommonPlant(int[] sightings)
    {
        int[] plantCount = new int[10]; // Array to store the count of each plant ID

        // Count the occurrences of each plant ID
        for (int plantID : sightings)
        {
            plantCount[plantID]++;
        }

        // Variables to track the most common plant
        int mostCommonPlantID = Integer.MAX_VALUE;
        int maxCount = 0;

        // Iterate over the plantCount array to find the plant with the highest frequency
        for (int i = 1; i < plantCount.length; i++)
        {
            if (plantCount[i] > maxCount || (plantCount[i] == maxCount && i < mostCommonPlantID))
            {
                mostCommonPlantID = i;
                maxCount = plantCount[i];
            }
        }

        return mostCommonPlantID; // Return the most common plant ID
    }
}
