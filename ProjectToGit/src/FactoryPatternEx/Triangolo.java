package FactoryPatternEx;

public class Triangolo extends Forma{

    @Override
    float getArea() {
        return 6;
    }

    @Override
    void draw() {
        System.out.println("Triangolo");
    }

    @Override
    int getNumAngoli() {
        return 3;
    }
    
}
