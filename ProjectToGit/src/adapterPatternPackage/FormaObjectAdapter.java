package adapterPatternPackage;

public class FormaObjectAdapter implements Forma{
    
    FormaGeometrica adaptee;
    
    public FormaObjectAdapter(FormaGeometrica forma){
        this.adaptee = forma;
    }
    
    @Override
    public int getPerimetro() {
        return adaptee.getPerimetro();
    }

    @Override
    public int getArea() {
        return adaptee.getPerimetro();
    }
    
}
