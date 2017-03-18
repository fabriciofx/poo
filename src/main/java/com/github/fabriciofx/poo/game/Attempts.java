package com.github.fabriciofx.poo.game;

public final class Attempts {
	private final VerboseDiff diff;
	private final int max;

	public Attempts(final VerboseDiff diff, final int max) {
		this.diff = diff;
		this.max = max;
	}

	public boolean matches() {
		int t = 0;
		while (t <= this.max && this.diff.number() != 0) {
			++t;
		}
		return t <= this.max;
	}
}
