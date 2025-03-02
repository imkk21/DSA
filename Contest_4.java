import java.util.Scanner;

public class Contest_4
{

    public static void findMountainPeaks(String[] heightsInput)
    {
        int n = heightsInput.length;
        int[] heights = new int[n];

        // Exception handling input
        for (int i = 0; i < n; i++)
        {
            try
            {
                heights[i] = Integer.parseInt(heightsInput[i]);}
            catch (NumberFormatException e)
            {
                System.out.println("Input was not in a correct format");
                return;}}  // Stop processing further

        if (n < 3)
        {
            System.out.println("0");
            return;}

        int maxPeak = 0;
        int peakCount = 0;
        int[] peaks = new int[n];  // Array to store peaks

        // Detect peaks
        for (int i = 1; i < n - 1; i++)
        {
            if (heights[i] > heights[i - 1] && heights[i] > heights[i + 1])
            {
                peaks[peakCount] = heights[i];
                peakCount++;
                maxPeak = Math.max(maxPeak, heights[i]);}}

        if (peakCount == 0)
        {
            System.out.println("0");
            return;}

        // Count and print only the peaks that match the highest peak value
        int maxPeakCount = 0;
        for (int i = 0; i < peakCount; i++)
        {
            if (peaks[i] == maxPeak || peaks[i] < maxPeak)
            {
                maxPeakCount++;}}

        // Output results
        System.out.println(maxPeakCount);
        for (int i = 0; i < peakCount; i++)
        {
            if (peaks[i] == maxPeak || peaks[i] < maxPeak)
            {
                System.out.print(peaks[i] + " ");}}}

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();  // Input as a string
        String[] heightsInput = input.split(" ");  // Anput as an Array
        
        findMountainPeaks(heightsInput);
        scanner.close();}}
