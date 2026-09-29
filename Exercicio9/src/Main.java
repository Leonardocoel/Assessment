public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Maria Silva", 1000.00);

        System.out.println("=== Saldo inicial ===");
        conta.exibirSaldo();

        System.out.println("\n=== Operações ===");
        conta.sacar(5000.00);
        conta.depositar(500.00);
        conta.sacar(200.00);
        conta.depositar(-50.00);


        System.out.println("\n=== Saldo final ===");
        conta.exibirSaldo();
    }
}