public class Banco {

    public void deposita(Conta c, double valor){
        c.depositar(valor);
    }

    public void realizaTransferencia(Conta a, double valor, Conta c){
        a.sacar(valor);
        c.depositar(valor);
    }
}
