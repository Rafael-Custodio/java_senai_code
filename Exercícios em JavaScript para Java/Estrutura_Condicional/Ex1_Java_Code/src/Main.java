import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Você irá gerar uma média de duas notas,
        e caso a nota seja maior ou igual a 6 (seis),
        precisa aparecer uma mensagem de parabéns,
        caso não seja maior ou igual a 6,
        informe ao usuário que ele não passou.
        */

        Scanner scanner = new Scanner(System.in);
        float nota1;
        float nota2;
        float media;

        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println();


        System.out.print("Digite a primeira nota (não utilize \"ponto\"): ");
        nota1 = scanner.nextFloat();

        System.out.print("Digite a segunda nota (não utilize \"ponto\"): ");
        nota2 = scanner.nextFloat();

        media = (nota1 + nota2) / 2;

        System.out.println();
        System.out.println("A média das duas notas digitadas é: " + media);

        System.out.println();
        System.out.println("===================================");
        System.out.println("===================================");

    }
}