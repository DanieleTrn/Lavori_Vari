package FactoryPatternEx;

public class Triangolo extends Forma{

    @Override
    public float getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drawForma() {
        System.out.println("Sono un triangolo");
    }

    @Override
    public int getNumAngoli() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
