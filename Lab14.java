import java.util.Scanner;

public class Lab14 {
    public boolean canTransform(String start, String end) {

        if (!start.replace("X", "").equals(end.replace("X", ""))) {
            return false;
        }

  
        int i = 0, j = 0;
        int n = start.length();

        while (i < n && j < n) {
          
            while (i < n && start.charAt(i) == 'X') i++;
            while (j < n && end.charAt(j) == 'X') j++;

            if (i == n && j == n) {
                return true;
            }

            if (i == n || j == n) {
                return false;
            }

            if (start.charAt(i) != end.charAt(j)) {
                return false;
            }

            if (start.charAt(i) == 'L' && i < j) {
                return false; 
            }
            if (start.charAt(i) == 'R' && i > j) {
                return false; 
            }

    
            i++;
            j++;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        
        String start = scanner.nextLine();  // First string (start)
        String end = scanner.nextLine();    // Second string (end)

        Lab14 obj = new Lab14();
        boolean result = obj.canTransform(start, end);
        
 
        System.out.println(result);
        scanner.close();
    }
}
