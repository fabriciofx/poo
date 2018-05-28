package com.github.fabriciofx.poo.loop;

import java.util.Arrays;

public final class ArrayNumbers implements Numbers {
    private final Number[] numbers;

    public ArrayNumbers(final Number[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterable<Number> iterate() {
        return Arrays.asList(numbers);
    }
}
