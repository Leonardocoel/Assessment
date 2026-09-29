public class Main {
    public static void main(String[] args) {
        double salarioBase = 3000.00;

        Funcionario gerente = new Gerente("Jhon Doe", salarioBase);
        Funcionario estagiario = new Estagiario("Fulano", salarioBase);

        System.out.println("=== FOLHA DE PAGAMENTO ===");
        gerente.exibirSalario();
        estagiario.exibirSalario();
    }
}