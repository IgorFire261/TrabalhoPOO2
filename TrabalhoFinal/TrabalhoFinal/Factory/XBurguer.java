package Factory;

public class XBurguer implements Hamburguer{
    private double preco = 8.5;
    
    @Override
    public void preparar() {
        Cozinha c = new Cozinha();
        preco += c.montagem(2);
    }
    public double getPreco(){
        return preco;
    }
    
    @Override
    public void setPreco(double preco){
        this.preco = preco;
    }
}