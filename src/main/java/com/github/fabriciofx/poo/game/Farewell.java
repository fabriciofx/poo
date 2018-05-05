package com.github.fabriciofx.poo.game;

public final class Farewell {
    private final Attempts attempts;
    private final Secret secret;

    public Farewell(final Attempts attempts, final Secret secret) {
        this.attempts = attempts;
        this.secret = secret;
    }

    public void run() {
        if (!this.attempts.matches()) {
            System.out.println(
                "You lost, sorry. It was: " + this.secret.number()
            );
        }
        System.out.println("Thanks for playing with me!");
    }
}
