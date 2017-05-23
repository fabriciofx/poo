package com.github.fabriciofx.poo.rps;

public final class Attempts {
	private final Match round;
	private final int max;
	
	public Attempts(final Match round, final int max) {
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
