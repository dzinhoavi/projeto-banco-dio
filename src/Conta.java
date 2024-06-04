public abstract class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldoInicial) {
        this.numero = numero;
        this.saldo = saldoInicial;

    }
    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    protected void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + "realizado com sucesso.");
        }else{
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
            return false;
        }
    }

    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " para a conta " + destino.getNumero() + " realizada com sucesso.");
            return true;
        } else {
            System.out.println("Transferência falhou.");
            return false;
        }
    }
}
