package com.github.fabriciofx.poo.ro;

import com.github.fabriciofx.poo.exp.Condition;

public final class LessThan implements Condition {
	private final Number a;
	private final Number b;

	public LessThan(final Number a, final Number b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public Boolean eval() {
		return a.doubleValue() < b.doubleValue() ? true : false;
	}	
}
