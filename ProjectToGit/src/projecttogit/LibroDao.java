package projecttogit;

import interfaces.DaoInterface;
import java.util.ArrayList;
import classes.Libro;

public class LibroDao implements DaoInterface<Libro>{
    ArrayList<Libro> libri = new ArrayList();
    
    public LibroDao(){
        libri.add(new Libro(12345,"libro1"));
        libri.add(new Libro(493843,"libro2"));
    }
    @Override
    public ArrayList<Libro> getWholeList() {
        return libri;
    }

    @Override
    public boolean addToList(Libro elem) {
        libri.add(elem);
        return true;
    }

    @Override
    public boolean updateElem(Libro elem, String[] params) {
        
    }

    @Override
    public boolean removeElem(Libro elem) {
        
    }
    
}
