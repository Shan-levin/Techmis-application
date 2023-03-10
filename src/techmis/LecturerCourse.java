/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techmis;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author shan
 */
public class LecturerCourse extends javax.swing.JFrame {

    /**
     * Creates new form LecturerCourse
     */
    public LecturerCourse() {
        initComponents();
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
        LecId = new javax.swing.JTextField();
        Back = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        SubId = new javax.swing.JTextField();
        DepartmentId = new javax.swing.JTextField();
        SubName = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        View = new javax.swing.JButton();
        CoId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LecId.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel1.add(LecId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 190, 50));

        Back.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, -1));

        Update.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        jPanel1.add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 580, -1, -1));

        SubId.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel1.add(SubId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 180, 50));

        DepartmentId.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel1.add(DepartmentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 190, 50));

        SubName.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel1.add(SubName, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 400, 50));

        Search.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Lecture ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Subject ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Subject Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Department ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        View.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        View.setText("View");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });
        jPanel1.add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, 90, 40));

        CoId.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jPanel1.add(CoId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 200, 50));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Course ID");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Course Details");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("900");
        getAccessibleContext().setAccessibleDescription("700");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String search = SubId.getText();
        course co = new course();
        
        ResultSet rs = co.searchCourse(search);
        try {
            if(rs.next())
            {
               DepartmentId.setText(rs.getString("sub_d_id"));
               SubName.setText(rs.getString("sub_name"));
               LecId.setText(rs.getString("lec_id"));
               CoId.setText(rs.getString("sub_co_id"));
            }
            else
            {
                 javax.swing.JOptionPane.showMessageDialog(null, "Data not in the table");
                 clearCourse();
            }
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"error....");
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        WelcomeLecturer inter = new WelcomeLecturer();  // back to the user profiles
        inter.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
       course co = new course();
       
       co.setCourseDepId(DepartmentId.getText());
       co.setCourseSubId(SubId.getText());
       co.setCourseSubName(SubName.getText());
       co.setCourseLecId(LecId.getText());
       co.setCourseCoId(CoId.getText());
       
       co.editCourse();

       clearCourse();
    }//GEN-LAST:event_UpdateActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        ViewCourseDetails co = new ViewCourseDetails();
        co.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewActionPerformed

    public void clearCourse()
    {
        DepartmentId.setText(null);
        SubId.setText(null);
        SubName.setText(null);
        LecId.setText(null);
        CoId.setText(null);
    }
    
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
            java.util.logging.Logger.getLogger(LecturerCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</edSubCode
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTextField CoId;
    private javax.swing.JTextField DepartmentId;
    private javax.swing.JTextField LecId;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SubId;
    private javax.swing.JTextField SubName;
    private javax.swing.JButton Update;
    private javax.swing.JButton View;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
