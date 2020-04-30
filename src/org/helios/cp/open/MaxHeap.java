package org.helios.cp.open;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

  static class Heap {
    List<Integer> keyStore = new ArrayList<>();

    void insert(int key) {
      keyStore.add(key);
      for (int i = keyStore.size() / 2 - 1; i >= 0; i--) {
        heapify(i);
      }
    }

    void delete(int key) {
      int size = keyStore.size();

      Integer found = null;
      int index = 0;
      for (index = 0; index < size; index++) {
        if (key == keyStore.get(index)) {
          found = keyStore.get(index);
          break;
        }
      }

      if (found == null) {
        return;
      }

      keyStore.set(index, keyStore.get(size - 1));
      keyStore.remove(size - 1);
      for (int i = keyStore.size() / 2 - 1; i >= 0; i--) {
        heapify(i);
      }
    }

    void print() {
      System.out.println(keyStore.toString());
    }

    private void heapify(int i) {
      int size = keyStore.size();
      int largest = i;
      int left = 2 * i + 1;
      int right = 2 * i + 2;

      if (left < size && keyStore.get(left) > keyStore.get(largest)) {
        largest = left;
      }
      if (right < size && keyStore.get(right) > keyStore.get(largest)) {
        largest = right;
      }

      if (largest != i) {
        int temp = keyStore.get(largest);
        keyStore.set(largest, keyStore.get(i));
        keyStore.set(i, temp);
        heapify(largest);
      }
    }

    int peek() {
      return keyStore.get(0);
    }
  }

  public static void main(String[] args) {
    Heap h = new Heap();

    h.insert(3);
    h.insert(4);
    h.insert(9);
    h.insert(5);
    h.insert(2);
    h.insert(6);
    h.insert(1);

    System.out.println("Max Heap:");
    h.print();
  }
}
