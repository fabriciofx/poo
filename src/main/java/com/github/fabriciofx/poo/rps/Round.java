package com.github.fabriciofx.poo.rps;

public final class Round {
	private final Ui ui;
	private final Player one;
	private final Player two;

	public Round(final Ui ui, final Player one, final Player two) {
		this.ui = ui;
		this.one = one;
		this.two = two;
	}

	public void start() {
		final Move o = this.one.move();
		final Move t = this.two.move();
		this.ui.print(
			String.format("%s played ")
		);
		if (o.value() == 'R' && t.value() == 'S' ||
			o.value() == 'P' && t.value() == 'R' ||
			o.value() == 'S' && t.value() == 'P') {
			this.ui.print(this.one.name() + " wins!\n"); 
		} else if (o.value() == 'R' && t.value() == 'P' ||
			o.value() == 'P' && t.value() == 'S' ||
			o.value() == 'S' && t.value() == 'R') {
			this.ui.print(this.two.name() + " wins!\n"); 
		} else {
			this.ui.print("Tie!\n"); 
		}
	}
}
