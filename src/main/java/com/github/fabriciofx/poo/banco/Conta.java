package com.github.fabriciofx.poo.banco;

import java.io.IOException;

public interface Conta {
    double saldo() throws IOException;

    void contabiliza(Operacao operacao);
}
