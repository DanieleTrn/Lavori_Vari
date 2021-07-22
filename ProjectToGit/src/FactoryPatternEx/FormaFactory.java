package FactoryPatternEx;

public class FormaFactory {
    public static Forma getForma(String forma){
        if(forma.equalsIgnoreCase("quadrato")){
            return new Quadrato();
        }else if(forma.equalsIgnoreCase("triangolo")){
            return new Triangolo();
        }
        return null;
    }
}
