package com.github.fabriciofx.poo.ce;

import java.util.concurrent.Callable;

import org.junit.Test;

import com.github.fabriciofx.poo.ce.IfTrue;
import com.github.fabriciofx.poo.ro.GreaterThan;

public final class IfTrueTest {
	@Test
	public void ifTrue() {
		new IfTrue<Void>(
			new GreaterThan<Integer>(2, 1),
			new Callable<Void>() {
				@Override
				public Void call() throws Exception {
					System.out.println("It's True!");
					return null;
				}				
			}
		).eval();
	}
}
