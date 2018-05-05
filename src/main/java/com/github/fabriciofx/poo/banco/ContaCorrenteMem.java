package com.github.fabriciofx.poo.banco;

import java.util.Arrays;
import java.util.List;

public final class ContaCorrenteMem implements Conta {
    private final List<Operacao> operacoes;

    public ContaCorrenteMem(final Operacao... operacoes) {
        this(Arrays.asList(operacoes));
    }

    public ContaCorrenteMem(final List<Operacao> operacoes) {
        this.operacoes = operacoes;
    }

    @Override
    public double saldo() {
        double saldo = 0.0;
        for (final Operacao o : this.operacoes) {
            saldo = saldo + o.valor();
        }
        return saldo;
    }

    @Override
    public void contabiliza(final Operacao operacao) {
    }
}
