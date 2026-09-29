import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine().trim();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine().trim();

        String[] mensagens = new String[10];
        String[] autores = new String[10];

        System.out.println();

        for (int i = 0; i < 10; i++) {
            String autor = (i % 2 == 0) ? usuario1 : usuario2;

            System.out.print(autor + ", digite sua mensagem: ");
            String texto = scanner.nextLine();

            mensagens[i] = texto;
            autores[i] = autor;
        }

        System.out.println("\n===== Histórico de Mensagens =====");
        for (int i = 0; i < 10; i++) {
            System.out.println(autores[i] + ": " + mensagens[i]);
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês!");

        scanner.close();
    }
}