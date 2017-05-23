package com.github.fabriciofx.poo.rps;

public final class RockPaperScissors {
	public static void main(String[] args) {
		new Attempts(
			new Match(
				new Console(),
				new Computer(),
				new Human()
			),
			3
		).matches();
	}
}
