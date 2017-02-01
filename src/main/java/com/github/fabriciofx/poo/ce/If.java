package com.github.fabriciofx.poo.ce;

import com.github.fabriciofx.poo.exp.Condition;
import com.github.fabriciofx.poo.exp.Expression;

public final class If<T> implements Expression<T> {
	private final Condition condition;
	private final Expression<T> left;
	private final Expression<T> right;

	public If(final Condition condition, final Expression<T> left,
			final Expression<T> right) {
		this.condition = condition;
		this.left = left;
		this.right = right;
	}

	@Override
	public T eval() {
		return condition.eval() ? left.eval() : right.eval();
	}
}
