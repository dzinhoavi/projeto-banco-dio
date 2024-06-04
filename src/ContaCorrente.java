public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(String numero, double saldoInicial, double limiteChequeEspecial) {
        super(numero, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
    public boolean sacar(double valor) {
        if (valor > 0 && this.getSaldo() + limiteChequeEspecial >= valor) {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            return true;
        } else {
            System.out.println("Saldo insuficiente, mesmo considerando o limite do cheque especial.");
            return false;
        }
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
}
