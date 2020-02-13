import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

public class ContaTest {

	@Test
	public void aoSacarUmValorDeUmaContaOSaldoDeveSofrerUmaSubtracaoDesseValor() {
		Conta conta = new Conta(200d);
		conta.sacar(50d);
		
		
		assertThat(conta.getSaldo(), is(equalTo(150d)));
		
	}

}
