import java.util.Scanner;

public class ArrayWithoutN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int [] n = new int[arr.length];

        for(int i =0; i< arr.length; i++){
            n[i] = Integer.parseInt(arr[i]);
        }

        for(int i =0; i< n.length; i++){
            System.out.print(n[i] + " ");
        }
        sc.close();
    }
}
