package org.helios.cp.open.lrucache;

public class LRUCacheMain {
  public static void main(String[] args) {
    System.out.println("Hello LRUCache");

    LRUCache<Integer, String> cache = new LRUCache<>(100);
    cache.put(1, "Hello");
    cache.put(2, "Hi");
    cache.put(3, "Hey");
    cache.put(4, "Howdy");

    System.out.println(cache.get(2));
  }
}
