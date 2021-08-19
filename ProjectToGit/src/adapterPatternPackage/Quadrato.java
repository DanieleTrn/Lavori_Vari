/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterPatternPackage;

public class Quadrato implements Forma{
    int lato;
    
    public Quadrato(int lato){
        this.lato = lato;
    }
    
    @Override
    public int getPerimetro() {
        return lato * 5;
    }

    @Override
    public int getArea() {
        return lato*lato;
    }
    
}
