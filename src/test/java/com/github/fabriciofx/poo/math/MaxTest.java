package com.github.fabriciofx.poo.math;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public final class MaxTest {
	@Test
	public void maxBetween3And2() {
		final Number max = new Max(
			new Integer(3),
			new Integer(2)
		);
		assertEquals(3, max.intValue());
	}

	@Test
	public void maxBetween2And3() {
		final Number max = new Max(
			new Integer(2),
			new Integer(3)
		);
		assertEquals(3, max.intValue());
	}
}
