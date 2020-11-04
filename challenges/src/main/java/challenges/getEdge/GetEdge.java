package challenges.getEdge;

import challenges.graph.Edge;
import challenges.graph.Graph;
import challenges.graph.GraphNode;

import java.util.ArrayList;

public class GetEdge {
    public TripDetails isItWorth(Graph flights, String[] cities) throws Exception{
        GraphNode start = null;
        int cost = 0;
        if (cities.length < 2) {
            throw new Exception("Need at least two cities");
        } else if (cities.length > 2) {
            return new TripDetails(false, 0);
        }
        for (GraphNode city : flights.getNodes()) {
            if (city.getValue().equals(cities[0])) {
                start = city;
            }
        }
        if (start == null) {
            return new TripDetails(false, 0);
        }
        for (String city : cities) {
            ArrayList<Edge> directFlight = start.getEdges();
            for (Edge flight : directFlight) {
                if (flight.getDestination().getValue().equals(city)) {
                    cost = (int) flight.getWeight();
                } else {
                    return new TripDetails(false, 0);
                }
            }
        }
        return new TripDetails(true, cost);
    }
}
