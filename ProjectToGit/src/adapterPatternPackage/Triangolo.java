package adapterPatternPackage;

public class Triangolo implements Forma{
    int lato1;
    int lato2;
    int lato3;
    
    public Triangolo(int lato1, int lato2, int lato3){
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
    
    @Override
    public int getPerimetro() {
        return lato1 + lato2 + lato3;
    }

    @Override
    public int getArea() {
        return 5990;
    }
    
}
