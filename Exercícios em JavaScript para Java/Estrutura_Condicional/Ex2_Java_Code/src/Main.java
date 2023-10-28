import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Faça um programa que receba um número inteiro do usuário
         e informe se este número é positivo ou negativo.
         */

        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println();

        System.out.print("Digite um número inteiro, positivo ou negativo: ");
        num = scanner.nextInt();
        System.out.println();

        if (num > 0){
            System.out.println("O número digitado foi " + num + " e ele é POSITIVO.");
        } else if (num < 0) {
            System.out.println("O número digitado foi " + num + " e ele é NEGATIVO.");
        }else {
            System.out.println("O número digitado foi " + num + " e ele é NULO.");
        }

        System.out.println();
        System.out.println("===================================");
        System.out.println("===================================");
    }
}
