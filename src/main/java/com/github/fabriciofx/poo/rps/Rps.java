package com.github.fabriciofx.poo.rps;

public final class Rps {
	public static void main(String[] args) {
		final Ui ui = new Console();
		new Attempts(
			new Round(
				ui,
				new Computer(),
				new Human(ui)
			),
			3
		).matches();
	}
}
