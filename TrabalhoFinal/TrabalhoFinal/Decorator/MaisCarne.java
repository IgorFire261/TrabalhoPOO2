package Decorator;
import Factory.Hamburguer;

public class MaisCarne implements Decorator{
    private Hamburguer h;
    public MaisCarne(Hamburguer h){
        this.h = h;
    }
    @Override
    public void adicionais() {
        System.out.println("Adicional de carne");
        h.setPreco(4.0);
    }
}
