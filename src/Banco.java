public class Banco {

    public void deposita(Conta c, double valor){
        c.deposita(valor);
    }

    public void realizaTransferencia(Conta a, double valor, Conta c){
        a.saca(valor);
        c.deposita(valor);
    }
}
