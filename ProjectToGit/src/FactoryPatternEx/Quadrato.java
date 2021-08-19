package FactoryPatternEx;

public class Quadrato extends Forma{

    @Override
    public float getArea() {
        return (float) 3.42;
    }

    @Override
    public void drawForma() {
        System.out.println("Sono un quadrato");
    }

    @Override
    public int getNumAngoli() {
        return 4;
    }
    
}
