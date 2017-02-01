package com.github.fabriciofx.poo.ro;

import com.github.fabriciofx.poo.ce.Condition;

public final class GreaterThanOrEqualTo2<T> implements Condition {
	private final Comparable<T> comparable;
	private final T object;

	public GreaterThanOrEqualTo2(final Comparable<T> comparable,
		final T object) {
		this.comparable = comparable;
		this.object = object;
	}
	
	@Override
	public Boolean eval() {
		return comparable.compareTo(object) >= 0;
	}
}
