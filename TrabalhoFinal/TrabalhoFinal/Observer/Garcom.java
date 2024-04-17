package Observer;
import Strategy.Strategy;

public class Garcom implements Obs{
    public void update(Strategy s, double t) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Pedido pronto!");
        s.formaDePagamento(t);
    }
}
