
public class Main {
    public static void main(String[] args) {
        /*
        Listar professores e verificar posição na lista
        Se o numero for par, escreva "par" e o numero correspondente
        Se o numero for impar, escreva "impar" e o numero correspondente
        Se for zero, escreva "zero"
         */

        System.out.println("===================================");
        System.out.println("===================================");

        String[] professores = {"Alana", "Aléxia", "Jéssica", "Odirlei", "Possarle", "Samantha", "Thiago"};

        for (int contador = 0; contador < professores.length; contador++) {
            System.out.println();
            System.out.println("O índice atual é: " + contador);

            if (contador == 0) {
            //if (contador.equals(0){

                System.out.println("O número de indice do(a) professor(a) " + professores[contador] + " é Zero.");
            } else if (contador % 2 == 0) {
                System.out.println("O número de indice do(a) professor(a) " + professores[contador] + " é PAR.");
            } else {
                System.out.println("O número de indice do(a) professor(a) " + professores[contador] + " é ÍMPAR.");
            }
        }

        System.out.println();
        System.out.println("===================================");
        System.out.println("===================================");

    }
}