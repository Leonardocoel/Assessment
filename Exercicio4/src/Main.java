import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Valor do empréstimo: R$ ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        int parcelas;
        while (true) {
            System.out.print("Número de parcelas (6 a 48): ");
            parcelas = scanner.nextInt();
            scanner.nextLine();

            if (parcelas >= 6 && parcelas <= 48) {
                break;
            }
            System.out.println("Quantidade inválida. Digite um valor entre 6 e 48.");
        }

        double taxaMensal = 0.03;
        double total = valor * Math.pow(1 + taxaMensal, parcelas);
        double parcelaMensal = total / parcelas;

        System.out.println("\nSIMULAÇÃO DE EMPRÉSTIMO");
        System.out.println("Cliente: " + nome);
        System.out.printf("Valor solicitado: R$ %.2f%n", valor);
        System.out.printf("Parcelas: %d x de R$ %.2f%n", parcelas, parcelaMensal);
        System.out.printf("Total a pagar: R$ %.2f%n", total);

        scanner.close();
    }
}