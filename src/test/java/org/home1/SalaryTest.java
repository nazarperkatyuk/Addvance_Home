package org.home1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SalaryTest {
    private Salary s;
    @Before
    public void setup(){
        s = new Salary();
    }
    @Test
    public void itCountsSalaryPerDay(){
        double actual= s.SalaryPerDay(22,9);
        double expected = 160.0;
        Assert.assertEquals(expected,actual,0.000001);
    }
    @Test
    public void itCountsSalaryPerMonth(){
        double actual = s.SalaryPerMonth(22,22,9,1000);
        double expected = 5356.0;
        Assert.assertEquals(expected,actual,0.000001);
    }
}
