package gestioncongreso;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    
        private static Connection con = null;
        private static final Driver driver= new com.microsoft.sqlserver.jdbc.SQLServerDriver();
        private static String url="jdbc:sqlserver://localhost:1433;databaseName=GestionCongreso";
        
        public static Connection getConnection() throws SQLException{
            DriverManager.registerDriver(driver);
            con=DriverManager.getConnection(url,"AdminCongreso","12345678");
                       
            return con;
        }
        
        
        
        
    }

