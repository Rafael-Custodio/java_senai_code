import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Exercício: Verificação de login
        Escreva um programa que solicita ao usuário um nome de usuário e uma senha.
        Verifique se o nome de usuário é "admin" e se a senha é "senha123".
        Exiba uma mensagem indicando se o login foi bem-sucedido ou não.
        */

        Scanner scanner = new Scanner(System.in);
        String usuario;
        String senha;

        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println();

        System.out.print("Digite o nome de usuário: ");
        usuario = scanner.next();

        System.out.print("Digite a sua senha: ");
        senha = scanner.next();


        if (usuario.equals("admin") && senha.equals("senha123")) {
            System.out.println();
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println();
            System.out.println("Nome de usuário e/ou senha incorreto(s).");
        }

        System.out.println();
        System.out.println("===================================");
        System.out.println("===================================");
    }
}