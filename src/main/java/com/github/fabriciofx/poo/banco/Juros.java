package com.github.fabriciofx.poo.banco;

public final class Juros implements Operacao {
    private final Operacao origem;
    private final double taxa;

    public Juros(final Operacao origem, final double taxa) {
        this.origem = origem;
        this.taxa = taxa;
    }

    @Override
    public double valor() {
        return this.origem.valor() * (1 + this.taxa);
    }
}
