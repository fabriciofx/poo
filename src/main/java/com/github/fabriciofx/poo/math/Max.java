package com.github.fabriciofx.poo.math;

import com.github.fabriciofx.poo.ce.If;
import com.github.fabriciofx.poo.exp.Expression;
import com.github.fabriciofx.poo.exp.Return;
import com.github.fabriciofx.poo.ro.GreaterThanOrEqualTo;

public final class Max extends Number {
    private static final long serialVersionUID = -6790320336135857375L;
    private final Expression<Number> exp;

    public Max(final Number a, final Number b) {
        this.exp = new If<Number>(
            new GreaterThanOrEqualTo<Number>(a, b),
            new Return<Number>(a),
            new Return<Number>(b)
        );
    }

    @Override
    public int intValue() {
        return exp.eval().intValue();
    }

    @Override
    public long longValue() {
        return exp.eval().longValue();
    }

    @Override
    public float floatValue() {
        return exp.eval().floatValue();
    }

    @Override
    public double doubleValue() {
        return exp.eval().doubleValue();
    }
}
