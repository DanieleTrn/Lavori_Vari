package daoexcercise.daoclasses;

import daoexcercise.interfaces.DaoInterface;
import java.util.ArrayList;
import daoexcercise.classes.Libro;

public class LibroDao implements DaoInterface<Libro>{
    ArrayList<Libro> libri = new ArrayList();
    
    public LibroDao(){
        
    }
    @Override
    public ArrayList<Libro> getAsList() {
        
    }

    @Override
    public void addToList(Libro elem) {
        
    }

    @Override
    public void updateElem(Libro elem, String[] params) {
        
    }

    @Override
    public void removeElem(Libro elem) {

    }
    
}
