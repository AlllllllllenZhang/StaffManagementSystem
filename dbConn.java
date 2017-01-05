
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allen
 */
public class dbConn {

 
    public static PreparedStatement getPreparedState(String databaseName,String sql){
//创建一个基于databaseName为数据库名，sql语句为执行语句的与数据库的连接     
Connection con;
       PreparedStatement pstmt = null;
     try {
             Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
             con=DriverManager.getConnection("jdbc:derby:"+databaseName+";create=true");
             pstmt=con.prepareStatement(sql);
         } catch (ClassNotFoundException | SQLException ex) {
             Logger.getLogger(dbConn.class.getName()).log(Level.SEVERE, null, ex);
         }
      return pstmt;
 }   
    public static Connection getConn(String databaseName){
//创建一个基于databaseName为数据库名的与数据库的连接    
 Connection con = null;
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
             con=DriverManager.getConnection("jdbc:derby:"+databaseName+";create=true");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dbConn.class.getName()).log(Level.SEVERE, null, ex);
        }
            return con;
    
    }
 
}
