import java.util.*;

public class Lab11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // // Input size of arrays
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // Input the three arrays
        
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[3]; 
        
        for (int i = 0; i < 3; i++) {
            arr1[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            arr2[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            arr3[i] = sc.nextInt();
        }

     
        findCommonElements(arr1, arr2, arr3);
        
        sc.close();
    }

    public static void findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
        int i = 0, j = 0, k = 0;
        boolean found = false;
        
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
                k++;
                found = true;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        
        if (!found) {
            System.out.println("NO Elements");
        }
    }
}
