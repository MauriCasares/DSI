package gestioncongreso;


import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    
        private static Connection con;
        private static final Driver driver= new com.microsoft.sqlserver.jdbc.SQLServerDriver();
        private static String url="jdbc:sqlserver://localhost:1433;databaseName=GestionCongreso";
        
        public static Connection getConnection() throws SQLException{
            DriverManager.registerDriver(driver);
            //con=DriverManager.getConnection(url,"AdminCongreso","12345678");
            con=DriverManager.getConnection(url,"sa","12345678");  
            
            return con;
        }
    }

