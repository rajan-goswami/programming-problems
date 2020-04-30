package org.helios.cp.open.lrucache;

import java.util.HashMap;

/**
 * The LRU cache is a hash table of keys and double linked nodes. The hash table makes the time of
 * get() to be O(1). The list of double linked nodes make the nodes adding/removal operations O(1).
 *
 * @param <K>
 * @param <V>
 */
public class LRUCache<K, V> {
  private Node head;
  private Node tail;

  private HashMap<K, Node> map;
  private int maxNodes = 0;

  public LRUCache(int maxNodes) {
    this.maxNodes = maxNodes;
    this.map = new HashMap<>();
  }

  public V get(K key) {
    if (!map.containsKey(key)) {
      return null;
    }

    Node node = map.get(key);

    // When client access an element from cache, move this element at the end of the doubly list to
    // make its eviction dead last
    removeNode(node);
    moveToTail(node);

    return (V) node.value;
  }

  public void put(K key, V value) {
    if (map.containsKey(key)) {
      Node node = map.get(key);
      node.value = value;

      // New reference by client
      // So this element at the end of the doubly list
      removeNode(node);
      moveToTail(node);
    } else {
      if (map.size() >= maxNodes) {
        // LRU cap limit reached
        // Delete a LRU node. i.e. head
        map.remove(head.key);
        removeNode(head);
      }

      // Add to tail
      Node node = new Node(key, value);
      moveToTail(node);
      map.put(key, node);
    }
  }

  private void removeNode(Node node) {
    if (node.prev != null) {
      node.prev.next = node.next;
    } else {
      head = node.next;
    }

    if (node.next != null) {
      node.next.prev = node.prev;
    } else {
      tail = node.prev;
    }
  }

  private void moveToTail(Node node) {
    if (tail != null) {
      tail.next = node;
    }

    node.prev = tail;
    node.next = null;
    tail = node;

    if (head == null) {
      head = tail;
    }
  }
}
