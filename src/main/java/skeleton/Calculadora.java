package skeleton;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Calculadora {

    private List<BigDecimal> numeros = new ArrayList<>();
    private BigDecimal resultado = BigDecimal.ZERO;

    public void adicionarNumero(BigDecimal numero) {
        numeros.add(numero);
    }

    public void soma() {
        calcula(BigDecimal::add);
    }

    public BigDecimal getResultado() {
        return resultado;
    }

    public void setResultado(BigDecimal resultado) {
        this.resultado = resultado;
    }

    public void subtrair() {
        calcula(BigDecimal::subtract);
    }

    private void calcula(BinaryOperator<BigDecimal> integerBinaryOperator) {
        resultado = numeros.stream().reduce(integerBinaryOperator).get();
    }

    public void multiplicar() {
        calcula(BigDecimal::multiply);
    }

    public void divisao() {
        try {
            calcula(BigDecimal::divide);
        }catch (ArithmeticException e){
            throw  new ArithmeticException("Divisão por zero.");
        }
    }

    public void raizQuadrada(){
        resultado = new BigDecimal(Math.sqrt(numeros.get(0).doubleValue()));
    }
}
