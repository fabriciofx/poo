package com.github.fabriciofx.poo.loop;

import com.github.fabriciofx.poo.exp.Condition;
import com.github.fabriciofx.poo.exp.Statement;

public final class While implements Statement {
	private final Condition condition;
	private final Statement next;
	private final Statement body;
	
	public While(final Condition condition, final Statement next,
		final Statement body) {
		this.condition = condition;
		this.next = next;
		this.body = body;
	}

	@Override
	public void eval() {
		while(condition.eval()) {
			body.eval();
			next.eval();
		}
	}
}
