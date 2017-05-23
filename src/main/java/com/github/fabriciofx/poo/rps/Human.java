package com.github.fabriciofx.poo.rps;

import java.util.HashMap;
import java.util.Map;

public final class Human implements Player {
	private final Map<Character, Move> moves;
	
	public Human() {
		this(new HashMap<Character, Move>() {
			private static final long serialVersionUID = -4810641108913835343L;
			{
				put('R', new Move("Rock"));
				put('P', new Move("Paper"));
				put('S', new Move("Scissors"));
			}}
		);
	}
	
	public Human(final Map<Character, Move> moves) {
		this.moves = moves;
	}
	
	@Override
	public String name() {
		return "You";
	}
	
	@Override
	public Move move(final Ui ui) {
		return this.moves.get(
			Character.toUpperCase(
				ui.character(
					"What is your move (Rock, Paper or Scissors)? ",
					"[rpsRPS]"
				)
			)
		);
	}
}
