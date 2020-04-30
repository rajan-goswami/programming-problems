package org.helios.gfg.mirrortree;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
  public static void main(String[] args) {
    String inputString = "engineeringin";
    int n = 2;

    String mostFrequentNGram = mostFrequentNGram(inputString, n);

    System.out.println(mostFrequentNGram);
  }

  private static String mostFrequentNGram(String inputString, int length) {

    if (inputString == null || inputString.length() == 0) {
      return "";
    }

    if (length > inputString.length()) {
      return "";
    }

    Map<String, Integer> frequencyMap = new HashMap<>();

    int inputLength = inputString.length();

    // Iterate through string and get n-Grams
    // Store then in frequencyMap
    for (int i = 0; i < (inputLength - (length - 1)); i++) {
      String nGram = inputString.substring(i, i + length);
      if (frequencyMap.containsKey(nGram)) {
        int count = frequencyMap.get(nGram);
        frequencyMap.put(nGram, count + 1);
      } else {
        //
        frequencyMap.put(nGram, 1);
      }
    }

    // Find nGram with max frequency
    // String nGramWithMaxFrequency = null;

    String nGramMaxFreqLastOrder = null;
    int maxFrequency = 0;
    for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
      if (entry.getValue().intValue() > maxFrequency) {
        maxFrequency = entry.getValue().intValue();
        nGramMaxFreqLastOrder = entry.getKey();
      } else if (entry.getValue().intValue() == maxFrequency) {
        if (entry.getKey().compareTo(nGramMaxFreqLastOrder) > 1) {
          nGramMaxFreqLastOrder = entry.getKey();
        }
      }
    }

    return nGramMaxFreqLastOrder;
  }
}
