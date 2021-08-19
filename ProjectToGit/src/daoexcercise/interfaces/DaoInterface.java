package daoexcercise.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

public interface DaoInterface<T> {
    ArrayList<T> getAsList() throws SQLException;
    public void addToDb(T elem);
    public void updateElem (T elem, String[] params);
    public void removeElem (T elem);
}
