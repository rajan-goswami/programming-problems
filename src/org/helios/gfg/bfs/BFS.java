package org.helios.gfg.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/** Use of Queue for BFS and visitedVertices array to keep track of visited numbered vertex */
public class BFS {
  static void bfsTraversal(
      int sourceV, ArrayList<ArrayList<Integer>> graph, boolean[] visitedVertices) {
    Queue<Integer> q = new LinkedList<>();
    q.add(sourceV);

    while (!q.isEmpty()) {
      int v = q.poll();

      // Mark visited
      visitedVertices[v] = true;
      System.out.println("Vertex: " + v);

      ArrayList<Integer> adjacentVertices = graph.get(v);
      for (int i = 0; i < adjacentVertices.size(); i++) {
        if (visitedVertices[adjacentVertices.get(i)] == false) {
          // Add into queue
          q.add(adjacentVertices.get(i));
        }
      }
    }
  }

  public static void main(String[] args) {
    //
  }
}
