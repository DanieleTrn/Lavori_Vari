package daoexcercise.daoclasses;

import daoexcercise.interfaces.DaoInterface;
import daoexcercise.classes.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonaDao implements DaoInterface<Persona>{
    
    public PersonaDao() throws SQLException{

    }
    
    @Override
    public ArrayList<Persona> getAsList() throws SQLException{
        ArrayList<Persona> persone = new ArrayList();
        Connection myDb = ConnectionDb.getConnection();
        String query = "SELECT cf_paziente,nome,cognome FROM paziente";
        PreparedStatement myPs = myDb.prepareStatement(query);
        ResultSet myRs = myPs.executeQuery();
        
        while(myRs.next()){
            String cf = myRs.getString(1);
            String nome = myRs.getString(2);
            String cognome = myRs.getString(3);
            Persona p = new Persona(cf,nome,cognome);
            persone.add(p);
        }
        
        return persone;
    }

    @Override
    public void addToDb(Persona elem) {
        try {
            System.out.println("Aggiungo " + elem);
            Connection myDb = ConnectionDb.getConnection();
            String query = "INSERT INTO paziente(cf_paziente,nome,cognome,data_nascita,telefono,indirizzo) values('"
                    + elem.getCf()+"','"
                    + elem.getNome()+"','"
                    + elem.getCognome()
                    +"',\"1980-01-01\",\"30000000\",\"via fasulla,80\");";
            System.out.println(query);
            PreparedStatement ps = myDb.prepareStatement(query);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateElem(Persona elem, String[] params) {
        try {
            String query = "UPDATE paziente SET "
                    + "cf_paziente ='"+params[0]+"',"
                    + "nome ='" + params[1]+"',"
                    + "cognome='" + params[2]+"'"
                    + " WHERE cf_paziente ='" + elem.getCf()+"'";
            Connection myDb = ConnectionDb.getConnection();
            PreparedStatement ps = myDb.prepareStatement(query);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public void removeElem(Persona elem) {
        try {
            Connection myDb = ConnectionDb.getConnection();
            String query = "DELETE FROM paziente WHERE cf_paziente = '"
                            + elem.getCf() + "'";
            PreparedStatement ps = myDb.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
}
