package FactoryPatternEx;

public class Quadrato extends Forma{
    int nAngoli;
    
    @Override
    public float getArea() {
        return 3;
    }

    @Override
    public void draw() {
        System.out.println("Quadrato");
    }

    @Override
    public int getNumAngoli() {
        return 4;
    }
    
}
