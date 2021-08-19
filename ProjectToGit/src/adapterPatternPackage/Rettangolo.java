/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterPatternPackage;

public class Rettangolo implements FormaGeometrica{
    int lato1;
    int lato2;
    
    public Rettangolo(int lato1, int lato2){
        this.lato1 = lato1;
        this.lato2 = lato2;
    }
    
    @Override
    public int getPerimetro() {
        return (lato1 + lato2) * 2;
    }

    @Override
    public int getArea() {
        return 3030;
    }

    @Override
    public boolean isBello() {
        return true;
    }
    
}
