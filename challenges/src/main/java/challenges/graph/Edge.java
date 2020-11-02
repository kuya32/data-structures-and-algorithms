package challenges.graph;

public class Edge<T> {
    private GraphNode origin;
    private GraphNode destination;
    private T weight;

    public Edge(GraphNode origin, GraphNode destination, T weight) {
        this.origin = origin;
        this.destination = destination;
        this.weight = weight;
    }

    public GraphNode getOrigin() {
        return origin;
    }

    public void setOrigin(GraphNode origin) {
        this.origin = origin;
    }

    public GraphNode getDestination() {
        return destination;
    }

    public void setDestination(GraphNode destination) {
        this.destination = destination;
    }

    public T getWeight() {
        return weight;
    }

    public void setWeight(T weight) {
        this.weight = weight;
    }
}
