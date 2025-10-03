package questao04_letra_B;

public class Pedido {
    private int numero;
    private String data;
    private double valorTotal;
    private Vendedor vendedor;
    private Cliente cliente;

    public Pedido(int numero, String data, double valorTotal, Vendedor vendedor, Cliente cliente) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
        this.vendedor = vendedor;
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Pedido Nº " + numero + " | Data: " + data +
                " | Valor: R$ " + valorTotal +
                " | Vendedor: " + vendedor.getNome();
    }
}

