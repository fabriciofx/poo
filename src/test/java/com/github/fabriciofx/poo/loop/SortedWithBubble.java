package com.github.fabriciofx.poo.loop;

import java.util.ArrayList;
import java.util.List;

public class SortedWithBubble implements Numbers {
	private final Numbers origin;
	
	public SortedWithBubble(final Numbers origin) {
		this.origin = origin;
	}
	
	@Override
	public Iterable<Number> iterate() {
		final List<Number> list = new ArrayList<>();
		origin.iterate().forEach(list::add);
		return null;
	}
}
