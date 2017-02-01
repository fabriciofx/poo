package com.github.fabriciofx.poo.ce;

import java.util.concurrent.Callable;

import com.github.fabriciofx.poo.exp.Condition;

public final class IfCode {
	private final Condition condition;

	public IfCode(final Condition condition) {
		this.condition = condition;
	}

	@SuppressWarnings("unchecked")
	public <T> T isTrue(final Callable<T> callable) throws Exception {
		return condition.eval() ? callable.call() : (T) new Object();
	}

	public void isTrue(final Runnable runnable) throws Exception {
		@SuppressWarnings("unused")
		final int dummy = condition.eval() ? new Object() {
			public int hashCode() {
				runnable.run();
				return 0;
			};
		}.hashCode() : new Object() {
			public int hashCode() {
				return 0;
			};
		}.hashCode();
	}
}
