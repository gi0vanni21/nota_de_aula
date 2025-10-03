package questao04_letra_A;

public class ClinicoGeral extends Medico {

    public ClinicoGeral(String nome, String crm) {
        super(nome, crm);
    }

    public void prescreverReceita() {
        System.out.println("O clínico geral " + nome + " está prescrevendo uma receita.");
    }

    @Override
    public void atenderPaciente() {
        System.out.println("O clínico geral " + nome + " está realizando uma consulta de rotina.");
    }
}

