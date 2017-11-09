/*
 */
package fitnessapp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author celine_yin
 */
public class TrainerTrainingHistoryDialog extends javax.swing.JDialog {
    private HELPFit helpfit;
    private HFGUI hfgui;
    private Trainer theTrainer;
    private TrainingHistTableModel thtm;   // to store data for the training history table
    
    /**
     * Creates new form TrainerTrainingHistoryDialog
     */
    public TrainerTrainingHistoryDialog(java.awt.Frame parent, boolean modal, Trainer theTrainer) {
        super(parent, modal);
        initComponents();
        setTitle("Trainer Training History");
        setSize(850, 550);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        helpfit = ((HFGUI) parent).getHELPFit();
        
        // make HFGUI the parent of the dialog also
        hfgui = (HFGUI) this.getParent();

        this.theTrainer = theTrainer;
        trainingHistLbl.setText(theTrainer.getFullName() + "'s Training History");

        setupTableModels();          // call this method to set up table models
    }
    
    /**
     * A method to manage the table views and table models for trainer's training history
     */
    public void setupTableModels() {      
        if (theTrainer.getNumTrainings() == 0) {
            displayTrainingLbl.setText("No training history to show.");
        }

        thtm = new TrainingHistTableModel(theTrainer.getTrainingSessions());   // get all sessions created by the trainer
        trainingHistTable.setModel(thtm);          // put the data in the Jtable
        
         ArrayList<TrainingSession> sortedSessions = theTrainer.getTrainingSessions();

         sortByCB.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (ie.getItem().equals("Session ID")) {
                    Collections.sort(sortedSessions);
                    thtm.setSessions(sortedSessions);
                    thtm.fireTableDataChanged();
                }
                else if (ie.getItem().equals("Date")) {
                    SessionDateComparator dateComparator = new SessionDateComparator();
                    Collections.sort(sortedSessions, dateComparator);
                    thtm.setSessions(sortedSessions);
                    thtm.fireTableDataChanged();
                } else {
                    ClassTypeComparator classTypeComparator = new ClassTypeComparator();
                    Collections.sort(sortedSessions, classTypeComparator);
                    thtm.setSessions(sortedSessions);
                    thtm.fireTableDataChanged();
                } 
            }
         });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trainingHistLbl = new javax.swing.JLabel();
        displayTrainingLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        trainingHistTable = new javax.swing.JTable();
        closeBtn = new javax.swing.JButton();
        sortByCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        trainingHistLbl.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        trainingHistLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        trainingHistLbl.setText("My Training History");

        displayTrainingLbl.setText(" ");

        trainingHistTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(trainingHistTable);

        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        sortByCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort by", "Session ID", "Date", "Class Type" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sortByCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(193, 193, 193)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(displayTrainingLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(trainingHistLbl)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trainingHistLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(displayTrainingLbl)
                    .addComponent(sortByCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(closeBtn)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(TrainerTrainingHistoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainerTrainingHistoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainerTrainingHistoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainerTrainingHistoryDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TrainerTrainingHistoryDialog dialog = new TrainerTrainingHistoryDialog(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeBtn;
    private javax.swing.JLabel displayTrainingLbl;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sortByCB;
    private javax.swing.JLabel trainingHistLbl;
    private javax.swing.JTable trainingHistTable;
    // End of variables declaration//GEN-END:variables
}
