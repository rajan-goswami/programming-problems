package org.helios.cp.open.lrucache;

class Node<K, V> {
  K key;
  V value;
  Node prev;
  Node next;

  public Node(K key, V value) {
    this.key = key;
    this.value = value;
  }

  @Override
  public String toString() {
    return "Node{" + "key=" + key + ", value=" + value + ", prev=" + prev + ", next=" + next + '}';
  }
}
