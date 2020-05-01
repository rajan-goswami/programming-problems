package org.helios.epi.chapter6.problem1;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DutchFlagPartitioner {
  public static enum FlagColor {
    RED,
    WHITE,
    BLUE
  };

  /**
   * Make partition of input color bands around pivot color
   *
   * <p>Time complexity O(n), Space complexity O(1)
   *
   * @param pivotIndex Index of pivot color
   * @param colorBands color bands of flag, method will return partitioned bands in the same array
   */
  public static void partition(int pivotIndex, List<FlagColor> colorBands) {
    FlagColor pivot = colorBands.get(pivotIndex);

    // There are Four groups in Array
    // {Smaller}{Equal}{Unprocessed}{Larger}
    //
    // smaller index moving right until equal
    // equal index moving right until larger
    // larger index moving left
    int smaller = 0;
    int equal = 0;
    int larger = colorBands.size();

    while (equal < larger) {
      if (colorBands.get(equal).ordinal() < pivot.ordinal()) {
        Collections.swap(colorBands, smaller++, equal++);
      } else if (colorBands.get(equal).ordinal() == pivot.ordinal()) {
        ++equal;
      } else { // colorBands.get(equal) > pivot
        Collections.swap(colorBands, equal, --larger);
      }
    }
  }
}
