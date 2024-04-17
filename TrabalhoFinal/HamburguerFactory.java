public class HamburguerFactory {
    public Hamburguer hamburguerFactory(int hamburguer){
        if(hamburguer ==  1){
            return new XBacon();
        }else if(hamburguer == 2){
            return new XBurguer();
        }
        else if(hamburguer == 3){
            return new XSalada();
        }else{
            return null;
        }
        
    }
}
