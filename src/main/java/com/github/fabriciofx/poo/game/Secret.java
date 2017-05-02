package com.github.fabriciofx.poo.game;

public final class Secret {
	private final int num;
	
	public Secret() {
		this((int)(Math.random() * 101));
	}
	
	public Secret(final int num) {
		this.num = num;
	}
	
	public int number() {
		return this.num;
	}
}
