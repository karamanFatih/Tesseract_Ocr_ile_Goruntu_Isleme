
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import java.sql.*;

public class MysqlConnect {
    
    
    public Connection conn() throws ClassNotFoundException, SQLException{
    
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection( "jdbc:mysql://localhost:3306/arsiv1", "root", "12345678");

            /*Statement stmt = con.createStatement();
           /* ResultSet rs = stmt.executeQuery("select * from fisdepo");
            /*while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            }*/
   
    return  con;
    }
       
    
    }

  












