package questao04_letra_A;

public class Main {
    public static void main(String[] args) {
        ClinicoGeral cg = new ClinicoGeral("João", "12345");
        Cirurgiao cir = new Cirurgiao("Maria", "67890");

        cg.atenderPaciente();
        cg.prescreverReceita();

        cir.atenderPaciente();
        cir.realizarCirurgia();
    }
}

