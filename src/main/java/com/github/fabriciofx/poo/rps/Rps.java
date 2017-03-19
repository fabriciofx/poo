package com.github.fabriciofx.poo.rps;

public final class Rps {
	public static void main(String[] args) {
		new Attempts(
			new Round(
				new Console(),
				new Computer(),
				new Human()
			),
			3
		).matches();
	}
}
