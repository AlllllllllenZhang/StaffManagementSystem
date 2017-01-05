
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allen
 */
public  final class dbClose {
    public static void addClose(Connection con,PreparedStatement pstmt){
    if(con!=null&&pstmt!=null){
        try {
            con.close();
             pstmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(dbClose.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//关闭与数据库的连接
    }
    public static void queryClose(Connection con,PreparedStatement pstmt,ResultSet rs){
    if(rs!=null&&pstmt!=null&&con!=null){
        try {
            rs.close();
            pstmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(dbClose.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    }//关闭与数据库的连接
}
