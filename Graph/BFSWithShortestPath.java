import java.util.*;

public class BFSWithShortestPath {
    private int V; // Number of vertices
    private ArrayList<ArrayList<Integer>> adj; // Adjacency list representation

    // Constructor
    BFSWithShortestPath(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; ++i) {
            adj.add(new ArrayList<>());
        }
    }

    // Add an edge to the graph
    void addEdge(int v, int w) {
        adj.get(v).add(w);
        adj.get(w).add(v);
    }

    // Find the shortest path from a given source vertex to a destination vertex
    // using BFS
    List<Integer> shortestPath(int source, int destination) {
        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        LinkedList<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (Integer neighbor : adj.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    parent[neighbor] = current;
                    queue.add(neighbor);

                    if (neighbor == destination) {
                        return reconstructPath(parent, source, destination);
                    }
                }
            }
        }

        // If no path exists, return an empty list
        return Collections.emptyList();
    }

    // Reconstruct the shortest path from the parent array
    private List<Integer> reconstructPath(int[] parent, int source, int destination) {
        List<Integer> path = new ArrayList<>();
        int current = destination;

        while (current != source) {
            path.add(current);
            current = parent[current];
        }

        path.add(source);
        Collections.reverse(path);
        return path;
    }

    public static void main(String[] args) {
        BFSWithShortestPath graph = new BFSWithShortestPath(7);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);

        int source = 0;
        int destination = 5;

        System.out.println("Shortest Path from vertex " + source + " to " + destination + ":");
        List<Integer> shortestPath = graph.shortestPath(source, destination);

        if (!shortestPath.isEmpty()) {
            for (int vertex : shortestPath) {
                System.out.print(vertex + " ");
            }
        } else {
            System.out.println("No path exists.");
        }
    }
}