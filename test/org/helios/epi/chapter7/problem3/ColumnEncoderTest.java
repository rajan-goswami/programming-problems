package org.helios.epi.chapter7.problem3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.MalformedParametersException;

public class ColumnEncoderTest {

  @Before
  public void setUp() throws Exception {}

  @Test
  public void encodeSpreadsheetColumn_Success_ColumnIdentifier() {
    String columnId = "Zz";
    long columnCode = ColumnEncoder.encodeSpreadsheetColumn(columnId);
    Assert.assertEquals(702, columnCode);
  }

  @Test(expected = MalformedParametersException.class)
  public void encodeSpreadsheetColumn_Exception_InvalidColumnIdentifier() {
    String columnId = "Zz1";
    long columnCode = ColumnEncoder.encodeSpreadsheetColumn(columnId);
  }
}
