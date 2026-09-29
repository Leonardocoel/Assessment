public class Main {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("ABC-1234", "Fiat Uno", 2015, 45000.0);
        Veiculo v2 = new Veiculo("XYZ-9876", "Toyota Corolla", 2020, 12000.0);

        v1.exibirDetalhes();
        System.out.println("\n");
        v2.exibirDetalhes();

        v1.registrarViagem(320.0);

        v2.registrarViagem(80.0);

        System.out.println("\nApós registrar viagens\n");

        v1.exibirDetalhes();
        System.out.println("\n");

        v2.exibirDetalhes();
    }
}