package com.github.fabriciofx.poo.rps;

import java.util.Random;

public final class Computer implements Player {
	@Override
	public String name() {
		return "The Computer";
	}
	
	@Override
	public Move move() {
		return Move.ALL.values().toArray(
			new Move[Move.ALL.size()]
		)[new Random().nextInt(3)];
	}	
}
