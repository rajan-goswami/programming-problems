package org.helios.epi.chapter5.problem11;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntersectCheckerTest {

  private Rectangle emptyRectangle = Rectangle.atOrigin(-1, -1);

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testIntersectRectangle_Rectangle_GivenIntersectingRectangles() {
    Rectangle r1 = Rectangle.atCoordinate(1, 1, 4, 10);
    Rectangle r2 = Rectangle.atCoordinate(3, 3, 2, 9);

    Rectangle intersectRectangle = IntersectChecker.intersectRectangle(r1, r2);

    Assert.assertEquals(Rectangle.atCoordinate(3, 3, 2, 8), intersectRectangle);
  }

  @Test
  public void testIntersectRectangle_EmptyRectangle_GivenNonIntersectingRectangles() {
    Rectangle r1 = Rectangle.atCoordinate(1, 1, 2, 10);
    Rectangle r2 = Rectangle.atCoordinate(4, 3, 2, 9);

    Rectangle intersectRectangle = IntersectChecker.intersectRectangle(r1, r2);

    Assert.assertEquals(emptyRectangle, intersectRectangle);
  }
}
