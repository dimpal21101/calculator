package com.leszko.calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest{
private calculator xcalculator = new calculator();

@Test
public void testSum() {
assertEquals(5, xcalculator.sum(2,3));
}
}