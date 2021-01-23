package com.xebia.srm;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	Calculator cal;

	@Test
	public void testAdd() {
		cal = new Calculator(10, 2);
		// assert the result
		Assert.assertEquals(12.0, cal.add(), 0);
	}

	@Test
	public void testSubtract() {
		cal = new Calculator(10, 2);
		// assert the result
		Assert.assertEquals(8.1, cal.sub(), 0);
		
//		cal = new Calculator(2, 10);
//		// assert the result
//		Assert.assertEquals(8.0, cal.sub(), 0);
	}
}
