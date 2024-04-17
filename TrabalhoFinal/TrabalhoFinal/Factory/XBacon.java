package Factory;

public class XBacon implements Hamburguer{
    private double preco = 0.0;

    @Override
    public void preparar() {
        Cozinha c = new Cozinha();
        preco +=  c.montagem(1);
    }
    @Override
    public double getPreco(){
        return preco;
    }
    @Override
    public void setPreco(double preco){
        this.preco = preco;
    }
}
