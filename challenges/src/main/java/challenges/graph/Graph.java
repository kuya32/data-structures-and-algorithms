package challenges.graph;

import java.util.*;


public class Graph {
    ArrayList<GraphNode> vertices;

    public Graph() {
        this.vertices = new ArrayList<>();
    }

    public GraphNode addNode(String value) {
        GraphNode<String> newNode = new GraphNode<>(value);
        vertices.add(newNode);
        return newNode;
    }

    public String addEdge(GraphNode node1, GraphNode node2, int weight) {
        Edge edge1 = new Edge(node1, node2, weight);
        node1.getEdges().add(edge1);

        Edge edge2 = new Edge(node2, node1, weight);
        node2.getEdges().add(edge2);

        return node1.getValue() + " is " + weight + " miles from " + node2.getValue() + ", vice versa.";
    }

    public ArrayList<GraphNode> getNodes() {
        if(vertices.isEmpty()) {
            return null;
        }
        return vertices;
    }

    public LinkedHashMap getNeighbors(GraphNode base) {
        LinkedHashMap neighbors = new LinkedHashMap<>();
        ArrayList<Edge> neighborhood = base.getEdges();
        System.out.println(neighborhood.get(0).getDestination().getValue() + "   HELOOOOLOLOL");

        for (Edge howdyNeighbor : neighborhood) {
            neighbors.put(howdyNeighbor.getDestination().getValue(), howdyNeighbor.getWeight());
        }
        return neighbors;
    }


    public ArrayList<String> breadthFirstGraphTraversal(GraphNode node) {
        HashSet<GraphNode> vertices2 = new HashSet<>();
        Queue<GraphNode> que = new LinkedList<>();
        ArrayList<String> verticesValue = new ArrayList<>();
        verticesValue.add(node.getValue().toString());
        vertices2.add(node);
        que.add(node);
        while (!que.isEmpty()) {
            GraphNode current = que.peek();
            que.remove();
            ArrayList<Edge> neighbors = current.getEdges();
            for (Edge neighbor : neighbors) {
                if (vertices2.add(neighbor.getDestination())) {
                    verticesValue.add(neighbor.getDestination().getValue().toString());
                    que.add(neighbor.getDestination());
                }
            }
        }
        return verticesValue;
    }

    // Link is where I got the stack idea from: https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/#:~:text=%20Solution%3A%20%201%20Approach%3A%20Depth-first%20search%20is,node%20as%20visited%20and%20print%20the...%20More%20
    public ArrayList<String> depthFirstGraphTraversal(Graph graph) {
        Stack<GraphNode> stack = new Stack<>();
        ArrayList<String> visitedNodes = new ArrayList<>();
        if (graph == null) {
            return visitedNodes;
        }
        GraphNode root = graph.getNodes().get(0);
        stack.add(root);
        while (!stack.isEmpty()) {
            GraphNode top = stack.peek();
            stack.pop();
            visitedNodes.add(top.getValue().toString());
            ArrayList<Edge> buddies = top.getEdges();
            for (int i = buddies.size() - 1; i >= 0; i--) {
                String string = buddies.get(i).getDestination().getValue().toString();
                if (buddies.get(i).getDestination().getEdges() != null
                        && !visitedNodes.contains(string)
                        && !stack.contains(buddies.get(i).getDestination())) {
                    stack.add(buddies.get(i).getDestination());
                }
            }
        }
        return visitedNodes;
    }

    public int size() {
        return this.vertices.size();
    }

    public ArrayList<GraphNode> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<GraphNode> vertices) {
        this.vertices = vertices;
    }


}
