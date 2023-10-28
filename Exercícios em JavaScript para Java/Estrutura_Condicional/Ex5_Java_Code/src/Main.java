import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Exercício: Verificação de idade
        Escreva um programa que solicita o ano de nascimento de uma pessoa
        e verifica se ela é maior de 18 anos.
        Exiba uma mensagem indicando se a pessoa é maior de idade ou não.
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("===================================");
        System.out.println();

        //Pegando a data do sistema
        Calendar calendario = GregorianCalendar.getInstance();
        //Variável que recebe e guarda o ano atual
        int anoAtual = calendario.get(Calendar.YEAR);

        //Recebendo a data de nascimento usuario
        System.out.print("Digite o ano do seu nascimento: ");
        //Variável que recebe e guarda o ano de nascimento
        int anoNasc = scanner.nextInt();

        if ((anoNasc <= 0) && (anoNasc > anoAtual)) {
            System.out.println("Ano digitado invalido.");
        } else {
            int Nasc = anoNasc * 365;
            int Atual = anoAtual * 365;
            System.out.println();
            System.out.println("Você tem " + (Atual - Nasc) + " dias ou " + ((Atual - Nasc) / 31) + " meses ou " + ((Atual - Nasc) / 365) + " anos.");
        }

        //Fazendo o cálculo de IDADE e salvando na variável idade
        int idade = anoAtual-anoNasc;

        System.out.println();
        if (idade >= 18) {
            System.out.println("Você É MAIOR de idade.");

        } else {
            System.out.println("Você NÃO É maior de idade.");
        }

//        Mais uma maneira de fazer, utilizando a data de nascimento completa, e respondendo ao usuários os dias, meses e anos de vida.
//        System.out.println("Digite a data de nascimento (dd/MM/yyyy): ");
//        LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//        Period idade = Period.between(date, LocalDate.now());
//
//        System.out.println();
//        System.out.println(idade);
//        System.out.println();
//
//        if (idade.getYears() >= 18){
//            System.out.println("A pessoa tem mais de 18 anos.");
//        }else {
//            System.out.println("A pessoa não tem mais de 18 anos.");
//        }


//        Mais uma maneira de fazer, utilizando a data de nascimento completa
//        //pegando a data do sistema
//        Calendar cal = GregorianCalendar.getInstance();
//        int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
//        int mesAtual = cal.get(Calendar.MONTH) + 1;
//        int anoAtual = cal.get(Calendar.YEAR);
//
//        //recebendo a data de nascimento usuario
//        Scanner in = new Scanner(System.in);
//        System.out.println("Dia em que você nasceu: ");
//        int diaNasc = in.nextInt();
//        if ((diaNasc<=0) && (diaNasc>31))
//        {
//            System.out.println("Dia Invalido");
//        }
//        else
//        {
//            System.out.println("Mes em que você nasceu: ");
//            int mesNasc = in.nextInt();
//            if ((mesNasc<=0) && (mesNasc>12))
//            {
//                System.out.println("Mes invalido");
//            }
//            else
//            {
//                System.out.println("Ano em que você nasceu: ");
//                int anoNasc = in.nextInt();
//                if ((anoNasc<=0) && (anoNasc>anoAtual))
//                {
//                    System.out.println("Ano Invalido");
//                }
//                else
//                {
//                    int Nasc = anoNasc*365;
//                    Nasc = Nasc+(mesNasc*31);
//                    Nasc = Nasc+diaNasc;
//                    int Atual = anoAtual*365;
//                    Atual = Atual+(mesAtual*31);
//                    Atual = Atual+diaAtual;
//
//                    System.out.println("Você tem "+(Atual-Nasc)+" dias ou "+((Atual-Nasc)/31)+" meses ou "+((Atual-Nasc)/365)+" anos.");
//                }


        System.out.println();
        System.out.println("===================================");
        System.out.println("===================================");

    }
}