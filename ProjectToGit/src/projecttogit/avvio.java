package projecttogit;

import classes.Libro;

public class avvio {

    public static void main(String[] args) {
        LibroDao bookList = new LibroDao();
        bookList.addToList(new Libro(999,"libro3"));
        bookList.removeElem(new Libro(12345,"libro1"));
        for(Libro l : bookList.getWholeList()){
            System.out.println(l);
        }
    }
    
}
