package skeleton;

import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.assertj.core.api.Assertions;

import java.math.BigDecimal;

public class Stepdefs {

    private Calculadora calculadora;
    private Throwable error;


    @Então("^apresentar mensagem \"([^\"]*)\"$")
    public void apresentar_mensagem(String arg1) throws Throwable {
            Assertions.assertThat(error).hasMessage("Divisão por zero.");
    }


    @Before
    public void initialize() {
        calculadora = new Calculadora();
    }

    @Quando("^realizo a subtração$")
    public void realizo_a_subtração() throws Throwable {
        calculadora.subtrair();
    }


    @Dado("^informo o número \"([^\"]*)\"$")
    public void informo_o_número(BigDecimal numero) throws Throwable {
        calculadora.adicionarNumero(numero);
    }

    @Quando("^realizo a soma$")
    public void realizo_a_soma() throws Throwable {
        calculadora.soma();
    }

    @Então("^o resultado será \"([^\"]*)\"$")
    public void o_resultado_será(BigDecimal resultado) throws Throwable {
        Assertions.assertThat(calculadora.getResultado()).isEqualByComparingTo(resultado);
    }


    @Quando("^realizo a multiplicação$")
    public void realizo_a_multiplicação() throws Throwable {
        calculadora.multiplicar();
    }

    @Quando("^realizo a divisão$")
    public void realizo_a_divisão() throws Throwable {
        try {
            calculadora.divisao();
        }catch (ArithmeticException e){
            error = e;
        }
    }

    @Quando("^realizo a raiz quadrada$")
    public void realizo_a_raiz_quadrada() throws Throwable {
        calculadora.raizQuadrada();
    }
}
