package com.github.fabriciofx.poo.rps;

public final class Main {
	public static void main(String[] args) {
		new RockPaperScissors(
			new Console(),
			new Computer(),
			new Human(),
			3
		).play();
	}
}
