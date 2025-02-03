package Basics;
import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adjList;

    // Constructor
    public Graph() {
        adjList = new HashMap<>();
    }

    // 1. Add a vertex (node)
    public void addVertex(int vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // 2. Add an edge (undirected)
    public void addEdge(int src, int dest) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.putIfAbsent(dest, new ArrayList<>());
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);  // Remove this for a directed graph
    }

    // 3. Display the graph
    public void displayGraph() {
        for (var entry : adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        System.out.println("Graph Representation:");
        graph.displayGraph();
    }
}