package FactoryPatternEx;

public class Triangolo extends Forma{

    @Override
    public float getArea() {
        return 6;
    }

    @Override
    public void draw() {
        System.out.println("Triangolo");
    }

    @Override
    public int getNumAngoli() {
        return 3;
    }
    
}
