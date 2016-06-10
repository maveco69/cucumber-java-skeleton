package skeleton;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.LinkedList;
import java.util.List;

public class Calculadora {

    private List<BigDecimal> numeros = new LinkedList<>();
    private BigDecimal result;

    public void adicionaNumero(BigDecimal n) {
        numeros.add(n);
    }

    public void soma() {
        result = numeros.stream().reduce(BigDecimal::add).get();
    }

    public BigDecimal getResult() {
        return result;
    }

    public void limpar() {
        numeros.clear();
        result = BigDecimal.ZERO;
    }

    public void divide() {
        result = numeros.stream().reduce(BigDecimal::divide).get();
    }
}
