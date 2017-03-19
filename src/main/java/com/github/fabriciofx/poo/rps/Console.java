package com.github.fabriciofx.poo.rps;

import java.util.Scanner;

public final class Console implements Ui {
	@Override
	public void print(final String message) {
		System.out.print(message);
	}

	@Override
	public char character(final String pattern) {
		final Scanner keyboard = new Scanner(System.in);
		return keyboard.next(pattern).charAt(0);
	}
}
