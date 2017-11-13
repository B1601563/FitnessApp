package fitnessapp;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.*;
import javax.swing.*;

/**
 * A JDialog which allows a Trainer to record new TrainingSession
 * @author B1601563
 */
public class RecordNewSessionDialog extends javax.swing.JDialog {
    private HELPFit helpfit;
    private Trainer theTrainer;
    private int tabIndex;       // to keep track of the tab chosen (Personal or Group)
    
    /**
     * Creates new form RecordNewSessionDialog
     */
    /**
     * Constructor for RecordNewSessionDialog
     * @param parent the parent of this dialog
     * @param modal true or false
     * @param theTrainer the logged in trainer who wants to record a new session
     */
    public RecordNewSessionDialog(java.awt.Frame parent, boolean modal, Trainer theTrainer){
        super(parent, modal);
        initComponents();
        setTitle("Record New Training Session");
        setSize(550,570);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        helpfit = ((HFGUI) parent).getHELPFit();
        this.theTrainer = theTrainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        trainingTypeTab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pTitleTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pFeeTF = new javax.swing.JTextField();
        pDateTF = new javax.swing.JFormattedTextField();
        pTimeTF = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        gTitleTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        maxPaxSP = new javax.swing.JSpinner();
        classTypeCB = new javax.swing.JComboBox<>();
        gFeeTF = new javax.swing.JTextField();
        gDateTF = new javax.swing.JFormattedTextField();
        gTimeTF = new javax.swing.JFormattedTextField();
        createBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Record New Training Session");

        trainingTypeTab.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        trainingTypeTab.setToolTipText("");
        trainingTypeTab.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        trainingTypeTab.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                trainingTypeTabStateChanged(evt);
            }
        });

        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Title:");

        pTitleTF.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Date:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Time:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setText("Fee (RM):");

        pFeeTF.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        pDateTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        pDateTF.setToolTipText("dd/mm/yyyy");
        pDateTF.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        pTimeTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        pTimeTF.setToolTipText("hh:mm AM/PM");
        pTimeTF.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pTitleTF)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pFeeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(pTimeTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(pDateTF, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pTitleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(pTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pFeeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        trainingTypeTab.addTab("Personal", jPanel1);

        jPanel2.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Title:");

        gTitleTF.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Date:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setText("Time:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setText("Fee (RM):");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setText("Max pax:");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setText("Class type:");

        maxPaxSP.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        maxPaxSP.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        classTypeCB.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        classTypeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dance", "MMA", "Sport" }));

        gFeeTF.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        gDateTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        gDateTF.setToolTipText("dd/mm/yyyy");
        gDateTF.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        gTimeTF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        gTimeTF.setToolTipText("hh:mm AM/PM");
        gTimeTF.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maxPaxSP, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gTitleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gFeeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(gTitleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(gDateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gTimeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(gFeeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxPaxSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classTypeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        trainingTypeTab.addTab("Group", jPanel2);

        createBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createBtn.setText("Create");
        createBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelBtn.setText("Cancel");
        cancelBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(trainingTypeTab, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(cancelBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createBtn)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trainingTypeTab, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * A method which validates user input when createBtn is clicked and creates the respective TrainingSession if user input is valid
     * @param evt 
     */
    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        DateTimeFormatter dateformat = DateTimeFormatter.ofPattern("d/M/y");
        DateTimeFormatter timeformat = DateTimeFormatter.ofPattern("h:m a");
        
        LocalDate sessionDate = null;
        LocalTime sessionTime = null;
        // Personal tab is chosen
        if (tabIndex == 0) {
            // get the values entered in the text fields
            String pTitle = pTitleTF.getText();
            String pDate = pDateTF.getText();
            String pTime = pTimeTF.getText();
            String pFee = pFeeTF.getText();
         
            if (pTitle.equals("") || pDate.equals("") || pTime.equals("")
                || pFee.equals("")) {
                JOptionPane.showMessageDialog(this, "You must not leave any fields empty.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                double sessionFee = -1;
                /**
                 * try catch exception for Date format
                 */
                try {
                    sessionDate = LocalDate.parse(pDate, dateformat);
                } catch (DateTimeParseException dtpe) {
                    JOptionPane.showMessageDialog(this, 
                        "Invalid date entered, please re-enter date as dd/mm/yyyy",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
                
                /**
                 * try catch exception for Time format
                 */
                try {
                    String time = pTime.toUpperCase();
                    sessionTime = LocalTime.parse(time, timeformat);
                } catch (DateTimeParseException dtpe) {
                    JOptionPane.showMessageDialog(this, 
                        "Invalid time entered, please re-enter time as HH:MM AM/PM",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }              
                
                /**
                 * try catch exception for session fee entered
                 */
                try {
                    // convert fee from String to double
                    sessionFee = Double.parseDouble(pFee);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(this, 
                        "Invalid fee entered, please re-enter fee as a number greater or equal to 0.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }

                if (sessionDate.isBefore(LocalDate.now())) {
                    JOptionPane.showMessageDialog(this, "Session cannot be before today.",
                        "Error", JOptionPane.ERROR_MESSAGE);                
                } else if (sessionFee < 0) {
                    JOptionPane.showMessageDialog(this, "Fee cannot be negative.",
                        "Error", JOptionPane.ERROR_MESSAGE);               
                } else {
                    PersonalTraining pSession = theTrainer.addPersonalTraining(pTitle, sessionDate, sessionTime, sessionFee);            
                    if (pSession != null) { // add to HELPFit's list of trainings
                        helpfit.addTrainingSession(pSession);
                        JOptionPane.showMessageDialog(this, "Personal Training created successfully!\n" + pSession.toString(),
                        "Success!", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                    }
                }
            }

        } else {
            // Group tab is chosen
            // get the values entered in the text fields
            String gTitle = gTitleTF.getText();
            String gDate = gDateTF.getText();
            String gTime = gTimeTF.getText();
            String gFee = gFeeTF.getText();
            int maxPax = (Integer) maxPaxSP.getValue();
            TrainingType classType = TrainingType.values()[classTypeCB.getSelectedIndex()];
            
            if (gTitle.equals("") || gDate.equals("") || gTime.equals("")
                || gFee.equals("")) {
                JOptionPane.showMessageDialog(this, "You must not leave any fields empty.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                double sessionFee = -1;
                /* same try catch exceptions as personal training above */
                try {
                    sessionDate = LocalDate.parse(gDate, dateformat);
                } catch (DateTimeParseException dtpe) {
                    JOptionPane.showMessageDialog(this, 
                        "Invalid date entered, please re-enter date as dd/mm/yyyy",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }

                try {
                    String time = gTime.toUpperCase();
                    sessionTime = LocalTime.parse(time, timeformat);
                } catch (DateTimeParseException dtpe) {
                    JOptionPane.showMessageDialog(this, 
                        "Invalid time entered, please re-enter time as HH:MM AM/PM",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }

                // convert fee from String to double
                try {
                    sessionFee = Double.parseDouble(gFee);
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(this, 
                        "Invalid fee entered, please re-enter fee as a number greater or equal to 0.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
                

                if (sessionDate.isBefore(LocalDate.now())) {
                    JOptionPane.showMessageDialog(this, "Session cannot be before today.",
                        "Error", JOptionPane.ERROR_MESSAGE);                
                } else if (sessionFee < 0) {
                    JOptionPane.showMessageDialog(this, "Fee cannot be negative.",
                        "Error", JOptionPane.ERROR_MESSAGE);               
                } else if (maxPax <= 0){
                    JOptionPane.showMessageDialog(this, "Max participants must be positive.",
                    "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    GroupTraining gSession = theTrainer.addGroupTraining(gTitle, sessionDate, sessionTime, sessionFee, classType, maxPax);  
                    if (gSession != null) { // add to HELPFit's list of trainings
                        helpfit.addTrainingSession(gSession);
                        JOptionPane.showMessageDialog(this, "Group Training created successfully!\n" + gSession.toString(),
                        "Success!", JOptionPane.INFORMATION_MESSAGE);
                        this.setVisible(false);
                    }
                }
            }
        
        }
    }//GEN-LAST:event_createBtnActionPerformed

    /**
     * A method which allows theTrainer to cancel if they do not wish to record a new training session
     * @param evt 
     */
    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    /**
     * A method to keep track of the training type tab state - whether user has selected the Personal or Group tab
     * @param evt 
     */
    private void trainingTypeTabStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_trainingTypeTabStateChanged
        JTabbedPane sourceTabbedPane = (JTabbedPane) evt.getSource();
        tabIndex = trainingTypeTab.getSelectedIndex();
    }//GEN-LAST:event_trainingTypeTabStateChanged

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
            java.util.logging.Logger.getLogger(RecordNewSessionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecordNewSessionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecordNewSessionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecordNewSessionDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RecordNewSessionDialog dialog = new RecordNewSessionDialog(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> classTypeCB;
    private javax.swing.JButton createBtn;
    private javax.swing.JFormattedTextField gDateTF;
    private javax.swing.JTextField gFeeTF;
    private javax.swing.JFormattedTextField gTimeTF;
    private javax.swing.JTextField gTitleTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner maxPaxSP;
    private javax.swing.JFormattedTextField pDateTF;
    private javax.swing.JTextField pFeeTF;
    private javax.swing.JFormattedTextField pTimeTF;
    private javax.swing.JTextField pTitleTF;
    private javax.swing.JTabbedPane trainingTypeTab;
    // End of variables declaration//GEN-END:variables
}