package com.github.fabriciofx.poo.ce;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.github.fabriciofx.poo.ro.GreaterThan;

public final class IfCodeTest {
	@Test
	public void isTrue() throws Exception {
		boolean result = new IfCode(
			new GreaterThan<Integer>(2, 1)).isTrue(() -> {
				return true;
			}
		);
		assertTrue(result);
	}
}
