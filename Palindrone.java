import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        int r,temp;
        int sum=0;
        int n= num.nextInt();
        temp=n;
        while (n>0) 
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum)
         {
            System.out.println("true");
        }
        else{
            System.err.println("false");    
        }
        num.close();
    }
}
