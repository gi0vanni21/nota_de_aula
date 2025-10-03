package questao_02;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(int numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void consultarSaldo() {
        System.out.printf("Saldo da conta %d (%s): R$ %.2f%n ", numeroConta, titular, saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("", valor);
        } else {
            System.out.println(".");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("saque realizado com sucesso!%n", valor);
        } else {
            System.out.println("saldo insuficiente ou valor inválido.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.printf("Transferência realizada com sucesso", valor, destino.titular);
        } else {
            System.out.println("saldo insuficiente ou valor inválido.");
        }
    }
}

