package FactoryPatternEx;

public class FormaFactory {
    
    public static Forma getForma(String classe){
        if(classe.equalsIgnoreCase("Triangolo")){
            return new Triangolo();
        }else if(classe.equalsIgnoreCase("Quadrato")){
            return new Quadrato();
        }
        return null;
    }
}
