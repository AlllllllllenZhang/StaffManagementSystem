

import javax.swing.*;
public class DialogOne extends JDialog {
   JTable table;
   String ziduan[];
   String record[][];
   DialogOne() {
      setTitle("��ʾ��¼");
      setBounds(600,400,400,600);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   }
   public void setZiduan(String []ziduan){
      this.ziduan=ziduan;
   }
   public void setRecord(String [][]record){
      this.record=record;
   }
   public void init() {
       table = new JTable(record,ziduan);
       add(new JScrollPane(table));
   }
//��������ֵ�Ա�����ʽ���ֳ���
}