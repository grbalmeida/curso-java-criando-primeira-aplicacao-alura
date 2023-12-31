import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;

        System.out.println("*****************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*****************************");

        StringBuilder menu = new StringBuilder();
        menu.append("\n** Digite sua opção **");
        menu.append("\n1 - Consultar saldo");
        menu.append("\n2 - Transferir valor");
        menu.append("\n3 - Receber valor");
        menu.append("\n4 - Sair");

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("O saldo atualizado é: " + saldo);
                    break;
                case 2:
                    System.out.println("Qual o valor que deseja transferir?");
                    double valor = leitura.nextDouble();

                    if (valor > saldo) {
                        System.out.println("Não há saldo para realizar a transferência");
                    } else {
                        saldo -= valor;
                        System.out.println("Novo saldo: " + saldo);
                    }

                    break;
                case 3:
                    System.out.println("Valor recebido: ");
                    double valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.println("Novo saldo: " + saldo);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
