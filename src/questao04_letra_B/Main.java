package questao04_letra_B;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Vendedor vendedor1 = new Vendedor("Maria Souza", 101);

        vendedor1.emitirPedido(1, "02/10/2025", 150.0, cliente1);
        vendedor1.emitirPedido(2, "03/10/2025", 300.0, cliente1);

        cliente1.exibirPedidos();
    }
}

