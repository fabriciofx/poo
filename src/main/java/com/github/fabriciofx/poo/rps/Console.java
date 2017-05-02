package com.github.fabriciofx.poo.rps;

import java.util.Scanner;

public final class Console implements Ui {
	@Override
	public void print(final String message) {
		System.out.print(message);
	}

	@SuppressWarnings("resource")
	@Override
	public char character(final String pattern) {
		return new Scanner(System.in).next(pattern).charAt(0);
	}
}
