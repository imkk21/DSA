import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

      
        input.close();

        float[] ratios = calculateRatios(array);
        System.out.printf("%.3f%n", ratios[0]); // Positive ratio
        System.out.printf("%.3f%n", ratios[1]); // Negative ratio
        System.out.printf("%.3f%n", ratios[2]); // Zero ratio
    }
    
    public static float[] calculateRatios(int[] array) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int total = array.length;
        for (int num : array) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        float positiveRatio = (float) positiveCount / total;
        float negativeRatio = (float) negativeCount / total;
        float zeroRatio = (float) zeroCount / total;
        return new float[] { positiveRatio, negativeRatio, zeroRatio };
    }
}
