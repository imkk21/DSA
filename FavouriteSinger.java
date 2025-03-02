import java.util.Arrays;
import java.util.Scanner;

class FavouriteSinger {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);
        int MC = 1;         //maxCount
        int CC = 1;         //currCount
        for (int i = 1; i < N; i++){
            if(arr[i] == arr[i-1]){
                CC++;
            }
            else{
                MC = Math.max(MC,CC);
                CC=1;
            }
        }
        MC = Math.max(MC,CC);

        int favSinger = 0;
        CC = 1;

        for(int i = 1; i < N; i++){
            if(arr[i] == arr [i-1] ){
                CC++;
            }
            else{
                if(CC == MC){
                    favSinger++;
                }
                CC=1;
            }
        }
        if(CC == MC){
            favSinger++;
        }
        System.out.println(favSinger);
    }
}
