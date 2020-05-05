package org.helios.epi.chapter7.problem1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.MalformedParametersException;

public class StringIntConverterTest {

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void intToString_Success_PositiveInteger() {
    int i = 300;
    String iString = StringIntConverter.intToString(i);
    Assert.assertTrue("300".compareTo(iString) == 0);
  }

  @Test
  public void intToString_Success_NegativeInteger() {
    int i = -300;
    String iString = StringIntConverter.intToString(i);
    Assert.assertTrue("-300".compareTo(iString) == 0);
  }

  @Test
  public void intToString_Success_Zero() {
    int i = 0;
    String iString = StringIntConverter.intToString(i);
    Assert.assertTrue("0".compareTo(iString) == 0);
  }

  @Test
  public void stringToInt_Success_NumberString() {
    String numberString = "300";
    int number = StringIntConverter.stringToInt(numberString);
    Assert.assertEquals(300, number);
  }

  @Test(expected = MalformedParametersException.class)
  public void stringToInt_Exception_InvalidNumberString() {
    String numberString = "3&0";
    int number = StringIntConverter.stringToInt(numberString);
  }

  @Test()
  public void stringToInt_Success_NegativeNumberString() {
    String numberString = "-300";
    int number = StringIntConverter.stringToInt(numberString);
    Assert.assertEquals(-300, number);
  }
}
