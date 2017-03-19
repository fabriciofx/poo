package com.github.fabriciofx.poo.rps;

public final class Human implements Player {
	private final Ui ui;
	
	public Human(final Ui ui) {
		this.ui = ui;
	}
	
	@Override
	public String name() {
		return "You";
	}
	
	@Override
	public Move move() {
		this.ui.print("What is your move (Rock, Paper or Scissors)? ");
		return Move.ALL.get(this.ui.character("[rpsRPS]"));
	}
}
