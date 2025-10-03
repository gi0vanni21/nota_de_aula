package questao_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filme filme = null;
        int opcao;

        do {
            System.out.println("\n=== CADASTRO DE FILME ===");
            System.out.println("1 - Cadastrar título");
            System.out.println("2 - Exibir detalhes do título");
            System.out.println("3 - Avaliar título");
            System.out.println("4 - Mostrar média de avaliações");
            System.out.print("escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do filme: ");
                    String nome = sc.nextLine();
                    System.out.print("Digite o gênero: ");
                    String genero = sc.nextLine();
                    System.out.print("Digite o ano de lançamento: ");
                    int ano = sc.nextInt();
                    System.out.print("Digite a duração (em minutos): ");
                    int duracao = sc.nextInt();

                    filme = new Filme(nome, genero, ano, duracao);
                    System.out.println("Filme cadastrado com sucesso!");
                    break;

                case 2:
                    if (filme != null) {
                        filme.exibirDetalhes();
                    } else {
                        System.out.println("Nenhum filme cadastrado!");
                    }
                    break;

                case 3:
                    if (filme != null) {
                        System.out.print("Digite uma nota (0 a 10): ");
                        int nota = sc.nextInt();
                        filme.avaliar(nota);
                    } else {
                        System.out.println("Nenhum filme cadastrado!");
                    }
                    break;

                case 4:
                    if (filme != null) {
                        double media = filme.calcularMediaAvaliacoes();
                        if (media == 0.0) {
                            System.out.println("O filme ainda não possui avaliações.");
                        } else {
                            System.out.printf("Média das avaliações: ", media);
                        }
                    } else {
                        System.out.println("Nenhum filme cadastrado!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 5);

        sc.close();
    }
}

