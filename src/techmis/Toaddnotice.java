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
public class Toaddnotice extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form Toaddnotice
     */
    public Toaddnotice() {
        initComponents();
        con = MyConnection.getConnection();
        show_note();
    }
    public ArrayList<ToNote> noteList(){
        ArrayList<ToNote> noteList = new ArrayList<>();
        try{
            String query1="SELECT * FROM notice";
            Statement st= con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            
            ToNote note;
                while(rs.next()){
                     note=new ToNote(rs.getInt("no"),rs.getString("date"),rs.getString("title"),rs.getString("notice"));
                    noteList.add(note);
                }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return noteList;
    }public void show_note(){
        ArrayList<ToNote> list = noteList();
        DefaultTableModel model =(DefaultTableModel)displatnotice.getModel();
        Object[] row = new Object [5];
        for(int i=0;i<list.size();i++){
            row[0]= list.get(i).getno();
            row[1]= list.get(i).getdate();
            row[2]= list.get(i).gettitle();
            row[3]= list.get(i).getnotice();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        displatnotice = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nobox = new javax.swing.JTextField();
        datebox = new javax.swing.JTextField();
        titlebox = new javax.swing.JTextField();
        noticebox = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("NOTICE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        displatnotice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "no", "date", "title", "notice"
            }
        ));
        displatnotice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displatnoticeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(displatnotice);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 550, 246));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("No");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("DATE");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Title");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Notice");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));
        jPanel1.add(nobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 160, 46));

        datebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateboxActionPerformed(evt);
            }
        });
        jPanel1.add(datebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 160, 45));
        jPanel1.add(titlebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 160, 45));
        jPanel1.add(noticebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 160, 47));

        addbutton.setText("ADD");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(addbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 161, 48));

        updatebutton.setText("UPDATE");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(updatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 161, 48));

        deletebutton.setText("DELETE");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(deletebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 161, 48));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 90, 80));

        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        String day = datebox.getText();
        String title =titlebox.getText();
        String notice =noticebox.getText();


                if(!day.isEmpty()){
                    if(!title.isEmpty()){
                        if(!notice.isEmpty()){

                try {
                    String sql="insert into notice(date,title,notice) "
                    + " values('"+day+"','"+title+"','"+notice+"')";
                    pst = con.prepareStatement(sql);
                    pst.execute();
                    DefaultTableModel model = (DefaultTableModel)displatnotice.getModel();
                    model.setRowCount(0);
                    show_note();
                    JOptionPane.showMessageDialog(null,"Adding success");
                } catch (SQLException ex) {
                    Logger.getLogger(ToaddDepartment.class.getName()).log(Level.SEVERE, null, ex);
                }
                                }else{
                                    JOptionPane.showMessageDialog(null,"Insert Course Hours","error", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Insert Course Type","error", JOptionPane.ERROR_MESSAGE);
            }

            }else{
                    JOptionPane.showMessageDialog(null,"Insert Course Name","error", JOptionPane.ERROR_MESSAGE);
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_addbuttonActionPerformed

    private void dateboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateboxActionPerformed

    private void displatnoticeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displatnoticeMouseClicked
        int i = displatnotice.getSelectedRow();
        TableModel model =displatnotice.getModel();
        nobox.setText(model.getValueAt(i,0).toString());
        datebox.setText(model.getValueAt(i,1).toString());
        titlebox.setText(model.getValueAt(i,2).toString());
        noticebox.setText(model.getValueAt(i,3).toString());
        

        // TODO add your handling code here:
    }//GEN-LAST:event_displatnoticeMouseClicked

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        String no = nobox.getText();
        String day = datebox.getText();
        String title =titlebox.getText();
        String notice =noticebox.getText();


                if(!day.isEmpty()){
                    if(!title.isEmpty()){
                        if(!notice.isEmpty()){

                try {
            int row =displatnotice.getSelectedRow();
            String value = (displatnotice.getModel().getValueAt(row, 0).toString());
            String query ="Update notice set  date ='"+day+"',title ='"+title+"',notice ='"+notice+"' where no ='"+no+"' ";
            pst = con.prepareStatement(query);
            pst.execute();
            DefaultTableModel model = (DefaultTableModel)displatnotice.getModel();
                    model.setRowCount(0);
                    show_note();
                    JOptionPane.showMessageDialog(null,"Update Success");
            
        } catch (SQLException ex) {
                    Logger.getLogger(ToaddDepartment.class.getName()).log(Level.SEVERE, null, ex);
                }
                                }else{
                                    JOptionPane.showMessageDialog(null,"Insert Course Hours","error", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Insert Course Type","error", JOptionPane.ERROR_MESSAGE);
            }

            }else{
                    JOptionPane.showMessageDialog(null,"Insert Course Name","error", JOptionPane.ERROR_MESSAGE);
            }


        // TODO add your handling code here:
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        String no = nobox.getText();
        String day = datebox.getText();
        String title =titlebox.getText();
        String notice =noticebox.getText();


                if(!day.isEmpty()){
                    if(!title.isEmpty()){
                        if(!notice.isEmpty()){

                try {           String query = "delete from notice where no ='"+no+"' ";
            pst = con.prepareStatement(query);
            pst.execute();
            DefaultTableModel model = (DefaultTableModel)displatnotice.getModel();
                    model.setRowCount(0);
                    show_note();
                    JOptionPane.showMessageDialog(null,"Delete Success");
            
        } catch (SQLException ex) {
                    Logger.getLogger(ToaddDepartment.class.getName()).log(Level.SEVERE, null, ex);
                }
                                }else{
                                    JOptionPane.showMessageDialog(null,"Insert Course Hours","error", JOptionPane.ERROR_MESSAGE);
                            }
                        }else{
                            JOptionPane.showMessageDialog(null,"Insert Course Type","error", JOptionPane.ERROR_MESSAGE);
            }

            }else{
                    JOptionPane.showMessageDialog(null,"Insert Course Name","error", JOptionPane.ERROR_MESSAGE);
            }


        // TODO add your handling code here:
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        welcomeTO st = new welcomeTO();
        st.setVisible(true);
        this.setVisible(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Toaddnotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Toaddnotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Toaddnotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Toaddnotice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Toaddnotice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JTextField datebox;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTable displatnotice;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nobox;
    private javax.swing.JTextField noticebox;
    private javax.swing.JTextField titlebox;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables
}
