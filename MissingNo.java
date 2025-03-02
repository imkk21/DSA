import java.util.Scanner;

public class MissingNo {

    public static int findSum(int arr[], int n){
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;

        for(int i=0; i<arr.length; i++){
            actualSum = actualSum + arr[i];
        }

        return expectedSum - actualSum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n-1];

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(findSum(arr,n));
        sc.close();
        }
}
