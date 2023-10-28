import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Faça um programa que fique em loop enquanto o usuário não digitar a senha "123"
         */

        System.out.println("===================================");
        System.out.println("===================================");


        Scanner scanner = new Scanner(System.in);

        String senha;

        do {
            System.out.println();
            System.out.print("Digite a senha: ");
            senha = scanner.next();

            if (!senha.equals("123")){
                System.out.println("Senha incorreta!");
            }
        }while (!senha.equals("123"));

        System.out.println("SENHA CORRETA!");

        System.out.println();
        System.out.println("===================================");
        System.out.println("===================================");
    }
}