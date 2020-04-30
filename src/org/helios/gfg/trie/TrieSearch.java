package org.helios.gfg.trie;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class TrieSearch {

  private static final String TEST_DATA_PATH = "./src/org/self/gfg/trie/testData";

  static class Node {
    Node[] leafs = new Node[26];
    boolean isEndLeaf = false;
  }

  static class Trie {
    Node root = new Node();

    void insert(String key) {
      int n = key.length();
      Node traverse = root;

      for (int i = 0; i < n; i++) {
        int charCode = key.charAt(i) - 'a';
        if (traverse.leafs[charCode] == null) {
          traverse.leafs[charCode] = new Node();
        }
        traverse = traverse.leafs[charCode];
      }
      traverse.isEndLeaf = true;
    }

    boolean search(String key) {
      int n = key.length();
      Node traverse = root;
      for (int i = 0; i < n; i++) {
        int charCode = key.charAt(i) - 'a';
        if (traverse.leafs[charCode] == null) {
          return false;
        }
        traverse = traverse.leafs[charCode];
      }
      return traverse.isEndLeaf;
    }
  }

  public static void main(String[] args) throws IOException {

    FileInputStream inputStream = new FileInputStream(TEST_DATA_PATH);
    Scanner s = new Scanner(inputStream);

    int testCases = s.nextInt();
    while (testCases-- > 0) {
      int n = s.nextInt();
      Trie trie = new Trie();
      for (int i = 0; i < n; i++) {
        trie.insert(s.next());
      }
      System.out.println(trie.search(s.next()) ? "1" : "0");
    }

    inputStream.close();
  }
}
