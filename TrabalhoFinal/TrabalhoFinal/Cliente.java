import java.util.List;

public class Cliente {
    private Integer id;
    private String nome;
    private List<Integer> pedidos;
    private Double pagamento;

    public Cliente(Integer id, String nome, Double pagamento) {
        this.id = id;
        this.nome = nome;
        this.pagamento = pagamento;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Integer> getPedidos() {
        return pedidos;
    }

    public Double getPagamento() {
        return pagamento;
    }

    public void setPedidos(List<Integer> pedidos) {
        this.pedidos = pedidos;
    }
}
