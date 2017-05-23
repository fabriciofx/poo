package com.github.fabriciofx.poo.rps;

import javax.swing.JOptionPane;

public final class Gui implements Ui {

	@Override
	public void print(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public char character(final String message, final String pattern) {
		return JOptionPane.showInputDialog(message).charAt(0);
	}
}
