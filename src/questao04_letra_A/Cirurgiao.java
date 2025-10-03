package questao04_letra_A;

public class Cirurgiao extends Medico {

    public Cirurgiao(String nome, String crm) {
        super(nome, crm);
    }

    public void realizarCirurgia() {
        System.out.println("O cirurgião " + nome + " está realizando uma cirurgia.");
    }

    @Override
    public void atenderPaciente() {
        System.out.println("O cirurgião " + nome + " está avaliando o paciente para cirurgia.");
    }
}


