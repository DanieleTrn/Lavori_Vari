package interfaces;

import java.util.ArrayList;

public interface DaoInterface<T> {
    ArrayList<T> getWholeList();
    boolean addToList(T elem);
    boolean updateElem (T elem, String[] params);
    boolean removeElem (T elem);
}
