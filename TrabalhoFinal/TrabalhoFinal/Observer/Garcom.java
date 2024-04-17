package Observer;
import Strategy.Strategy;

public class Garcom implements Obs{
    public void update(Strategy s, double t){
        System.out.println("Pedido pronto!");
        s.formaDePagamento(t);
    }
}
