import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine().trim();

        if (nome.isEmpty()) {
            System.out.println("O nome nao pode ser vazio. Encerrando...");
            scanner.close();
            return;
        }

        while (true) {
            System.out.print("Digite uma senha: ");
            String senha = scanner.nextLine();

            String erro = validarSenha(senha);

            if (erro == null) {
                System.out.println("\nSenha cadastrada com sucesso!");
                System.out.println("Bem-vindo(a), " + nome + "!");
                break;
            }

            System.out.println("Senha invalida: " + erro);
            System.out.println("Tente novamente.\n");
        }

        scanner.close();
    }

    public static String validarSenha(String senha) {
        if (senha == null || senha.length() < 8) {
            return "deve ter no mínimo 8 caracteres.";
        }

        boolean temMaiuscula = false;
        boolean temNumero = false;
        boolean temEspecial = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            } else if (Character.isDigit(c)) {
                temNumero = true;
            } else if (!Character.isLetterOrDigit(c)) {
                temEspecial = true;
            }
        }

        if (!temMaiuscula) {
            return "deve conter pelo menos uma letra MAIÚSCULA.";
        }
        if (!temNumero) {
            return "deve conter pelo menos um NUMERO.";
        }
        if (!temEspecial) {
            return "deve conter pelo menos um CARACTERE ESPECIAL (@, #, $, etc.).";
        }

        return null;
    }
}