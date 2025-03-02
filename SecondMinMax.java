import java.util.Scanner;
import java.util.Arrays;  

public class SecondMinMax {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);    

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i= 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int secondMin = -1;
        int secondMax = -1;

        for (int i = 1; i < n; i++){
            if(arr[i]!= arr[0]){
                secondMin = arr[i];
                break;  
            }
        } 

        for (int i=n-2; i >= 0; i--){
            if (arr[i] != arr[n-1]){
                secondMax = arr[i];
                break;
            }
        }

        System.out.println("Second Min: " + secondMin);
        System.out.println("Second Max: " + secondMax);

        sc.close();


    }
    
}
