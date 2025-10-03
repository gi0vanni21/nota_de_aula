package questao04_letra_A;

public class Medico {
    protected String nome;
    protected String crm;

    public Medico(String nome, String crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public void atenderPaciente() {
        System.out.println("O médico " + nome + " está atendendo um paciente.");
    }

    public String getNome() {
        return nome;
    }

    public String getCrm() {
        return crm;
    }
}

