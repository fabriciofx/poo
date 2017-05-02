package com.github.fabriciofx.poo.array;

import com.github.fabriciofx.poo.exp.Condition;
import com.github.fabriciofx.poo.exp.Statement;

public final class ChangeOneByOne<T> implements Statement {
	private final Condition condition;
	private final Number[] array;
	
	public ChangeOneByOne(final Condition condition, final Number[] array) {
		this.condition = condition;
		this.array = array;
	}
	
	@Override
	public void eval() {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].doubleValue() > array[i + 1].doubleValue()) {
				Number temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}
	}
}
