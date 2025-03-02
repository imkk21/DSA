// import java.util.Scanner;

// public class RepeatatingElement {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < i; j++) { 
//                 if (arr[i] == arr[j]) { 
//                     System.out.println(arr[i]); 
//                     sc.close();
//                     return;  
//                 }
//             }
//         }

//         sc.close();
//     }
// }



import java.util.HashSet;
import java.util.Scanner;

public class RepeatatingElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(set.contains(num)){
                System.out.println(num);
                sc.close();
                return;
            }
            set.add(num);
        }
        sc.close();
    }
}