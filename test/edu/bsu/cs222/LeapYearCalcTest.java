package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class LeapYearCalcTest {
    @Test
    public void test2004IsLeapYear()
    {
        LeapYearCalc leapYear = new LeapYearCalc();
        boolean result = leapYear.isLeapYear(2004);
        Assert.assertTrue(result);
    }

}
