
public class Main {
    public static void main(String[] args) {

        /*
        Apresente o valor do salário atual e adicione 100 até que chegue em 5000
         */

        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println();

        int salario = 1000;
        System.out.println("O salário atual é R$ " + salario);

        while (salario < 5000) {
            salario += 100;

            if (salario < 5000) {
                System.out.println("O salário ainda é R$ " + salario);
            }
        }
        System.out.println("O salário final agora é R$ " + salario);

        System.out.println();
        System.out.println("===================================");
        System.out.println("===================================");
    }
}