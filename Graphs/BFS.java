import java.util.*;

public class BFS {
    private int V; // Number of vertices
    private ArrayList<ArrayList<Integer>> adj; // Adjacency list representation

    // Constructor
    BFS(int v) {
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

    // Perform BFS from a given source vertex
    void BFSsource(int source) {
        boolean[] visited = new boolean[V]; // Mark all vertices as not visited
        LinkedList<Integer> queue = new LinkedList<>(); // Create a queue for BFS

        visited[source] = true; // Mark the source vertex as visited
        queue.add(source); // Enqueue the source vertex

        while (!queue.isEmpty()) {
            source = queue.poll(); // Dequeue a vertex from the queue and print it
            System.out.print(source + " ");

            // Get all adjacent vertices of the dequeued vertex
            // If an adjacent vertex is not visited, mark it visited and enqueue it
            for (Integer neighbor : adj.get(source)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    // Perform BFS traversal starting from all unvisited vertices
    void BFSnosource() {
        boolean[] visited = new boolean[V]; // Mark all vertices as not visited

        for (int i = 0; i < V; ++i) {
            if (!visited[i]) {
                BFSsource(i); // Call BFS from the unvisited vertex
            }
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);

        System.out.println("BFS traversal starting from vertex 0:");
        graph.BFSsource(0);

        System.out.println("\nBFS traversal starting from all unvisited vertices:");
        graph.BFSnosource();
    }
}
