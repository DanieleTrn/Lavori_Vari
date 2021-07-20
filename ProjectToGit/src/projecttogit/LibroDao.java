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
        if(this.libri.contains(elem)){
            for(Libro l : libri){
                if(l.equals(elem)){
                    Integer isbn = Integer.parseInt(params[0]);
                    l.setIsbn(isbn);
                    l.setNomeLibro(params[1]);
                    return true;
                }
            }
        }else{
            return false;
        }
        return false;
    }

    @Override
    public boolean removeElem(Libro elem) {
        for(Libro l : libri){
            if(elem.equals(l)){
                this.libri.remove(elem);
                return true;
            }
        }  
        return false;
    }
    
}
