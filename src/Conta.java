public class Conta {
    private double saldo;

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar( double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }

    public void setSaldo(double saldo) {
        this.saldo= saldo;
    }
}
