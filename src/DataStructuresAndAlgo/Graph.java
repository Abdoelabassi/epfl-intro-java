package DataStructuresAndAlgo;
/**
 * Graph data structure
 * @author EL Abassi Abderrazaq
 */
public class Graph {
    int[][] adjacencyMatrix;
    public Graph(int nodes) {
        this.adjacencyMatrix = new int[nodes][nodes];
    }

    /**
     * addEdge: adds the edges  of the graph
     * @param source: source vertex
     * @param destination: destination vertex
     */
    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        adjacencyMatrix[destination][source] = 1;
    }
    public static void main(String[] args) {
        Graph graph = new Graph(3);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
    }
}