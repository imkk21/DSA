import java.util.Scanner;

public class Lab9{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] charlieInput = sc.nextLine().split(" ");
        int[] charlie = new int[charlieInput.length];
        for (int i = 0; i < charlieInput.length; i++) {
            charlie[i] = Integer.parseInt(charlieInput[i]);
        }

        String[] daveInput = sc.nextLine().split(" ");
        int[] dave = new int[daveInput.length];
        for (int i = 0; i < daveInput.length; i++) {
            dave[i] = Integer.parseInt(daveInput[i]);
        }

        int charlie_points = 0;
        int dave_points = 0;

        for (int i = 0; i < charlie.length; i++) { 
            if (charlie[i] > dave[i]) {
                charlie_points++;
            } else if (charlie[i] < dave[i]) {
                dave_points++;
            }
        }

        System.out.println(charlie_points + " " + dave_points);

        sc.close();
    }
}
