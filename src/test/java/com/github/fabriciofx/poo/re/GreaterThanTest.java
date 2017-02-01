package com.github.fabriciofx.poo.re;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.fabriciofx.poo.ce.Condition;
import com.github.fabriciofx.poo.ro.GreaterThan;

public final class GreaterThanTest {
	@Test
	public void compareIntegers() {
		final Condition gt = new GreaterThan<Integer>(
			new Integer(3),
			new Integer(2)
		);
		assertTrue(gt.eval());
	}

	@Test
	public void compareIntegers2() {
		final Condition gt = new GreaterThan<Integer>(
			new Integer(2),
			new Integer(3)
		);
		assertFalse(gt.eval());
	}
	
	@Test
	public void compareStrings() {
		final Condition gt = new GreaterThan<String>(
			new String("two"),
			new String("three")
		);
		assertTrue(gt.eval());
	}
}
