package org.helios.epi.chapter5.problem11;

import lombok.*;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
public class Rectangle {
  private long x;
  private long y;
  private long width;
  private long height;

  public static Rectangle atOrigin(long width, long height) {
    return new Rectangle(0L, 0L, width, height);
  }

  public static Rectangle atCoordinate(long x, long y, long width, long height) {
    return new Rectangle(x, y, width, height);
  }
}
