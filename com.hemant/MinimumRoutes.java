
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node> {
    int id;
    int distance;

    public Node(int id, int distance) {
        this.id = id;
        this.distance = distance;
    }

    public int compareTo(Node other) {
        return Integer.compare(this.distance, other.distance);
    }
}

public class MinimumRoutes {
    private static final int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of pickup points and flight connections
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Create adjacency list to represent the graph
        List<List<Node>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Read the flight connections
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            graph.get(a).add(new Node(b, c));
        }

        // Calculate the shortest routes
        int[] shortestRoutes = calculateShortestRoutes(graph, n);

        // Print the shortest routes
        for (int i = 1; i <= n; i++) {
            System.out.print(shortestRoutes[i] + " ");
        }
        scanner.close();
    }

    private static int[] calculateShortestRoutes(List<List<Node>> graph, int n) {
        int[] dist = new int[n + 1];
        Arrays.fill(dist, INF);
        dist[1] = 0;

        PriorityQueue<Node> minHeap = new PriorityQueue<>();
        minHeap.offer(new Node(1, 0));

        while (!minHeap.isEmpty()) {
            Node currNode = minHeap.poll();

            if (currNode.distance > dist[currNode.id]) {
                continue;
            }

            for (Node nextNode : graph.get(currNode.id)) {
                int newDistance = dist[currNode.id] + nextNode.distance;
                if (newDistance < dist[nextNode.id]) {
                    dist[nextNode.id] = newDistance;
                    minHeap.offer(new Node(nextNode.id, newDistance));
                }
            }
        }

        return dist;
    }
}