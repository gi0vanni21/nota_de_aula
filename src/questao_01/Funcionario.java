package questao_01;

public class Funcionario{
    private int matricula;
    private String nome;
    private  double salariobruto;

    public Funcionario(int matriculo, String nome, double salariobruto) {
        this.matricula = matricula;
        this.nome = nome;
        this.salariobruto = salariobruto;
    }

    public double calcularInss(){
        return salariobruto * 0.15;
    }
    public double calcularsalarioliquido(){
        return salariobruto - calcularInss();
    }
    public void contracheque(){
        System.out.println("\n===contracheque===\n");
        System.out.println("matricula: " +matricula);
        System.out.println("nome: " +nome);
        System.out.println("salariobruto: " +salariobruto);
        System.out.println("desconto inss(15%): " +calcularInss());
        System.out.println("salariobruto: " +calcularsalarioliquido());
    }
}