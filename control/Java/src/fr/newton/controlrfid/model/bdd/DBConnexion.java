package fr.newton.controlrfid.model.bdd;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnexion {
    private static DataSource dataSource;

    public DBConnexion(String dbName) throws SQLException {
        try {
            dataSource = (DataSource) new InitialContext().lookup("java:comp/env/"+dbName);
        } catch (NamingException e) {
            throw new SQLException(dbName + "is missing in JNDI: ; " + e.getMessage());
        }
    }

    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }
    public static Connection getMySQLConnection() throws SQLException, IOException {
        if(! DBStatic.mysql_pooling){
            try{
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
            }
            return (DriverManager.getConnection("jdbc:mysql://"+
                    DBStatic.getMysql_host() + "/"+
                    DBStatic.getMysql_db() ,
                    DBStatic.getMysql_username(),
                    DBStatic.getMysql_password()));
        }else{
            return new DBConnexion("jdbc/db").getConnection();
        }
    }
}
