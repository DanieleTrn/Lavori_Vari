package projecttogit;

import classes.Persona;
import interfaces.DaoInterface;
import java.util.ArrayList;

public class PersonaDao implements DaoInterface<Persona>{
    ArrayList<Persona> persone;
    
    public PersonaDao(){
        persone = new ArrayList();
        persone.add(new Persona("abcde","pippo","rossi"));
        persone.add(new Persona("zzzzz","luca","lucante"));
    }
    
    @Override
    public ArrayList<Persona> getWholeList() {
        return this.persone;
    }

    @Override
    public boolean addToList(Persona elem) {
        persone.add(elem);
        return true;
    }

    @Override
    public boolean updateElem(Persona elem, String[] params) {
        return true;
    }

    @Override
    public boolean removeElem(Persona elem) {
        return true;
    }
    
}
