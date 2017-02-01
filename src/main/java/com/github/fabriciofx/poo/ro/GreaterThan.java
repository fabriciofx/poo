package com.github.fabriciofx.poo.ro;

import com.github.fabriciofx.poo.ce.Condition;

public final class GreaterThan<T> implements Condition {
	private final Comparable<T> comparable;
	private final T object;

	public GreaterThan(final Comparable<T> comparable, final T object) {
		this.comparable = comparable;
		this.object = object;
	}
	
	@Override
	public Boolean eval() {
		return comparable.compareTo(object) > 0;
	}
}
