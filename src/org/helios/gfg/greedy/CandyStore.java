package org.helios.gfg.greedy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CandyStore {
  private static final String TEST_DATA_PATH = "./src/org/self/gfg/greedy/candyStoreTsestData";

  public static void main(String[] args) throws FileNotFoundException {
    FileInputStream inputStream = new FileInputStream(TEST_DATA_PATH);
    Scanner s = new Scanner(inputStream);

    int testCases = s.nextInt();
    while (testCases-- > 0) {}
  }
}
