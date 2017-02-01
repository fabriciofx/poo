package com.github.fabriciofx.poo.ro;

import com.github.fabriciofx.poo.ce.Condition;

public final class GreaterThan implements Condition {
	private final Number a;
	private final Number b;

	public GreaterThan(final Number a, final Number b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Boolean eval() {
		return a.doubleValue() > b.doubleValue() ? true : false;
	}	
}
