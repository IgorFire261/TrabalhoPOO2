public class XSalada implements Hamburguer {
    private double preco = 7.5;

    @Override
    public void preparar() {
        Cozinha c = new Cozinha();
        preco += c.montagem(3);
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void setPreco(double preco) {
        this.preco = preco;
    }
}