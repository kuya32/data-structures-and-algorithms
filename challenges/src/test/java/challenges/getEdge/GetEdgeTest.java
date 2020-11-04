package challenges.getEdge;

import challenges.graph.Graph;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void isItWorthTrueTest() throws Exception {
        Graph graph = new Graph();
        graph.addNode("Seattle");
        graph.addNode("LA");
        graph.addNode("Manila");
        graph.addNode("Dallas");
        graph.addNode("Maui");
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(1), 141);
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(4), 408);
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(3), 197);
        graph.addEdge(graph.getVertices().get(1), graph.getVertices().get(2), 715);
        graph.addEdge(graph.getVertices().get(1), graph.getVertices().get(3), 75);
        graph.addEdge(graph.getVertices().get(3), graph.getVertices().get(4), 905);

        GetEdge edge = new GetEdge();

        String[] trueInput = new String[]{"Seattle", "LA"};
        System.out.println(edge.isItWorth(graph, trueInput).isFeasible());
        assertTrue(edge.isItWorth(graph, trueInput).isFeasible());
        System.out.println(edge.isItWorth(graph, trueInput).getCost());
        assertEquals(141, edge.isItWorth(graph, trueInput).getCost());
    }

    @Test
    public void isItWorthFalseTest() throws Exception {
        Graph graph = new Graph();
        graph.addNode("Seattle");
        graph.addNode("LA");
        graph.addNode("Manila");
        graph.addNode("Dallas");
        graph.addNode("Maui");
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(1), 141);
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(4), 408);
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(3), 197);
        graph.addEdge(graph.getVertices().get(1), graph.getVertices().get(2), 715);
        graph.addEdge(graph.getVertices().get(1), graph.getVertices().get(3), 75);
        graph.addEdge(graph.getVertices().get(3), graph.getVertices().get(4), 905);

        GetEdge edge = new GetEdge();

        String[] falseInput = new String[]{"Maui", "Manila"};
        System.out.println(edge.isItWorth(graph, falseInput).isFeasible());
        assertFalse(edge.isItWorth(graph, falseInput).isFeasible());
        System.out.println(edge.isItWorth(graph, falseInput).getCost());
        assertEquals(0, edge.isItWorth(graph, falseInput).getCost());
    }

    @Test
    public void isItWorthLargerArrayTest() throws Exception {
        Graph graph = new Graph();
        graph.addNode("Seattle");
        graph.addNode("LA");
        graph.addNode("Manila");
        graph.addNode("Dallas");
        graph.addNode("Maui");
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(1), 141);
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(4), 408);
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(3), 197);
        graph.addEdge(graph.getVertices().get(1), graph.getVertices().get(2), 715);
        graph.addEdge(graph.getVertices().get(1), graph.getVertices().get(3), 75);
        graph.addEdge(graph.getVertices().get(3), graph.getVertices().get(4), 905);

        GetEdge edge = new GetEdge();

        String[] falseInput2 = new String[]{"Seattle", "Dallas", "Manila"};
        System.out.println(edge.isItWorth(graph, falseInput2).isFeasible());
        assertFalse(edge.isItWorth(graph, falseInput2).isFeasible());
        System.out.println(edge.isItWorth(graph, falseInput2).getCost());
        assertEquals(0, edge.isItWorth(graph, falseInput2).getCost());
    }

    // Resource link for testing exceptions: https://stackoverflow.com/questions/15216438/junit-testing-exceptions
    @Test(expected = Exception.class)
    public void isItWorthExceptionTest() throws Exception {
        Graph graph = new Graph();
        graph.addNode("Seattle");
        graph.addNode("LA");
        graph.addNode("Manila");
        graph.addNode("Dallas");
        graph.addNode("Maui");
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(1), 141);
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(4), 408);
        graph.addEdge(graph.getVertices().get(0), graph.getVertices().get(3), 197);
        graph.addEdge(graph.getVertices().get(1), graph.getVertices().get(2), 715);
        graph.addEdge(graph.getVertices().get(1), graph.getVertices().get(3), 75);
        graph.addEdge(graph.getVertices().get(3), graph.getVertices().get(4), 905);

        GetEdge edge = new GetEdge();

        String[] exceptionInput = new String[]{"Seattle"};
        edge.isItWorth(graph, exceptionInput);
    }
}
