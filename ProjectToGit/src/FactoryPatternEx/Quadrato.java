package FactoryPatternEx;

public class Quadrato extends Forma{
    int nAngoli;
    
    @Override
    float getArea() {
        return 3;
    }

    @Override
    void draw() {
        System.out.println("Quadrato");
    }

    @Override
    int getNumAngoli() {
        return 4;
    }
    
}
