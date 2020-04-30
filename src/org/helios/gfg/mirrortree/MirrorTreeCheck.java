package org.helios.gfg.mirrortree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MirrorTreeCheck {

  private static final String TEST_DATA_PATH = "./src/org/self/gfg/mirrortree/testData";

  static class Graph {
    private int numVertices;
    private Map<Integer, List<Integer>> adjancencyList;

    Graph(int vertices) {
      this.numVertices = vertices;
      this.adjancencyList = new HashMap<>();
    }

    void addEdge(int u, int v) {
      if (!this.adjancencyList.containsKey(u)) {
        this.adjancencyList.put(u, new LinkedList<>());
      }
      this.adjancencyList.get(u).add(v);
    }

    List<Integer> getAdjacencyListOf(int u) {
      return this.adjancencyList.get(u);
    }
  }

  public static void main(String[] args) {

  }

  //  public static void main(String[] args) throws FileNotFoundException {
  //    FileInputStream inputStream = new FileInputStream(TEST_DATA_PATH);
  //    Scanner s = new Scanner(inputStream);
  //
  //    int testCases = s.nextInt();
  //    while (testCases-- > 0) {
  //      int nodeCount = s.nextInt();
  //      int edgeCount = s.nextInt();
  //
  //      // Build Graph-1 adjacency List
  //      Graph graph1 = new Graph(nodeCount);
  //
  //      for (int i = 0; i < edgeCount; i++) {
  //        int u = s.nextInt();
  //        int v = s.nextInt();
  //
  //        graph1.addEdge(u, v);
  //      }
  //
  //      // Build Graph-2 adjacency List
  //      Graph graph2 = new Graph(nodeCount);
  //
  //      for (int i = 0; i < edgeCount; i++) {
  //        int u = s.nextInt();
  //        int v = s.nextInt();
  //
  //        graph2.addEdge(u, v);
  //      }
  //
  //      // Traverse each node of the graph, and reverse its adjacency list
  //      // and do comparison
  //      for (int i = 1; i < nodeCount + 1; i++) {
  //        List<Integer> adjacencyListOfG1 = graph1.getAdjacencyListOf(i);
  //        List<Integer> adjacencyListOfG2 = graph2.getAdjacencyListOf(i);
  //
  //        if (adjacencyListOfG1 == null) {
  //          if (adjacencyListOfG2 != null) {
  //            System.out.println(0);
  //          }
  //          continue;
  //        } else {
  //          if (adjacencyListOfG2 == null) {
  //            System.out.println(0);
  //            continue;
  //          }
  //        }
  //
  //        Collections.reverse(adjacencyListOfG2);
  //        System.out.println(adjacencyListOfG1.equals(adjacencyListOfG2) ? 1 : 0);
  //      }
  //    }
  //  }
}
