package com.github.fabriciofx.poo.rps;

public final class RockPaperScissors {
	private final Ui ui;
	private final Player one;
	private final Player two;
	private final int matches;

	public RockPaperScissors() {
		this(new Console());
	}

	public RockPaperScissors(final Ui ui) {
		this(ui, new Human());
	}

	public RockPaperScissors(final Ui ui, final Player one) {
		this(ui, one, new Computer());
	}

	public RockPaperScissors(final Ui ui, final Player one, final Player two) {
		this(ui, one, two, 3);
	}

	public RockPaperScissors(final Ui ui, final Player one, final Player two,
		final int matches) {
		this.ui = ui;
		this.one = one;
		this.two = two;
		this.matches = matches;
	}
	
	public void play() {
		new Attempts(
			new Match(
				this.ui,
				this.one,
				this.two
			),
			this.matches
		).matches();
	}
}
