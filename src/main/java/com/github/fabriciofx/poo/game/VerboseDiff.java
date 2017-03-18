package com.github.fabriciofx.poo.game;

public final class VerboseDiff {
	private final Diff diff;
	
	public VerboseDiff(final Diff diff) {
		this.diff = diff;
	}
	
	public int number() {
		final int x = this.diff.number();
		if (x < 0) {
			System.out.println("Too small.");
		} else if (x > 0) {
			System.out.println("Too big.");			
		} else {
			System.out.println("Bingo!");
		}
		return x;
	}
}
