package questao_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta1 = new ContaBancaria(101, "João");
        ContaBancaria conta2 = new ContaBancaria(202, "Maria");

        int opcao;
        do {
            System.out.println("\n===== MENU BANCÁRIO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta1.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double dep = sc.nextDouble();
                    conta1.depositar(dep);
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double saque = sc.nextDouble();
                    conta1.sacar(saque);
                    break;
                case 4:
                    System.out.print("Digite o valor da transferência: ");
                    double transf = sc.nextDouble();
                    conta1.transferir(conta2, transf);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        sc.close();
    }
}
