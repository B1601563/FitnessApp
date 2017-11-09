/*  
 */
package fitnessapp;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author celine_yin
 */
public class TrainerMenuFrame extends javax.swing.JFrame {
    private HFGUI hfgui;
    private Trainer theTrainer;
    /**
     * Creates new form TrainerMenuFrame
     */
    public TrainerMenuFrame(HFGUI theParent, Trainer theTrainer) {
        super();
        initComponents();
        setTitle("Trainer Menu");
        setSize(600, 400);
        // set location to center of screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
        // make HFGUI the parent of this Frame
        hfgui = theParent;

        // make HFGUI not visible
        hfgui.setVisible(false);
        
        this.theTrainer = theTrainer;
        
        // Display personalized welcome message for trainer
        welcomeMsgLbl.setText("Welcome, " + theTrainer.getFullName());
        
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeMsgLbl = new javax.swing.JLabel();
        editProfileBtn = new javax.swing.JButton();
        viewTrainingBtn = new javax.swing.JButton();
        recordNewSessionBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeMsgLbl.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        welcomeMsgLbl.setForeground(new java.awt.Color(0, 0, 153));
        welcomeMsgLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        welcomeMsgLbl.setText("Welcome, trainer.");

        editProfileBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        editProfileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessapp/editProfileIcon.png"))); // NOI18N
        editProfileBtn.setText(" Edit Profile");
        editProfileBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileBtnActionPerformed(evt);
            }
        });

        viewTrainingBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        viewTrainingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessapp/trainHistIcon.png"))); // NOI18N
        viewTrainingBtn.setText(" View Training History");
        viewTrainingBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewTrainingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTrainingBtnActionPerformed(evt);
            }
        });

        recordNewSessionBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        recordNewSessionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessapp/createSessionIcon.png"))); // NOI18N
        recordNewSessionBtn.setText(" Record New Session");
        recordNewSessionBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        recordNewSessionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordNewSessionBtnActionPerformed(evt);
            }
        });

        logOutBtn.setBackground(new java.awt.Color(255, 51, 51));
        logOutBtn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        logOutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fitnessapp/logoutIcon.png"))); // NOI18N
        logOutBtn.setText(" Log Out");
        logOutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("What would you like to do?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(welcomeMsgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(viewTrainingBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(recordNewSessionBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(editProfileBtn)))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeMsgLbl)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recordNewSessionBtn)
                    .addComponent(editProfileBtn))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewTrainingBtn)
                    .addComponent(logOutBtn))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileBtnActionPerformed
        EditTrainerProfileDialog etpDialog = new EditTrainerProfileDialog(hfgui, true, theTrainer);
        etpDialog.setVisible(true);
    }//GEN-LAST:event_editProfileBtnActionPerformed

    private void viewTrainingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTrainingBtnActionPerformed
        TrainerTrainingHistoryDialog tthDialog = new TrainerTrainingHistoryDialog(hfgui, true, theTrainer);
        tthDialog.setVisible(true);
    }//GEN-LAST:event_viewTrainingBtnActionPerformed

    private void recordNewSessionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordNewSessionBtnActionPerformed
        RecordNewSessionDialog rnsDialog = new RecordNewSessionDialog(hfgui, true, theTrainer);
        rnsDialog.setVisible(true);
    }//GEN-LAST:event_recordNewSessionBtnActionPerformed

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        this.dispose();
        hfgui.setVisible(true);
        hfgui.setEnabled(true);
    }//GEN-LAST:event_logOutBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TrainerMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainerMenuFrame(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editProfileBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton recordNewSessionBtn;
    private javax.swing.JButton viewTrainingBtn;
    private javax.swing.JLabel welcomeMsgLbl;
    // End of variables declaration//GEN-END:variables
}
