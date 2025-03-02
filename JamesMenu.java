import java.util.*;

public class JamesMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] lis = new int[n][m];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                lis[i][j] = scanner.nextInt();
            }
        }
        
        int[] mx = new int[m];
        int[] su = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mx[j] = Math.max(mx[j], lis[i][j]);
                su[i] += lis[i][j];
            }
        }
        
        int[] cn = new int[n];
        int goodNumber = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mx[j] == lis[i][j]) {
                    cn[i]++;
                }
            }
            goodNumber = Math.max(goodNumber, cn[i]);
        }
        
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < cn.length; i++) {
            if (goodNumber == cn[i]) {
                index.add(i);
            }
        }
        
        int ansSum = 0;
        int ansIndex = 0;
        
        if (index.size() > 1) {
            for (int i : index) {
                int temp = su[i] / 4;
                if (temp > ansSum) {
                    ansSum = temp;
                    ansIndex = i;
                }
            }
            System.out.println(ansIndex + 1);
        } else {
            System.out.println(index.get(0) + 1);
        }
        
        scanner.close();
    }
}
