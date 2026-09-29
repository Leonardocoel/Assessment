import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Salário mensal: R$ ");
        double salarioMensal = scanner.nextDouble();
        scanner.nextLine();

        double salario = salarioMensal * 12;

        double imposto;

        if (salario <= 22847.76) {
            imposto = 0;
        } else if (salario <= 33919.80) {
            imposto = (salario - 22847.76) * 0.075;
        } else if (salario <= 45012.60) {
            imposto = (33919.80 - 22847.76) * 0.075
                    + (salario - 33919.80) * 0.15;
        } else {
            imposto = (33919.80 - 22847.76) * 0.075
                    + (45012.60 - 33919.80) * 0.15
                    + (salario - 45012.60) * 0.275;
        }

        double salarioLiquido = salario - imposto;

        System.out.println("\nIMPOSTO DE RENDA");
        System.out.println("Nome: " + nome);
        System.out.printf("Salário bruto anual: R$ %.2f%n", salario);
        System.out.printf("Imposto a pagar: R$ %.2f%n", imposto);
        System.out.printf("Salário líquido anual: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}