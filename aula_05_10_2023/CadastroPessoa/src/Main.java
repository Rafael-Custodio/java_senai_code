import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // sout = snipet para printar algo na tela
        System.out.println("==========================================================================");
        System.out.println("==========================================================================");
        System.out.println(" ");

        ArrayList<PessoaFisica> listaPf = new ArrayList<>();
        PessoaFisica metodosPf = new PessoaFisica();

        // sout = snipet para printar algo na tela
        System.out.println("Bem vindo ao sistema de cadastro de Pessoa Física e Pessoa Jurídica.");

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            // sout = snipet para printar algo na tela
            System.out.println(" ");
            System.out.println("Escolha uma opção:\n 1 = Pessoa Física.\n 2 = Pessoa Jurídica.\n 0 = Sair.");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    int opcaoPf;
                    do {
                        System.out.println("Escolha uma opção:\n 1 = Cadastrar Pessoa Física\n 2 = Listar Pessoa Física\n 0 = Voltar ao menu anterior.");
                        opcaoPf = scanner.nextInt();

                        switch (opcaoPf){
                            case 1:
                                PessoaFisica pessoaFisica1 = new PessoaFisica();
                                Endereco endPessoa1 = new Endereco();

                                System.out.println("Digite o nome da pessoa física: ");
                                pessoaFisica1.nome = scanner.next();

                                System.out.println("Digite o CPF: ");
                                pessoaFisica1.cpf = scanner.next();

                                System.out.println("Digite o rendimento mensal (digite somente números): ");
                                pessoaFisica1.rendimento = scanner.nextInt();

                                System.out.println("Digite a data de nascimento (dd/MM/yyyy): ");
                                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                Period periodo = Period.between(date, LocalDate.now());

                                pessoaFisica1.dataNacimento = date;

                                if (periodo.getYears() >= 18){
                                    System.out.println("A pessoa tem mais de 18 anos.");
                                }else {
                                    System.out.println("A pessoa não tem mais de 18 anos.");
                                    break;
                                }

                                System.out.println("Digite o logradouro: ");
                                endPessoa1.logradouro = scanner.next();

                                System.out.println("Digite o número: ");
                                endPessoa1.numero = scanner.next();

                                System.out.println("Este endereço é comercial ? S/N: ");
                                String endCom;
                                endCom = scanner.next();

                                // equalsIgnoreCase = ignorar letras maiúsculas ou minúsculas
                                if (endCom.equalsIgnoreCase("S")){
                                    endPessoa1.enderecoComercial = true;
                                }else {
                                    endPessoa1.enderecoComercial = false;
                                }

                                pessoaFisica1.endereco = endPessoa1;

                                listaPf.add(pessoaFisica1);

                                System.out.println("Cadastro realizado com sucesso.");

                                break;

                            case 2:
                                if (listaPf.size() > 0){
                                    for (PessoaFisica cadaPf : listaPf){
                                        System.out.println();
                                        System.out.println("Nome: " + cadaPf.nome);
                                        System.out.println("CPF: " + cadaPf.cpf);
                                        System.out.println("Data de Nascimento: " + cadaPf.dataNacimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                                        System.out.println("Endereço: " + cadaPf.endereco.logradouro + ", " + cadaPf.endereco.numero);
                                        System.out.println("Imposto a ser pago: " + metodosPf.CalcularImposto(cadaPf.rendimento));
                                        System.out.println();
                                        System.out.println("Digite 0 para continuar.");
                                        scanner.nextLine();
                                    }

                                    opcaoPf = scanner.nextInt();

                                }else {
                                    System.out.println("Lista Vazia.");
                                }
                                break;
                            case 0:
                                System.out.println("Voltando ao menu anterior.");
                                break;
                            default:
                                System.out.println("Você é burro ?!\n Digite uma opção válida.");
                                break;
                        }
                    }while (opcaoPf != 0);
                    break;
                case 2:
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o nosso sistema.");
                    break;
                default:
                    System.out.println("Você é burro ?!\n Digite uma opção válida.");
                    break;
            }


        }while (opcao != 0);

        // sout = snipet para printar algo na tela
        System.out.println(" ");
        System.out.println("==========================================================================");
        System.out.println("==========================================================================");
    }
}