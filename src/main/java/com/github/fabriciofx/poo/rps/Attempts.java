package com.github.fabriciofx.poo.rps;

public final class Attempts {
	private final Round round;
	private final int max;
	
	public Attempts(final Round round, final int max) {
		this.round = round;
		this.max = max;
	}
	
	public boolean matches() {
		int t = 0;
		while (t++ < this.max) {
			this.round.start();
		}
		return t <= this.max;
	}
}
