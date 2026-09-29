import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] produtos = new String[3];
        int[] quantidades = new int[3];
        double[] precos = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("--- Compra " + (i + 1) + " ---");

            System.out.print("Produto: ");
            produtos[i] = scanner.nextLine();

            quantidades[i] = lerInteiro(scanner, "Quantidade: ");
            precos[i] = lerDouble(scanner, "Preço unitário: R$ ");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("compras.txt"))) {
            for (int i = 0; i < 3; i++) {
                writer.write(produtos[i] + ";" + quantidades[i] + ";" + precos[i]);
                writer.newLine();
            }
            System.out.println("\nArquivo compras.txt gravado com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao gravar o arquivo: " + e.getMessage());
        }

        System.out.println("\n=== COMPRAS REGISTRADAS ===");

        try (BufferedReader reader = new BufferedReader(new FileReader("compras.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] partes = linha.split(";");
                String produto = partes[0];
                int quantidade = Integer.parseInt(partes[1]);
                double preco = Double.parseDouble(partes[2]);
                double total = quantidade * preco;

                System.out.printf("%s | Qtd: %d | Unit.: R$ %.2f | Total: R$ %.2f%n",
                        produto, quantidade, preco, total);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scanner.close();
    }

    private static int lerInteiro(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número inteiro.");
            }
        }
    }

    private static double lerDouble(Scanner scanner, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String entrada = scanner.nextLine().trim().replace(",", ".");
            try {
                return Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Digite um número (ex: 150.00 ou 150,00).");
            }
        }
    }
}