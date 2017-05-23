package com.github.fabriciofx.poo.rps;

public final class Attempts {
	private final Match match;
	private final int max;
	
	public Attempts(final Match match, final int max) {
		this.match = match;
		this.max = max;
	}
	
	public boolean matches() {
		int t = 0;
		while (t++ < this.max) {
			this.match.start();
		}
		return t <= this.max;
	}
}
