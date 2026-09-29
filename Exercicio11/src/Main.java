import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] sorteados = new int[6];
        for (int i = 0; i < 6; i++) {
            sorteados[i] = random.nextInt(60) + 1;
        }

        int[] jogados = new int[6];
        System.out.println("Digite 6 números entre 1 e 60:");

        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                String entrada = scanner.nextLine().trim();
                try {
                    int n = Integer.parseInt(entrada);
                    if (n < 1 || n > 60) {
                        System.out.println("Número fora do intervalo. Tente novamente.");
                        continue;
                    }
                    jogados[i] = n;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Digite um número inteiro.");
                }
            }
        }

        int acertos = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (jogados[i] == sorteados[j]) {
                    acertos++;
                    break;
                }
            }
        }

        Arrays.sort(sorteados);
        Arrays.sort(jogados);

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Números sorteados: " + Arrays.toString(sorteados));
        System.out.println("Seus números:      " + Arrays.toString(jogados));
        System.out.println("Acertos: " + acertos);

        scanner.close();
    }
}