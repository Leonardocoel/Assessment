public class Veiculo {

    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de fabricação: " + anoFabricacao);
        System.out.printf("Quilometragem: %.2f km%n", quilometragem);
    }

    public void registrarViagem(double km) {
        quilometragem += km;
    }
}