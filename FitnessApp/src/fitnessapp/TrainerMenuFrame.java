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
    private HELPFit helpfit;
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
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        
        // make HFGUI the parent of this Frame
        hfgui = theParent;
        
        helpfit = hfgui.getHELPFit();

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
        jLabel2 = new javax.swing.JLabel();
        editProfileBtn = new javax.swing.JButton();
        viewTrainingBtn = new javax.swing.JButton();
        recordNewSessionBtn = new javax.swing.JButton();
        logOutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        welcomeMsgLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        welcomeMsgLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeMsgLbl.setText("Welcome, ");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("What would you like to do?");

        editProfileBtn.setText("Edit Profile");
        editProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileBtnActionPerformed(evt);
            }
        });

        viewTrainingBtn.setText("View Training History");
        viewTrainingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTrainingBtnActionPerformed(evt);
            }
        });

        recordNewSessionBtn.setText("Record New Training Session");
        recordNewSessionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordNewSessionBtnActionPerformed(evt);
            }
        });

        logOutBtn.setText("Log Out");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("https://icons8.com/icon/set/trainer/all");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(editProfileBtn)
                            .addComponent(viewTrainingBtn)
                            .addComponent(recordNewSessionBtn)
                            .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(welcomeMsgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeMsgLbl)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(editProfileBtn)
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(recordNewSessionBtn)
                .addGap(18, 18, 18)
                .addComponent(viewTrainingBtn)
                .addGap(50, 50, 50)
                .addComponent(logOutBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JButton recordNewSessionBtn;
    private javax.swing.JButton viewTrainingBtn;
    private javax.swing.JLabel welcomeMsgLbl;
    // End of variables declaration//GEN-END:variables
}
