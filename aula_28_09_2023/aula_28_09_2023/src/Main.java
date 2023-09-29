import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o salário: ");

        // final = const
        final float salario = leitor.nextFloat();

        if (salario < 1000){
            var novoSalario = salario * 1.1f;

            // sout = snipet
            System.out.println(novoSalario);
        }else {
            System.out.println("Salário dentro da faixa.");
        }
    }
}