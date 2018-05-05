package com.github.fabriciofx.poo.game;

public final class Diff {
    private final Secret secret;
    private final Guess guess;

    public Diff(final Secret secret, final Guess guess) {
        this.secret = secret;
        this.guess = guess;
    }

    public int number() {
        return this.guess.number() - this.secret.number();
    }
}
