/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techmis;

/**
 *
 * @author shan
 */
public class WelcomeStudent extends javax.swing.JFrame {

    /**
     * Creates new form student
     */
    public WelcomeStudent() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Notice = new javax.swing.JButton();
        Profile = new javax.swing.JButton();
        CourseDetails = new javax.swing.JButton();
        Attendance = new javax.swing.JButton();
        Medicals = new javax.swing.JButton();
        GradeGPA = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(900, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("WELCOME");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 190, 60));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notice.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 110, 120));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 90, 120));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/courseDetail.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 90, 120));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/studentAttendance.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 110, 120));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/medical.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 110, 120));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gpa1.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 110, 120));

        Notice.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Notice.setText("Notice");
        Notice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoticeActionPerformed(evt);
            }
        });
        jPanel1.add(Notice, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 110, 40));

        Profile.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Profile.setText("Profile");
        Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileActionPerformed(evt);
            }
        });
        jPanel1.add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 110, 40));

        CourseDetails.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        CourseDetails.setText("Course Details");
        CourseDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CourseDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(CourseDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 190, 40));

        Attendance.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Attendance.setText("Attendance");
        Attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendanceActionPerformed(evt);
            }
        });
        jPanel1.add(Attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 170, 40));

        Medicals.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        Medicals.setText("Medical");
        Medicals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicalsActionPerformed(evt);
            }
        });
        jPanel1.add(Medicals, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 130, 40));

        GradeGPA.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        GradeGPA.setText("Grade & Marks");
        GradeGPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeGPAActionPerformed(evt);
            }
        });
        jPanel1.add(GradeGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 220, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CourseDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CourseDetailsActionPerformed
       StViewCourseDetail course = new StViewCourseDetail();
       course.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_CourseDetailsActionPerformed

    private void ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileActionPerformed
       UpdateStudentProfile profile=new UpdateStudentProfile();
       profile.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_ProfileActionPerformed

    private void AttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendanceActionPerformed
       StudentAttendanceView attendance = new StudentAttendanceView();
       attendance.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_AttendanceActionPerformed

    private void MedicalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicalsActionPerformed
       StudentMedicalView medical = new StudentMedicalView();
       medical.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_MedicalsActionPerformed

    private void GradeGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeGPAActionPerformed
       StudentViewCA grade = new StudentViewCA();
       grade.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_GradeGPAActionPerformed

    private void NoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoticeActionPerformed
       StudentNoticeView notice = new StudentNoticeView();
       notice.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_NoticeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       StudentLogin notice = new StudentLogin();
       notice.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Attendance;
    private javax.swing.JButton CourseDetails;
    private javax.swing.JButton GradeGPA;
    private javax.swing.JButton Medicals;
    private javax.swing.JButton Notice;
    private javax.swing.JButton Profile;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
