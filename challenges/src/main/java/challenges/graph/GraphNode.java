package challenges.graph;

import java.util.ArrayList;

public class GraphNode<T> {
    private T value;
    private ArrayList<Edge> edges = new ArrayList<>();

    public GraphNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public void setEdges(ArrayList<Edge> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "GraphNode{" +
                "value=" + value +
                '}';
    }
}
