package projecttogit;

//import FactoryPatternEx.*;
import daoexcercise.daoclasses.LibroDao;
import daoexcercise.classes.Libro;
import daoexcercise.classes.Persona;
import daoexcercise.daoclasses.PersonaDao;
import java.sql.SQLException;
import java.util.ArrayList;
import adapterPatternPackage.*;
import strategyPatternPackage.*;

public class avvio {

    public static void main(String[] args) throws SQLException {
        SortAlgorithm s1 = new StrategySortBubble();
        SortAlgorithm s2 = new StrategySortMerge();
        
        s1.sort();
        s2.sort();
    }
}
    