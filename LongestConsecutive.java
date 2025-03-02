// {Longest consec streak count}
// // import java.util.Scanner;
// // import java.util.Arrays;

// // public class LongestConsecutive {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
        
// //         int n = sc.nextInt();       
// //         int[] arr = new int[n];      //{1, 200, 2, 400, 500, 3}
// //         for (int i = 0; i < n; i++){
// //             arr[i] = sc.nextInt();
// //         }   
// //                             //{1, 2, 3, 200, 400, 500}
// //         Arrays.sort(arr);

// //         int longestStreak = 1, currentStreak = 1;

// //         for (int i = 1; i < n; i++) {
// //             if (arr[i] != arr[i - 1]) { 
// //                 if (arr[i] == arr[i - 1] + 1) {
// //                     currentStreak++;
// //                 } else {
// //                     longestStreak = Math.max(longestStreak, currentStreak);
// //                     currentStreak = 1;
// //                 }
// //             }
// //         }
        
// //         longestStreak = Math.max(longestStreak, currentStreak);
// //         System.out.println(longestStreak);
// //         sc.close();
// //     }
// // }


// import java.util.Scanner;
// import java.util.Arrays;    

// public class LongestConsecutive{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // int n = sc.nextInt();
//         // int[] arr = new int[n];

//         // for(int i = 0; i < n; i++){
//         //     arr[i] = sc.nextInt();
//         // }
//         String [] s = sc.nextLine().split(" ");
//         int[] arr = new int[s.length];
//         for(int i=0; i< s.length; i++){
//             arr[i] = Integer.parseInt(s[i]);
//         }

//         Arrays.sort(arr);

//         int longestStreak = 1;
//         int currentStreak = 1;

//         for(int i = 1; i < s.length; i++){
//             if(arr[i] != arr[i-1]){
//                 if(arr[i] == arr[i-1]+1){
//                     currentStreak++;
//                 }
//                 else{
//                     longestStreak = Math.max(longestStreak, currentStreak);
//                     currentStreak = 1;
//                 }
//             }
//         }
//         longestStreak = Math.max(longestStreak, currentStreak);
//         System.err.println(longestStreak);
//         sc.close();
//     }
// }



import java.util.Scanner;
import java.util.Arrays;

public class LongestConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();       
        int[] arr = new int[n];  
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }   

        Arrays.sort(arr);

        int longestStreak = 1, currentStreak = 1;
        int start = arr[0], longestStart = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) { 
                if (arr[i] == arr[i - 1] + 1) {
                    currentStreak++;
                } else {
                    if (currentStreak > longestStreak) {
                        longestStreak = currentStreak;
                        longestStart = start;
                    }
                    currentStreak = 1;
                    start = arr[i];
                }
            }
        }
        
        if (currentStreak > longestStreak) {
            longestStreak = currentStreak;
            longestStart = start;
        }

        System.out.println(longestStreak);
        for (int i = 0; i < longestStreak; i++) {
            System.out.print((longestStart + i) + " ");
        }

        sc.close();
    }
}
