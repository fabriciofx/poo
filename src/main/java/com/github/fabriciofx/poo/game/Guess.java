package com.github.fabriciofx.poo.game;

import java.util.Scanner;

public final class Guess {
	public int number() {
		System.out.println("Guess a number in 0..100 range: ");
		try (final Scanner keyboard = new Scanner(System.in)) {
			return keyboard.nextInt();
		}
	}
}
