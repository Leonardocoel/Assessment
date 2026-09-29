public class Aluno {

    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public void verificarAprovacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Situação: REPROVADO");
        }
    }

    public void exibirBoletim() {
        System.out.println("=== BOLETIM ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.printf("Notas: %.2f | %.2f | %.2f%n", nota1, nota2, nota3);
        System.out.printf("Média: %.2f%n", calcularMedia());
        verificarAprovacao();
    }
}