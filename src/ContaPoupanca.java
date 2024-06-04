public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String numero, double saldoInicial, double taxaJuros) {
        super(numero, saldoInicial);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        double juros = getSaldo() * (taxaJuros / 100);
        depositar(juros);
        System.out.println("Juros de R$ " + juros + " aplicados ao saldo.");
    }
}