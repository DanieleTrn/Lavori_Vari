package daoexcercise.daoclasses;

import java.sql.Connection;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDb {
    static Connection conn;

    public ConnectionDb() {
    }
    
    public static Connection getConnection() throws SQLException{
        if(null == conn){
            MysqlDataSource ds = new MysqlDataSource();
            ds.setServerName("localhost");
            ds.setUser("root");
            ds.setPassword("");
            ds.setDatabaseName("studio_medico");
            ds.setPortNumber(3306);
            return conn = ds.getConnection();
        }
        return conn;
    }
}