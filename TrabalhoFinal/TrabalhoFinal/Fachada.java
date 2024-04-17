import java.util.ArrayList;
import java.util.List;

import Decorator.Decorator;
import Decorator.MaisCarne;
import Decorator.MaisOvo;
import Factory.Hamburguer;
import Factory.HamburguerFactory;
import Observer.Garcom;
import Observer.Obs;
import Strategy.Strategy;

public class Fachada {
    private Strategy formaDePagamento;
    private HamburguerFactory fabrica;
    private ArrayList<Obs> obs;
    private double total;

    public Fachada(Strategy formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
        this.fabrica = new HamburguerFactory();
        this.obs = new ArrayList<>();
    }

    public void addObserver(Obs observer) {
        obs.add(observer);
    }

    public void removeObserver(Obs observer) {
        obs.remove(observer);
    }

    private void notifyObserver() {
        for (Obs o : obs) {
            o.update(formaDePagamento, total);
        }
    }

    public void fazerPedido(List<Cliente> clientes, List<List<Integer>> adicionaisClientes) {
        Obs g = new Garcom();
        for (int i = 0; i < clientes.size(); i++) {
            addObserver(g);
            total = 0.0;
            System.out.println("--------------------");
            Cliente cliente = clientes.get(i);
            List<Integer> pedidos = cliente.getPedidos();
            List<Integer> adicionais = adicionaisClientes.get(i);
            for (int j = 0; j < pedidos.size(); j++) {
                Integer pedido = pedidos.get(j);
                Integer adicional = adicionais.get(j);
                Hamburguer h = fabrica.hamburguerFactory(pedido);
                h.setPreco(0.0);
                if (adicional == 1) {
                    Decorator d = new MaisCarne(h);
                    d.adicionais();
                } else if (adicional == 2) {
                    Decorator d = new MaisOvo(h);
                    d.adicionais();
                }
                h.preparar();
                //total += h.getPreco();
            }
            notifyObserver();
            removeObserver(g);
        }
    }

    public double getTotal() {
        return this.total;
    }
}
