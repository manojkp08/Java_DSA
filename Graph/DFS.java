
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFS {
    private int V; // Number of vertices
    private List<List<Integer>> adj; // Adjacency list representation

    // Constructor
    DFS(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; ++i) {
            adj.add(new ArrayList<>());
        }
    }

    // Add an edge to the graph
    void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    // Perform DFS from a given source vertex
    void DFSsource(int source) {
        boolean[] visited = new boolean[V]; // Mark all vertices as not visited
        Stack<Integer> stack = new Stack<>(); // Create a stack for DFS

        visited[source] = true; // Mark the source vertex as visited
        stack.push(source); // Push the source vertex onto the stack

        while (!stack.isEmpty()) {
            source = stack.pop(); // Pop a vertex from the stack and print it
            System.out.print(source + " ");

            // Get all adjacent vertices of the popped vertex
            // If an adjacent vertex is not visited, mark it visited and push it onto the
            // stack
            for (Integer neighbor : adj.get(source)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }

    // Perform DFS traversal starting from all unvisited vertices
    void DFSnosource() {
        boolean[] visited = new boolean[V]; // Mark all vertices as not visited

        for (int i = 0; i < V; ++i) {
            if (!visited[i]) {
                DFSsource(i); // Call DFS from the unvisited vertex
            }
        }
    }

    public static void main(String[] args) {
        DFS graph = new DFS(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);

        System.out.println("DFS traversal starting from vertex 0:");
        graph.DFSsource(0);

        System.out.println("\nDFS traversal starting from all unvisited vertices:");
        graph.DFSnosource();
    }

}
