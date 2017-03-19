package com.github.fabriciofx.poo.rps;

import java.util.HashMap;
import java.util.Map;

public interface Move {
	void print(Ui ui);
	
	char value();
	
	Move ROCK = new Move() {
		@Override
		public void print(final Ui ui) {
			ui.print("Rock");
		}

		@Override
		public char value() {
			return 'R';
		}
	};
	
	Move PAPER = new Move() {
		@Override
		public void print(final Ui ui) {
			ui.print("Paper");
		}

		@Override
		public char value() {
			return 'P';
		}
	};
	
	Move SCISSORS = new Move() {
		@Override
		public void print(final Ui ui) {
			ui.print("Rock");
		}

		@Override
		public char value() {
			return 'S';
		}
	};
	
	Map<Character, Move> ALL = new HashMap<Character, Move>() {
		private static final long serialVersionUID = 9082923806347924956L;
	{
		put('R', ROCK);
		put('P', PAPER);
		put('S', SCISSORS);
	}};
}
