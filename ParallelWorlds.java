import java.util.Scanner;

public class ParallelWorlds{

    public static int countSetBits(int num){
        int count = 0;
        while(num > 0){
            count = count + (num & 1);
            num >>= 1;
        }
        return count;
    }

    public static int OddNumber(int n){
        return 2 * n - 1;
    }

    public static int EvenNumber(int n){
        return 2 * n;
    }

    public static int nthNumberwithSetBits(int n , int setbits){
        int count = 0;
        int num = 1;
        while(true){
            if (countSetBits(num) == setbits){
                count++;
                if(count == n){
                    return num;
                }
            }
            num++;
        }
    }

    public static int calculateDiff(int n){

        int ourOdd = OddNumber(n);
        int ourEven = EvenNumber(n);
        int ourSum = ourOdd + ourEven;


        int parallelOdd = nthNumberwithSetBits(n, 3);
        int parallelEven = nthNumberwithSetBits(n, 2);
        int parallelSum = parallelEven + parallelOdd;

        return Math.abs(ourSum - parallelSum);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = calculateDiff(n);
        System.out.println(result);
        sc.close();
    }

}   