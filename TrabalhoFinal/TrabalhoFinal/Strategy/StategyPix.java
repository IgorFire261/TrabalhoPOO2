package Strategy;
public class StategyPix implements Strategy {
    
    @Override
    public void formaDePagamento(double valor) {
        System.out.println("Pagando " + valor + " no PIX!");
    }
}
