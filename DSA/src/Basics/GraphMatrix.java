package Basics;
import java.util.Arrays;

public class GraphMatrix {
    private int[][] adjMatrix;
    private int size;

    // Constructor
    public GraphMatrix(int size) {
        this.size = size;
        adjMatrix = new int[size][size];
    }

    // Add an edge (undirected)
    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1; // Remove for a directed graph
    }

    // Display the adjacency matrix
    public void displayMatrix() {
        for (int[] row : adjMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);

        System.out.println("Adjacency Matrix Representation:");
        graph.displayMatrix();
    }
}