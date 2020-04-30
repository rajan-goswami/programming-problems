package org.helios.epi.chapter5.problem11;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class IntersectChecker {
  /**
   * Find intersecting rectangle of two given Rectangles
   *
   * <p>Time complexity O(1)
   *
   * @param r1 {@link Rectangle}
   * @param r2 {@link Rectangle}
   * @return
   */
  public static Rectangle intersectRectangle(Rectangle r1, Rectangle r2) {
    if (!isIntersect(r1, r2)) {
      return Rectangle.atOrigin(-1L, -1L);
    }
    return Rectangle.atCoordinate(
        Math.max(r1.getX(), r2.getX()),
        Math.max(r1.getY(), r2.getY()),
        Math.min(r1.getX() + r1.getWidth(), r2.getX() + r2.getWidth())
            - Math.max(r1.getX(), r2.getX()),
        Math.min(r1.getY() + r1.getHeight(), r2.getY() + r2.getHeight())
            - Math.max(r1.getY(), r2.getY()));
  }

  private static boolean isIntersect(Rectangle r1, Rectangle r2) {
    return r1.getX() <= r2.getX() + r2.getWidth()
        && r1.getX() + r1.getWidth() >= r2.getX()
        && r1.getY() <= r2.getY() + r2.getHeight()
        && r1.getY() + r1.getHeight() >= r2.getY();
  }
}
