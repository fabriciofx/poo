package com.github.fabriciofx.poo.exp;

public final class Return<T> implements Expression<T> {
	private final T value;
	
	public Return(final T value) {
		this.value = value;
	}
	
	@Override
	public T eval() {
		return value;
	}
}
