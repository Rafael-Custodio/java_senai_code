import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Exercício: Verificação de dia da semana
        Escreva um programa que solicita ao usuário um número de 1 a 7
        representando um dia da semana e exibe o nome correspondente a esse dia.
        Considere que 1 representa segunda-feira, 2 representa terça-feira
        e assim por diante.
        */

        Scanner scanner = new Scanner(System.in);
        int num;
        String dia = "";

        System.out.println("===================================");
        System.out.println("===================================");



            System.out.println();
            System.out.print("Digite um número inteiro, de 1 a 7 para saber o dia da semana: ");
            num = scanner.nextInt();
            System.out.println();


            switch (num) {
                case 1:
                    dia = "segunda-feira";
                    System.out.println("O número " + num + " corresponde a " + dia + ".");
                    break;
                case 2:
                    dia = "terça-feira";
                    System.out.println("O número " + num + " corresponde a " + dia + ".");
                    break;
                case 3:
                    dia = "quarta-feira";
                    System.out.println("O número " + num + " corresponde a " + dia + ".");
                    break;
                case 4:
                    dia = "quinta-feira";
                    System.out.println("O número " + num + " corresponde a " + dia + ".");
                    break;
                case 5:
                    dia = "sexta-feira";
                    System.out.println("O número " + num + " corresponde a " + dia + ".");
                    break;
                case 6:
                    dia = "sábado";
                    System.out.println("O número " + num + " corresponde a " + dia + ".");
                    break;
                case 7:
                    dia = "domingo";
                    System.out.println("O número " + num + " corresponde a " + dia + ".");
                    break;
                default:
                    System.out.println("Você é burro ???\nEra para digitar um número inteiro, de 1 a 7 para saber o dia da semana.");
                    break;
            }


        System.out.println();
        System.out.println("===================================");
        System.out.println("===================================");
    }
}