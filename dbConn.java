
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
//����һ������databaseNameΪ���ݿ�����sql���Ϊִ�����������ݿ������     
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
//����һ������databaseNameΪ���ݿ����������ݿ������    
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
