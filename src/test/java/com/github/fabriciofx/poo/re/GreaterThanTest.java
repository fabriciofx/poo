package com.github.fabriciofx.poo.re;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.fabriciofx.poo.exp.Condition;
import com.github.fabriciofx.poo.ro.GreaterThan;

public final class GreaterThanTest {
	@Test
	public void aGreaterThanB() {
		final Condition gt = new GreaterThan(
			new Integer(3),
			new Integer(2)
		);
		assertTrue(gt.eval());
	}

	@Test
	public void bGreaterThanA() {
		final Condition gt = new GreaterThan(
			new Integer(2),
			new Integer(3)
		);
		assertFalse(gt.eval());
	}
}
