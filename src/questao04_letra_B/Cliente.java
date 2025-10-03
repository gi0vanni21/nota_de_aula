package questao04_letra_B;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private List<Pedido> pedidos;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void exibirPedidos() {
        System.out.println("\nPedidos do cliente " + nome + ":");
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }

    public String getNome() {
        return nome;
    }
}
