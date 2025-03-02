import java.util.Scanner;


public class TwoSum{

    public int[] twoSum(int[] nums , int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoSum twosum = new TwoSum();

        String[] input = sc.nextLine().split("");
        int[] nums = new int[input.length];
        for(int i = 0; i < input.length ; i++ )
        {
            nums[i] = Integer.parseInt(input[i]);
        }

        int target = sc.nextInt();

        int[] result = twosum.twoSum(nums , target);
        System.out.println("Output: [" + result[0] + "," + result[1] + "]");

        sc.close();
    }
}