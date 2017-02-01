package com.github.fabriciofx.poo.ce;

import java.util.concurrent.Callable;

import com.github.fabriciofx.poo.Expression;

public final class IfTrue<T> implements Expression<T> {
	private final Condition condition;
	private final Callable<T> callable;

	public IfTrue(final Condition condition, final Callable<T> callable) {
		this.condition = condition;
		this.callable = callable;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T eval() {
		try {
			return condition.eval() ? callable.call() : (T) new Object();
		} catch (final Exception e) {
			throw new RuntimeException(e);
		}
	}
}