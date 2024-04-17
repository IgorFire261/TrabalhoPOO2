public class MaisOvo implements Decorator{
    private Hamburguer h;
    public MaisOvo(Hamburguer h){
        this.h = h;
    }
    @Override
    public void adicionais() {
        System.out.println("Adicional de ovo");
        h.setPreco(2.0);
    }
    
}
