package questao04_letra_B;

public class Vendedor {
    private String nome;
    private int matricula;

    public Vendedor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Pedido emitirPedido(int numero, String data, double valorTotal, Cliente cliente) {
        Pedido pedido = new Pedido(numero, data, valorTotal, this, cliente);
        cliente.adicionarPedido(pedido);
        return pedido;
    }

    public String getNome() {
        return nome;
    }
}

