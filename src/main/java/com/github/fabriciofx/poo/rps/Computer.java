package com.github.fabriciofx.poo.rps;

import java.util.Random;

public final class Computer implements Player {
	private final Move[] moves;
	
	public Computer() {
		this(new Move("Rock"), new Move("Paper"), new Move("Scissors"));
	}
	
	public Computer(final Move... moves) {
		this.moves = moves;
	}
	
	@Override
	public String name() {
		return "The Computer";
	}
	
	@Override
	public Move move(final Ui ui) {
		return this.moves[new Random().nextInt(3)];
	}	
}
