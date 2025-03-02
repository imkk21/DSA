import java.util.*;
class ArrayDup {
    public List<Integer> findDuplicates(int[] arr, int n) {
        Arrays.sort(arr);
        List<Integer> solution = new ArrayList<>();
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                solution.add(arr[i]);
                while (i < n - 1 && arr[i + 1] == arr[i]) 
                    i++;
            }
        }
        
        if (solution.isEmpty()) 
            solution.add(-1);
        
        return solution;
    }
}