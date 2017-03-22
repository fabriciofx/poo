package com.github.fabriciofx.poo.rps;

public final class Move implements Comparable<Move> {
	private final String name;

	public Move(final String name) {
		this.name = name;
	}

	@Override
	public int compareTo(final Move move) {
		final int cmp;
		if (this.name.equals("Rock") && move.name.equals("Scissors")
			|| this.name.equals("Paper") && move.name.equals("Rock")
			|| this.name.equals("Scissors") && move.name.equals("Paper")) {
			cmp = -1;
		} else if (this.name.equals("Rock") && move.name.equals("Paper")
			|| this.name.equals("Paper") && move.name.equals("Scissors")
			|| this.name.equals("Scissors") && move.name.equals("Rock")) {
			cmp = 1;
		} else {
			cmp = 0;
		}
		return cmp;	
	}
	
	@Override
	public String toString() {
		return name;
	}
}
