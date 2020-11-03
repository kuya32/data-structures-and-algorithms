package challenges.graph;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addGraphNodeTest() throws Exception {
        Graph graph = new Graph();
        graph.addNode("Mount Vernon");

        assertEquals(1, graph.size());
    }

    @Test
    public void addEdgeTest() throws Exception {
        Graph graph = new Graph();
        graph.addNode("Mount Vernon");
        graph.addNode("Seattle");

        String output = "Mount Vernon is 60 miles from Seattle, vice versa.";
        System.out.println(graph.addEdge(graph.vertices.get(0), graph.vertices.get(1), 60));
        assertEquals(output, graph.addEdge(graph.vertices.get(0), graph.vertices.get(1), 60));
    }

    @Test
    public void retrieveCollectionTest() throws Exception {
        Graph graph = new Graph();
        graph.addNode("Mount Vernon");
        graph.addNode("Seattle");
        graph.addNode("Planet Popstar");
        graph.addNode("Mushroom Kingdom");

        assertEquals("Mount Vernon", graph.vertices.get(0).getValue());
        assertEquals("Seattle", graph.vertices.get(1).getValue());
        assertEquals("Planet Popstar", graph.vertices.get(2).getValue());
        assertEquals("Mushroom Kingdom", graph.vertices.get(3).getValue());
    }

    @Test
    public void retrieveNeighborsAndWeightTest() throws Exception {
        Graph graph = new Graph();
        graph.addNode("Mount Vernon");
        graph.addNode("Seattle");
        graph.addNode("Olympus");
        graph.addEdge(graph.vertices.get(0), graph.vertices.get(1), 60);
        graph.addEdge(graph.vertices.get(0), graph.vertices.get(2), 1000000);

        System.out.println(graph.getNeighbors(graph.vertices.get(0)).containsKey("Mount Vernon"));

        assertTrue(graph.getNeighbors(graph.vertices.get(0)).containsValue(60));
        assertTrue(graph.getNeighbors(graph.vertices.get(0)).containsValue(1000000));
    }

    @Test
    public void breadthFirstTraversalTest() throws Exception {
        Graph graph = new Graph();
        graph.addNode("Mount Vernon");
        graph.addNode("Seattle");
        graph.addNode("Olympus");
        graph.addNode("PNF-404: Distant Planet");
        graph.addNode("Everett");
        graph.addNode("Bellevue");
        graph.addEdge(graph.vertices.get(0), graph.vertices.get(1), 60);
        graph.addEdge(graph.vertices.get(0), graph.vertices.get(2), 10000);
        graph.addEdge(graph.vertices.get(1), graph.vertices.get(3), 18782);
        graph.addEdge(graph.vertices.get(1), graph.vertices.get(4), 123787);
        graph.addEdge(graph.vertices.get(2), graph.vertices.get(5), 1);
        graph.addEdge(graph.vertices.get(5), graph.vertices.get(3), 20);
        graph.addEdge(graph.vertices.get(4), graph.vertices.get(1), 10);
        String output = "[Mount Vernon, Seattle, Olympus, PNF-404: Distant Planet, Everett, Bellevue]";

        System.out.println(graph.breadthFirstGraphTraversal(graph.vertices.get(0)).toString());
        assertEquals(output, graph.breadthFirstGraphTraversal(graph.vertices.get(0)).toString());
    }


    @Test
    public void sizeCheckTest() throws Exception {
        Graph graph = new Graph();
        graph.addNode("Mount Vernon");
        graph.addNode("Seattle");
        graph.addNode("Olympus");
        graph.addNode("PNF-404: Distant Planet");

        assertEquals(4, graph.size());
    }

    @Test
    public void oneGraphTest() throws Exception {
        Graph graph = new Graph();
        graph.addNode("Mount Vernon");
        graph.addEdge(graph.vertices.get(0), graph.vertices.get(0), 0);

        assertNotNull(graph.getNeighbors(graph.vertices.get(0)));
    }

    @Test
    public void EmptyGraphTest() throws Exception {
        Graph graph = new Graph();
        assertNull(graph.getNodes());
    }

}
