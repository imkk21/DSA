import java.util.Arrays;
import java.util.Scanner;

public class RemoveDup{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);

        int index = 1;

        for (int i = 1; i< n; i++){     // 1 1 2 2 3 3 4 4 5 5
            if(arr[i]!= arr[index-1]){
                arr[index++] = arr[i];
            }
        }

        for (int i = 0; i < index; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}


/*
Step	i	nums[i]	index	nums[index - 1]	Condition (nums[i] != nums[index-1])	Action	Array After Update
1	1	1	1	1	❌ (1 == 1) (Skip)	Skip	[1, 1, 2, 2, 3]
2	2	2	1	1	✅ (2 != 1) (New Unique)	nums[index] = 2, index++	[1, 2, 2, 2, 3]
3	3	2	2	2	❌ (2 == 2) (Skip)	Skip	[1, 2, 2, 2, 3]
4	4	3	2	2	✅ (3 != 2) (New Unique)	nums[index] = 3, index++	[1, 2, 3, 2, 3] */