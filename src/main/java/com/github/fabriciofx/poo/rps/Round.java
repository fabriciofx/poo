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
		final Move one = this.one.move(this.ui);
		final Move two = this.two.move(this.ui);
		switch(one.compareTo(two)) {
		case -1:
			ui.print(
				String.format(
					"%s wins!! %s played %s and %s played %s\n",
					this.one.name(),
					this.one.name(),
					one,
					this.two.name(),
					two
				)
			);
			break;
		case 0:
			ui.print(
				String.format(
					"Tie!! %s played %s and %s played %s\n",
					this.one.name(),
					one,
					this.two.name(),
					two
				)
			);
			break;
		case 1:
			ui.print(
				String.format(
					"%s wins!! %s played %s and %s played %s\n",
					this.two.name(),
					this.one.name(),
					one,
					this.two.name(),
					two
				)
			);
			break;
		}
	}
}
