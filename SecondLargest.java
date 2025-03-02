import java.util.Scanner;


public class SecondLargest{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] input =sc.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        if(nums.length<2){
            System.out.println("-1");
        }
        else{
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

           
            for (int num : nums) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num < largest) {
                    secondLargest = num;
                }
            }
            System.out.println(secondLargest);
        }

      

        sc.close();
        }

    }


/*public int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
 */