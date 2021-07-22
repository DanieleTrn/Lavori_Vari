package projecttogit;

import classes.Libro;
import FactoryPatternEx.*;

public class avvio {

    public static void main(String[] args) {
        System.out.println("\n**************************************\nDAO Pattern\n\n");
        LibroDao bookList = new LibroDao();
        bookList.addToList(new Libro(999,"libro3"));
        bookList.removeElem(new Libro(12345,"libro1"));
        for(Libro l : bookList.getWholeList()){
            System.out.println(l);
        }
        System.out.println("\n**************************************\nFactory Method\n\n");
        Quadrato quad = (Quadrato) FormaFactory.getForma("Quadrato");
        Triangolo tri = (Triangolo) FormaFactory.getForma("Triangolo");
    
        tri.draw();
        quad.draw();
    }
    
}
