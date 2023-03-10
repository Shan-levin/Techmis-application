/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techmis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author HUNTER
 */
public class ToAttendanceView extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form AttendenceTO
     */
    public ToAttendanceView() {
        initComponents();
        con = MyConnection.getConnection();
        show_attendance();
    }
    
    public ArrayList<ToAttendance> attendenceList(){
        ArrayList<ToAttendance> attendenceList = new ArrayList<>();
        try{
            String query1="SELECT * FROM attendance";
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            
            ToAttendance attendence;
                while(rs.next()){
                    attendence=new ToAttendance(rs.getString("st_id"),rs.getString("sub_id"),rs.getDate("day"),rs.getString("type"),rs.getInt("hours"),rs.getInt("status"));
                    attendenceList.add(attendence);
                }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return attendenceList;
    }public void show_attendance(){
        ArrayList<ToAttendance> list =attendenceList();
        DefaultTableModel model =(DefaultTableModel)displayattendence.getModel();
        Object[] row = new Object [6];
        for(int i=0;i<list.size();i++){
            row[0]= list.get(i).getst_id();
            row[1]= list.get(i).getsub_id();
            row[2]= list.get(i).getday();
            row[3]= list.get(i).gettype();
            row[4]= list.get(i).gethours();
            row[5]= list.get(i).getstatus();
            model.addRow(row);
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        stidbox = new javax.swing.JTextField();
        subidbox = new javax.swing.JTextField();
        daybox = new javax.swing.JTextField();
        typebox = new javax.swing.JTextField();
        hoursbox = new javax.swing.JTextField();
        statusbox = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayattendence = new javax.swing.JTable();
        addbutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("ATTENDENCE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 330, 60));
        jPanel1.add(stidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 200, 36));

        subidbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subidboxActionPerformed(evt);
            }
        });
        jPanel1.add(subidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 200, 36));
        jPanel1.add(daybox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 200, 36));
        jPanel1.add(typebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 200, 35));
        jPanel1.add(hoursbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 200, 37));

        statusbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusboxActionPerformed(evt);
            }
        });
        jPanel1.add(statusbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 200, 36));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setText("Status");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Hours");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Day");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Type");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Sub_ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("St_ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        displayattendence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "st_id", "sub_id", "day", "type", "hours", "status"
            }
        ));
        displayattendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayattendenceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(displayattendence);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 654, 265));

        addbutton.setText("ADD");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(addbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 90, 50));

        updatebutton.setText("UPDATE");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(updatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 90, 50));

        deletebutton.setText("DELETE");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, 90, 50));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 90, 80));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subidboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subidboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subidboxActionPerformed

    private void statusboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusboxActionPerformed

    private void displayattendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayattendenceMouseClicked
        int i = displayattendence.getSelectedRow();
        TableModel model =displayattendence.getModel();
        stidbox.setText(model.getValueAt(i,0).toString());
        subidbox.setText(model.getValueAt(i,1).toString());
        daybox.setText(model.getValueAt(i,2).toString());
        typebox.setText(model.getValueAt(i,3).toString());
        hoursbox.setText(model.getValueAt(i,4).toString());
        statusbox.setText(model.getValueAt(i,5).toString());



        // TODO add your handling code here:
    }//GEN-LAST:event_displayattendenceMouseClicked

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed

        String StuID = stidbox.getText();
        String SubID =subidbox.getText();
        String day =daybox.getText();
        String type =typebox.getText();
        String hours =hoursbox.getText();
        String status = statusbox.getText();
        if(!StuID.isEmpty()){
            if(!SubID.isEmpty()){
                if(!day.isEmpty()){
                    if(!type.isEmpty()){
                        if(!hours.isEmpty()){
                            if(!status.isEmpty()){

                try {
                    String sql="insert into attendance(st_id,sub_id,day,type,hours,status) "
                    + " values('"+StuID+"','"+SubID+"','"+day+"','"+type+"','"+hours+"','"+status+"')";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                    DefaultTableModel model = (DefaultTableModel)displayattendence.getModel();
                    model.setRowCount(0);
                    show_attendance();
                    JOptionPane.showMessageDialog(null,"Adding success");
                } catch (SQLException ex) {
                    Logger.getLogger(ToaddDepartment.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                                    }else{
                                    JOptionPane.showMessageDialog(null,"Insert Attendence Status","error", JOptionPane.ERROR_MESSAGE);
                            }
                                }else{
                                    JOptionPane.showMessageDialog(null,"Insert Attendence Hours","error", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Insert Attendence Type","error", JOptionPane.ERROR_MESSAGE);
            }

            }else{
                    JOptionPane.showMessageDialog(null,"Insert Attendence Name","error", JOptionPane.ERROR_MESSAGE);
            }

        }else{
                JOptionPane.showMessageDialog(null,"Insert Attendence Department ID","error", JOptionPane.ERROR_MESSAGE);
        }
            
    }else{
            JOptionPane.showMessageDialog(null,"Insert Attendence ID","error", JOptionPane.ERROR_MESSAGE);
}



        // TODO add your handling code here:
    }//GEN-LAST:event_addbuttonActionPerformed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        String StuID = stidbox.getText();
        String SubID =subidbox.getText();
        String day =daybox.getText();
        String type =typebox.getText();
        String hours =hoursbox.getText();
        String status = statusbox.getText();
        if(!StuID.isEmpty()){
            if(!SubID.isEmpty()){
                if(!day.isEmpty()){
                    if(!type.isEmpty()){
                        if(!hours.isEmpty()){
                            if(!status.isEmpty()){
        
        try{
            int row =displayattendence.getSelectedRow();
            String value = (displayattendence.getModel().getValueAt(row, 0).toString());
            String query ="Update attendance set  day ='"+day+"',type ='"+type+"',hours ='"+hours+"',status ='"+status+"' "
                    + "where st_id ='"+StuID+"' and sub_id ='"+SubID+"'";
            pst = con.prepareStatement(query);
            pst.execute();
            DefaultTableModel model = (DefaultTableModel)displayattendence.getModel();
                    model.setRowCount(0);
                    show_attendance();
                    JOptionPane.showMessageDialog(null,"Update Success");
            
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);
        
        }
                                   }else{
                                    JOptionPane.showMessageDialog(null,"Insert Attendence Status","error", JOptionPane.ERROR_MESSAGE);
                            }
                                }else{
                                    JOptionPane.showMessageDialog(null,"Insert Attendence Hours","error", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Insert Attendence Type","error", JOptionPane.ERROR_MESSAGE);
            }

            }else{
                    JOptionPane.showMessageDialog(null,"Insert Attendence Name","error", JOptionPane.ERROR_MESSAGE);
            }

        }else{
                JOptionPane.showMessageDialog(null,"Insert Attendence Department ID","error", JOptionPane.ERROR_MESSAGE);
        }
            
    }else{
            JOptionPane.showMessageDialog(null,"Insert Attendence ID","error", JOptionPane.ERROR_MESSAGE);
}

        // TODO add your handling code here:
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        String StuID = stidbox.getText();
        String SubID =subidbox.getText();
        String day =daybox.getText();
        String type =typebox.getText();
        String hours =hoursbox.getText();
        String status = statusbox.getText();
        if(!StuID.isEmpty()){
            if(!SubID.isEmpty()){
                if(!day.isEmpty()){
                    if(!type.isEmpty()){
                        if(!hours.isEmpty()){
                            if(!status.isEmpty()){
               
        
        try{
           String query = "delete from attendance where st_id ='"+StuID+"'and sub_id ='"+SubID+"' and day ='"+day+"' and type ='"+type+"' and hours ='"+hours+"' and status='"+status+"'";
            pst = con.prepareStatement(query);
            pst.execute();
            DefaultTableModel model = (DefaultTableModel)displayattendence.getModel();
                    model.setRowCount(0);
                    show_attendance();
                    JOptionPane.showMessageDialog(null,"Delete Success");
            
        }catch(Exception e){JOptionPane.showMessageDialog(null, e);
        
        }
                                   }else{
                                    JOptionPane.showMessageDialog(null,"Insert Attendence Status","error", JOptionPane.ERROR_MESSAGE);
                            }
                                }else{
                                    JOptionPane.showMessageDialog(null,"Insert Attendence Hours","error", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Insert Attendence Type","error", JOptionPane.ERROR_MESSAGE);
            }

            }else{
                    JOptionPane.showMessageDialog(null,"Insert Attendence Name","error", JOptionPane.ERROR_MESSAGE);
            }

        }else{
                JOptionPane.showMessageDialog(null,"Insert Attendence Department ID","error", JOptionPane.ERROR_MESSAGE);
        }
            
    }else{
            JOptionPane.showMessageDialog(null,"Insert Attendence ID","error", JOptionPane.ERROR_MESSAGE);
}


        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        welcomeTO w1 = new welcomeTO();
        w1.show();
        dispose();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ToAttendanceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToAttendanceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToAttendanceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToAttendanceView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToAttendanceView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JTextField daybox;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTable displayattendence;
    private javax.swing.JTextField hoursbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField statusbox;
    private javax.swing.JTextField stidbox;
    private javax.swing.JTextField subidbox;
    private javax.swing.JTextField typebox;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
