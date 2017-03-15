package com.github.fabriciofx.poo.loop;

import org.junit.Test;

public final class LoopTest {
	@Test
	public void bubbleSort() {
		final Numbers numbers = new SortedWithBubble(
			new ArrayNumbers(
				new Integer[] {
					-5, 12, -10, 0, 6
				}
			)
		);
	}
}
