package com.github.fabriciofx.poo.game;

import java.util.Scanner;

public final class Guess {
    @SuppressWarnings("resource")
    public int number() {
        System.out.println("Guess a number in 0..100 range: ");
        return new Scanner(System.in).nextInt();
    }
}
