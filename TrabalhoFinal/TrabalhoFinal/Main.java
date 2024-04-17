
import Strategy.StategyCartao;
import Strategy.Strategy;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)  throws ClassNotFoundException{
    
        Strategy s = new StategyCartao();
        Fachada fachada = new Fachada(s);

        Cliente cliente1 = new Cliente(1, "Cliente 1", 20.0);
        Cliente cliente2 = new Cliente(2, "Cliente 2", 30.0);

        List<Integer> pedidosCliente1 = new ArrayList<>();
        pedidosCliente1.add(1);
        pedidosCliente1.add(2);
        List<Integer> adicionaisCliente1 = new ArrayList<>();
        adicionaisCliente1.add(1);
        adicionaisCliente1.add(2); 
        cliente1.setPedidos(pedidosCliente1);

        List<Integer> pedidosCliente2 = new ArrayList<>();
        pedidosCliente2.add(3);
        pedidosCliente2.add(2);
        List<Integer> adicionaisCliente2 = new ArrayList<>();
        adicionaisCliente2.add(1); 
        adicionaisCliente2.add(0); 
        cliente2.setPedidos(pedidosCliente2);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        List<List<Integer>> adicionaisClientes = new ArrayList<>();
        adicionaisClientes.add(adicionaisCliente1);
        adicionaisClientes.add(adicionaisCliente2);

        fachada.fazerPedido(clientes, adicionaisClientes);

        /*double total = fachada.getTotal();
        System.out.println("_________________________");
        System.out.println("Total do dia: " + total);*/
    }
}
