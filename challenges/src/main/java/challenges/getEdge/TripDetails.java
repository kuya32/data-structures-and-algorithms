package challenges.getEdge;

public class TripDetails {
    private boolean feasible;
    private int cost;

    public TripDetails(boolean feasible, int cost) {
        this.feasible = feasible;
        this.cost = cost;
    }

    public boolean isFeasible() {
        return feasible;
    }

    public void setFeasible(boolean feasible) {
        this.feasible = feasible;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
