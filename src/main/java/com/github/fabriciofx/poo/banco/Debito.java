package com.github.fabriciofx.poo.banco;

public final class Debito implements Operacao {
	private final Operacao origem;
	private final double valor;
	
	public Debito(final Operacao origem, final double valor) {
		this.origem = origem;
		this.valor = valor;
	}
	
	@Override
	public double valor() {
		return this.origem.valor() - this.valor;
	}
}
