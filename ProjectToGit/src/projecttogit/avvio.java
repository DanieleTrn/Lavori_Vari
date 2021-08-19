package projecttogit;

//import FactoryPatternEx.*;
import daoexcercise.daoclasses.LibroDao;
import daoexcercise.classes.Libro;
import daoexcercise.classes.Persona;
import daoexcercise.daoclasses.PersonaDao;
import java.sql.SQLException;
import java.util.ArrayList;
import adapterPatternPackage.*;

public class avvio {

    public static void main(String[] args) throws SQLException {
        ArrayList<Forma> forme = new ArrayList();
        forme.add(new Quadrato(3));
        forme.add(new FormaObjectAdapter(new Rettangolo(2,2)));
        
        for(Forma f : forme){
            System.out.println(f);
        }
    }
    
    
    
}
