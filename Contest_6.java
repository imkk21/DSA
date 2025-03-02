import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Contest_6 {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for (int i = 0; i < n; i++) {
            color[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!bfs(graph, color, i)) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean bfs(int[][] graph, int[] color, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        color[start] = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();    
            for (int neighbor : graph[node]) {
                if (color[neighbor] == -1) {
                    color[neighbor] = 1 - color[node];
                    queue.offer(neighbor);
                } else if (color[neighbor] == color[node]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Contest_6 bg = new Contest_6();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] graph = new int[n][];
        scanner.nextLine(); 
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine().trim();
            String[] parts = line.split(" ");
            LinkedList<Integer> neighbors = new LinkedList<>();
            for (String part : parts) {
                neighbors.add(Integer.parseInt(part));
            }
            graph[i] = new int[neighbors.size()];
            for (int j = 0; j < neighbors.size(); j++) {
                graph[i][j] = neighbors.get(j);
            }
        }
        boolean result = bg.isBipartite(graph);
        System.out.println(result);
        
        scanner.close();
    }
}
