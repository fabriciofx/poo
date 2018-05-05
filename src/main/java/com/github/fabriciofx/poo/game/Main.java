package com.github.fabriciofx.poo.game;

public final class Main {
    public static void main(String[] args) {
        final Secret secret = new Secret();
        new Farewell(
            new Attempts(
                new VerboseDiff(
                    new Diff(
                        secret,
                        new Guess()
                    )
                ),
                5
            ),
            secret
        ).run();
    }
}
