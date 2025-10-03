package questao_01;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("digite a matricula: ");
        int matricula = sc.nextInt();
        sc.nextLine();

        System.out.print("digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("digite seu salario: ");
        double salariobruto = sc.nextDouble();

        Funcionario funcionario = new Funcionario(matricula, nome, salariobruto);

        funcionario.contracheque();
        sc.close();
    }
}
