public class StategyCartao implements Strategy{

    @Override
    public void formaDePagamento(double valor) {
        System.out.println("Pagando " + valor + " no cartão!");
    }
}
