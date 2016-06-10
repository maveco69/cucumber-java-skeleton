package skeleton;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.assertj.core.api.Assertions;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Stepdefs {

    private Calculadora calculadora = new Calculadora();

    @Before
    public void setUp() {
        calculadora.limpar();
    }

    @Dado("^que informo o número \"([^\"]*)\"$")
    public void que_informo_o_numero(BigDecimal number) throws Throwable {
        calculadora.adicionaNumero(number);
    }

    @Quando("^realizo a soma dos números$")
    public void realizo_a_soma_dos_n_meros() throws Throwable {
        calculadora.soma();
    }

    @Entao("^o resultado deve ser \"([^\"]*)\"$")
    public void o_resultado_deve_ser(BigDecimal number) throws Throwable {
        Assertions.assertThat(calculadora.getResult()).isEqualByComparingTo(number);
    }

    @Quando("^realizo a divisao dos números$")
    public void realizo_a_divisao_dos_n_meros() throws Throwable {
        calculadora.divide();
    }

}
