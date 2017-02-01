package com.github.fabriciofx.poo.math;

import java.util.concurrent.Callable;

import com.github.fabriciofx.poo.ce.IfTrue;
import com.github.fabriciofx.poo.ro.GreaterThanOrEqualTo;

public final class Max extends Number {
	private static final long serialVersionUID = -6790320336135857375L;
	private final Number a;
	private final Number b;
	
	public Max(final Number a, final Number b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int intValue() {
		return new IfTrue<Number>(
			new GreaterThanOrEqualTo<Number>(a, b),
				new Callable<Number>() {
					@Override
					public Number call() throws Exception {
						return a;
				}				
			}
		).eval().intValue();
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}

}
