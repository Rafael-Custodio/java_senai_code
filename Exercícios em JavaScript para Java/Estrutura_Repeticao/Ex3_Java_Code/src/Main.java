import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Faça um programa que receba um número do usuário
        e continue a pedir o numero se o numero for diferente de 0.
         */

        System.out.println("===================================");
        System.out.println("===================================");

        Scanner scanner = new Scanner(System.in);

        int numero;

        do {
            System.out.println();
            System.out.print("Digite um número inteiro qualquer, ou zero para sair do loop: ");
            numero = scanner.nextInt();
        }while (numero != 0);

        System.out.println();
        System.out.println("===================================");
        System.out.println("===================================");
    }
}