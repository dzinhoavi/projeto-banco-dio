public class Banco {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Oliveira", "987.654.321-00");

        // Adicionando contas aos clientes
        ContaCorrente contaCorrente1 = new ContaCorrente("12345", 1000.0, 500.0);
        ContaPoupanca contaPoupanca1 = new ContaPoupanca("67890", 2000.0, 0.5);
        cliente1.adicionarConta(contaCorrente1);
        cliente2.adicionarConta(contaPoupanca1);

        // Operações bancárias
        contaCorrente1.depositar(200.0);
        contaPoupanca1.sacar(150.0);
        contaCorrente1.transferir(contaPoupanca1, 300.0);
        contaPoupanca1.aplicarJuros();

        // Exibindo informações
        System.out.println("Cliente: " + cliente1.getNome());
        System.out.println("Saldo da Conta Corrente: R$ " + contaCorrente1.getSaldo());
        System.out.println();

        System.out.println("Cliente: " + cliente2.getNome());
        System.out.println("Saldo da Conta Poupança: R$ " + contaPoupanca1.getSaldo());
    }
}
