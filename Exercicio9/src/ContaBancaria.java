public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return;
        }
        saldo += valor;
        System.out.printf("Depósito de R$ %.2f realizado.%n", valor);
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Saldo insuficiente para saque.");
            return;
        }
        saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado.%n", valor);
    }

    public void exibirSaldo() {
        System.out.printf("Titular: %s | Saldo: R$ %.2f%n", titular, saldo);
    }

}