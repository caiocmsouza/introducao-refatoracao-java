public class Banco {

    public void deposita(Conta c, double valor){
        c.setSaldo(c.getSaldo+valor);
    }

    public void realizaTransferencia(Conta a, double valor, Conta c){
        a.setSaldo(a.getSaldo - valor);
        c.setSaldo(c.getSaldo - valor);
    }
}
