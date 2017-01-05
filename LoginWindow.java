

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LoginWindow extends JFrame {

 
    Connection con;
    Statement stmt;
    ResultSet rs;
    String sql;
   //提前声明内容
    public LoginWindow() {
         initComponents();
//创建框架            
setTitle("员工管理系统");
           //设置框架的标题
            setVisible(true);
        
    }

public void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Account = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
//定义框架内各元素

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("微软雅黑 Light", 0, 18)); // NOI18N
        jLabel1.setText("员工管理系统");
//设置元素的字体以及显示字符等属性
        jLabel2.setFont(new java.awt.Font("微软雅黑 Light", 0, 12)); // NOI18N
        jLabel2.setText("账号");

        Account.setFont(new java.awt.Font("微软雅黑 Light", 0, 12)); // NOI18N
        Account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccountActionPerformed(evt);
            }
        });//为账号输入栏添加监视器

        jLabel3.setFont(new java.awt.Font("微软雅黑 Light", 0, 12)); // NOI18N
        jLabel3.setText("密码");
//设置元素的字体以及显示字符等属性
        Password.setFont(new java.awt.Font("微软雅黑 Light", 0, 12)); // NOI18N

        jButton1.setFont(new java.awt.Font("微软雅黑 Light", 0, 12)); // NOI18N
        jButton1.setText("登录");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });//添加监视器

        jButton2.setFont(new java.awt.Font("微软雅黑 Light", 0, 12)); // NOI18N
        jButton2.setText("重置");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("微软雅黑 Light", 0, 12)); // NOI18N
        jButton3.setText("取消");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
//设置布局
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(63, 63, 63)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Account, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(Password)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Account, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();
System.exit(0);// TODO add your handling code here:
    }//取消按钮的接口方法

    public void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Account.setText("");
Password.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public void AccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountActionPerformed

    public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
con=dbConn.getConn("Staff"); 
        try {
            sql="select * from admin where account='"+Account.getText().trim()+"' and password='"+Password.getText().trim()+"'";
            stmt=con.createStatement();
            rs=stmt.executeQuery(sql);
            if(rs.next()){
            new ManagerSystem().setVisible(true);
            this.dispose();
            }
            else JOptionPane.showMessageDialog
                   (null,"登陆错误","用户名/密码错误",JOptionPane.YES_NO_OPTION);
// TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(LoginWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//登录按钮的接口方法

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 new LoginWindow().setVisible(true);
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Account;
    public javax.swing.JPasswordField Password;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
