import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        String matricula = scanner.nextLine();

        System.out.print("Nota 1: ");
        double n1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double n2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double n3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nome, matricula, n1, n2, n3);

        System.out.println();
        aluno.exibirBoletim();

        scanner.close();
    }
}