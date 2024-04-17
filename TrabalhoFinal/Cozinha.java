public class Cozinha{
    //private double preco;
    
    public double montagem(int i) {
        if(i == 1){
            System.out.println("Montar x-bacon");  
            return 9.5;
        }else if(i == 2){
            System.out.println("Montar x-burguer");
            return  8.5;
        }else if(i == 3){
            System.out.println("Montar x-salada");
            return 7.5;
        }
        return 0.0;
    }
    
}
