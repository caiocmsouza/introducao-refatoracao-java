import static org.junit.Assert.assertThat;
import org.junit.Test;

public class ContaTeste{

    @Test
    public void aoSacarUmValorDeUmaContaOSaldoDeveSofrerUmaSubtracaoDesseValor(){
        Conta conta = new Conta(200d);
        conta.saca(50d); 
        assertThat(conta.getSaldo(), is(equalsTo(150d)));

    }
}