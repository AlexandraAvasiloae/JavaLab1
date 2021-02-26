import java.util.*;

public class Graph {

    private int n;
    private int[][] matrix;
    private int[][] partialTreeMatrix;

    /**
     * Generate the random graph by filling the adjacency matrix with random values of 0 or 1
     */
    public void generateMatrix() {
        int i, j;
        this.matrix = new int[n][n];
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 10) % 2;
                matrix[j][i] = matrix[i][j];
            }
        }
    }

    /**
     * Display on the screen the generated matrix
     */
    private void displayMatrix() {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    /**
     * Display the adjacency matrix of the partial tree
     */
    private void displayPartialTreeMatrix() {
        for (int[] row : partialTreeMatrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    /**
     * Verify if the generated graph is connected
     *
     * @return 1, if the graph is connected and 0, otherwise
     */
    public int verifyGraphConnected() {

        int[] visited = new int[n];
        int verticesNumber = DFS(visited, 0);
        if (verticesNumber == n) {
            return 1;
        } else
            return 0;
    }

    /**
     * creates the adjacency matrix of the partial tree of the graph
     *
     * @param visited counts each vertex is visit in DFS
     * @param vertex  the current vertex in the traversal
     */
    public void partialTree(int[] visited, int vertex) {
        //this.partialTreeMatrix = new int[n][n];
        visited[vertex] = 1;
        for (int i = 0; i < n; i++) {
            if (matrix[vertex][i] == 1 && visited[i] == 0) {
                partialTreeMatrix[vertex][i] = 1;
                partialTreeMatrix[i][vertex] = 1;
                partialTree(visited, i);
            }
        }
    }

    /**
     * Depth First Search (DFS) Algorithm
     *
     * @param visited counts each vertex is visit in DFS
     * @param vertex  the current vertex in the traversal
     * @return the number of nodes that are part of the dfs traversal starting from node vertex
     */
    public int DFS(int[] visited, int vertex) {

        visited[vertex] = 1;
        for (int i = 0; i < n; i++) {
            if (matrix[vertex][i] == 1 && visited[i] == 0) {
                return DFS(visited, i) + 1;
            }
        }
        return 1;
    }

    /**
     * Calculate the number of connected components
     *
     * @return number of connected components
     */
    public int numberConnectedComponents() {
        int size = n;
        int componentsNumber = 0;
        int[] visited = new int[size];
        for (int i = 0; i < size; i++) {
            if (visited[i] == 0) {
                componentsNumber++;
                DFS(visited, i);
            }
        }
        return componentsNumber;
    }

    /**
     * @param dimension graph size
     */
    Graph(int dimension) {

        this.n = dimension;
        generateMatrix();
        this.partialTreeMatrix = new int[n][n];
    }

    public static void main(String args[]) {

        long startPoint = System.nanoTime();

        /**
         * argument validation
         */
        if (args.length < 1) {
            System.err.println(-1);
            System.out.println("Specify the argument!");
        } else {
            /**
             * convert the argument to int
             */
            int n = Integer.parseInt(args[0]);

            Graph g = new Graph(n);

            if (g.verifyGraphConnected() == 1) {
                System.out.println("The graph is connected");
                int[] visited = new int[n];
                for (int i = 0; i < n; i++) {
                    visited[i] = 0;
                }
                g.partialTree(visited, 0);

            } else {
                System.out.println("The graph is not connected\b");
                System.out.println("The graph has " + g.numberConnectedComponents() + " connected components");
                //System.out.println(g.numberConnectedComponents());
                //System.out.println("connected components");

            }
            if (n < 30000) {
                System.out.println("The adjacency matrix of the graph is: ");
                g.displayMatrix();
                if (g.verifyGraphConnected() == 1) {
                    System.out.println("The adjacency matrix of the partial tree is: ");
                    g.displayPartialTreeMatrix();
                }
            } else {
                long endPoint = System.nanoTime();
                long runtime = endPoint - startPoint;
                System.out.println(runtime);
            }
        }
    }
}