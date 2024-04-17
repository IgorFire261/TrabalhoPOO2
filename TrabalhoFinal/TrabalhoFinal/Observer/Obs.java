package Observer;
import Strategy.Strategy;

public interface Obs {
    public void update(Strategy s, double t);
}
