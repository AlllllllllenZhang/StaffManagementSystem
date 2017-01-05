

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author allen
 */
public class ManagerSystem extends javax.swing.JFrame {
PreQuery query;
DialogOne dialog;
Connection con;
PreparedStatement pstmt;
  ResultSet rs = null;

    public ManagerSystem() {
    initComponents();
        setTitle("管理系统-操作界面");
        query=new PreQuery();
        
    }

 public void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Account = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Number = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        IDNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Birth = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Title = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Branch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        addInformation = new javax.swing.JButton();
        deleteInformation = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("账号");

        jLabel2.setText("姓名");

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });

        jLabel3.setText("工号");

        jLabel4.setText("身份证号");

        jLabel5.setText("生日");

        jLabel6.setText("职务");

        jLabel7.setText("部门");

        jLabel8.setText("密码");

        addInformation.setForeground(new java.awt.Color(0, 0, 204));
        addInformation.setText("添加信息");
        addInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addInformationActionPerformed(evt);
            }
        });

        deleteInformation.setForeground(new java.awt.Color(255, 0, 0));
        deleteInformation.setText("删除信息");
        deleteInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteInformationActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(102, 0, 102));
        jButton3.setText("更改信息");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(255, 204, 0));
        jButton4.setText("查询信息");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText("重置");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setForeground(new java.awt.Color(153, 153, 255));
        jButton6.setText("退出");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addInformation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteInformation))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(Branch, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(Birth, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(148, 148, 148)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(IDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(IDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Birth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Branch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addInformation)
                    .addComponent(deleteInformation))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }
public void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
this.dispose();
System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    public void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
Account.setText("");
Number.setText("");
IDNumber.setText("");
Name.setText("");
Birth.setText("");
Title.setText("");
Branch.setText("");
Password.setText(""); // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    public void addInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addInformationActionPerformed
 int m = 0;
        String sql = "insert into Staff values(?,?,?,?,?,?,?,?)";
        pstmt = dbConn.getPreparedState("Staff", sql);
    try {
        pstmt.setString(1, Account.getText().trim());
         pstmt.setString(2,Number.getText().trim());
            pstmt.setString(3,Name.getText().trim());
            pstmt.setString(4,IDNumber.getText().trim());
            pstmt.setString(5,Birth.getText().trim());
            pstmt.setString(6,Title.getText().trim());
            pstmt.setString(7,Branch.getText().trim());
            pstmt.setString(8,Password.getText().trim());
            m = pstmt.executeUpdate();
            if(m>0){
    JOptionPane.showMessageDialog(null, "添加信息成功");
query.setDatabaseName("Staff");
query.setSQL("select * from Staff where account='"+Account.getText().trim()+"'");
query.startQuery();
dialog=new DialogOne();
dialog.setZiduan(query.getColumnName());
dialog.setRecord(query.getRecord());
dialog.init();
dialog.setVisible(true);
}
else JOptionPane.showMessageDialog
        (null,"添加信息失败","消息对话框", JOptionPane.WARNING_MESSAGE);
    } catch (SQLException ex) {
    Logger.getLogger(ManagerSystem.class.getName()).log(Level.SEVERE, null, ex);
    }
    
// TODO add your handling code here:
    }//GEN-LAST:event_addInformationActionPerformed

    public void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    public void deleteInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteInformationActionPerformed
   int m=0;
        try {
        String sql="select * from Staff where account='"+Account.getText().trim()+"'";
        con=dbConn.getConn("Staff");
       Statement stmt = con.createStatement();
       rs=stmt.executeQuery(sql);
        if(rs.next()){
        query.setDatabaseName("Staff");
        query.setSQL(sql);
        query.startQuery();
        dialog=new DialogOne();
        dialog.setZiduan(query.getColumnName());
        dialog.setRecord(query.getRecord());
        dialog.init();
        dialog.setVisible(true);
con.close();
rs.close();
stmt.close();
        int n = JOptionPane.showConfirmDialog(null, "删除后数据无法恢复，是否继续？", "警告", JOptionPane.YES_NO_OPTION);
        if(n==0){
             sql = "delete from Staff where account='" +Account.getText().trim()+"'";
        con=dbConn.getConn("Staff");
stmt=con.createStatement();
m=stmt.executeUpdate(sql);
        if(m>0){
            JOptionPane.showMessageDialog(null, "删除信息成功");
        }else JOptionPane.showMessageDialog(null, "删除信息失败");
        }
        }
        
// TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(ManagerSystem.class.getName()).log(Level.SEVERE, null, ex);
    }finally{dbClose.queryClose(con, pstmt, rs);}
    }//GEN-LAST:event_deleteInformationActionPerformed

    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    try {
        String sql="update Staff set number='"+Number.getText().trim()+"',name='"+Name.getText().trim()+
                "',ID='"+IDNumber.getText().trim()+"',birth='"+Birth.getText().trim()+"',"
        + "title='"+Title.getText().trim()+"',branch='"+ Branch.getText().trim()
                +"',password='"+ Password.getText().trim()+"' where account='"+Account.getText().trim()+"'";
pstmt=dbConn.getPreparedState("Staff", sql);
int m=pstmt.executeUpdate();
if(m>0){
sql="select * from Staff where number='"+Number.getText().trim()+"'";
dialog=new DialogOne();
query.setDatabaseName("Staff");
query.setSQL(sql);
query.startQuery();
dialog.setZiduan(query.getColumnName());
dialog.setRecord(query.getRecord());
dialog.init();
dialog.setVisible(true);
 JOptionPane.showMessageDialog(null, "更新信息成功"); 
}
else  JOptionPane.showMessageDialog
        (null,"更新信息失败","消息对话框", JOptionPane.WARNING_MESSAGE); // TODO add your handling code here:
    } catch (SQLException ex) {
        Logger.getLogger(ManagerSystem.class.getName()).log(Level.SEVERE, null, ex);
    }finally{dbClose.addClose(con, pstmt);}
    }//GEN-LAST:event_jButton3ActionPerformed

    public void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String sql="select * from Staff";
query.setDatabaseName("Staff");
query.setSQL(sql);
query.startQuery();
dialog=new DialogOne();
dialog.setZiduan(query.getColumnName());
dialog.setRecord(query.getRecord());
dialog.init();
dialog.setVisible(true);
 }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Account;
    public javax.swing.JTextField Birth;
    public javax.swing.JTextField Branch;
    public javax.swing.JTextField IDNumber;
    public javax.swing.JTextField Name;
    public javax.swing.JTextField Number;
    public javax.swing.JPasswordField Password;
    public javax.swing.JTextField Title;
    public javax.swing.JButton addInformation;
    public javax.swing.JButton deleteInformation;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
