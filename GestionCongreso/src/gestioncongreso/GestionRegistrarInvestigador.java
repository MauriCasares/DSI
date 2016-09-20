
package gestioncongreso;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.database.Database;

public class GestionRegistrarInvestigador {
    
    public static void main(String[] args) {
        Connection con = null;
        try {
            Calendar d= Calendar.getInstance();
            long fecha = d.getTimeInMillis();
            java.sql.Date dia = new java.sql.Date(fecha);
            con=DataBase.getConnection();
            System.out.println("SE CONECTO");
            Statement stm = con.createStatement();
            SimpleDateFormat f= new SimpleDateFormat("YYYY - MM - DD");
            //String rs="INSERT INTO UNIVERSIDAD VALUES(01,'UTN','FRC', '"+ dia +"' )";
            //int upd= stm.executeUpdate(rs);
            //if(upd!=0) System.out.println("SE MODIFICO");
            CompuestoLugares C= new CompuestoLugares();
            String[] s=C.getNombreJerarquia(1, null);
            for (String s1 : s) {
                System.out.println(s1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
