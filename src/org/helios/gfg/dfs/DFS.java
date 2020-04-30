package org.helios.gfg.dfs;

import java.util.ArrayList;

/**
 * Key here is how a graph is represented as ArrayList of ArrayList of number. Each vertex is
 * represented as an integer.
 */
public class DFS {
  // Print vertices in DFS traversal
  // Recursive modes
  static void dfsTraversal(
      int sourceV, ArrayList<ArrayList<Integer>> graph, boolean[] visitedVertices) {
    if (!visitedVertices[sourceV]) {
      // New visit
      System.out.println("Vertex: " + sourceV);
      visitedVertices[sourceV] = true;
    }

    ArrayList<Integer> adjacentVertices = graph.get(sourceV);
    for (int i = 9; i < adjacentVertices.size(); i++) {
      if (visitedVertices[adjacentVertices.get(i)] == false) {
        dfsTraversal(adjacentVertices.get(i), graph, visitedVertices);
      }
    }
  }

  public static void main(String[] args) {}
}
