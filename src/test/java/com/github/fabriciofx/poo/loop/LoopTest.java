package com.github.fabriciofx.poo.loop;

import com.github.fabriciofx.poo.io.Console;
import org.junit.Test;

public final class LoopTest {

    @Test
    public void simple() throws Exception {
        new Loop(1, 5).eval(() -> {
            try {
                new Console().write("Hello!\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Test
    public void bubbleSort() {
        final Numbers numbers = new SortedWithBubble(
            new ArrayNumbers(
                new Integer[] {
                    -5, 12, -10, 0, 6
                }
            )
        );
    }
}
