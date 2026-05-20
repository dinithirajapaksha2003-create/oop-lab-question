
package com.mycompany.bookdetailsapp;


public class MemberForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MemberForm.class.getName());

   
    public MemberForm() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        memberNameTextField = new javax.swing.JTextField();
        monthsTextField = new javax.swing.JTextField();
        regularRadioButton = new javax.swing.JRadioButton();
        premiumRadioButton = new javax.swing.JRadioButton();
        newsletterCheckBox = new javax.swing.JCheckBox();
        registerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 12)); // NOI18N
        jLabel1.setText("Membership Registration");

        jLabel2.setText("Member Name");

        jLabel3.setText("number of months");

        memberNameTextField.addActionListener(this::memberNameTextFieldActionPerformed);

        monthsTextField.addActionListener(this::monthsTextFieldActionPerformed);

        buttonGroup1.add(regularRadioButton);
        regularRadioButton.setText("Regular radio");
        regularRadioButton.addActionListener(this::regularRadioButtonActionPerformed);

        buttonGroup2.add(premiumRadioButton);
        premiumRadioButton.setText("Premium radio");
        premiumRadioButton.addActionListener(this::premiumRadioButtonActionPerformed);

        newsletterCheckBox.setText("Newsletter checkbox");
        newsletterCheckBox.setToolTipText("Subscribe to receive updates");
        newsletterCheckBox.addActionListener(this::newsletterCheckBoxActionPerformed);

        registerButton.setText("Register Button");
        registerButton.addActionListener(this::registerButtonActionPerformed);

        outputTextArea.setColumns(20);
        outputTextArea.setRows(5);
        jScrollPane1.setViewportView(outputTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regularRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(memberNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(monthsTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 29, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(80, 80, 80))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newsletterCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(premiumRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(registerButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(memberNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(monthsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(regularRadioButton)
                .addGap(18, 18, 18)
                .addComponent(premiumRadioButton)
                .addGap(18, 18, 18)
                .addComponent(newsletterCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(registerButton)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memberNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memberNameTextFieldActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        String memberName =
memberNameTextField.getText();

int months =Integer.parseInt(monthsTextField.getText());

String membershipType;

if(premiumRadioButton.isSelected())
    membershipType="Premium";

else
    membershipType="Regular";

boolean newsletter =
newsletterCheckBox.isSelected();

Member member =new Member(memberName,membershipType,newsletter,months);

outputTextArea.setText(

"Member Name: " +
member.getMemberName() + "\n" +

"Membership Type: " +
member.getMembershipType() + "\n" +

"Months: " +
member.getNumberOfMonths() + "\n" +

"Newsletter: " +
member.getNewsletterText() + "\n" +

"Total Fee: " +
member.getMembershipFee()

);
    }//GEN-LAST:event_registerButtonActionPerformed

    private void regularRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regularRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regularRadioButtonActionPerformed

    private void premiumRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_premiumRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_premiumRadioButtonActionPerformed

    private void monthsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthsTextFieldActionPerformed

    private void newsletterCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newsletterCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newsletterCheckBoxActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MemberForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField memberNameTextField;
    private javax.swing.JTextField monthsTextField;
    private javax.swing.JCheckBox newsletterCheckBox;
    private javax.swing.JTextArea outputTextArea;
    private javax.swing.JRadioButton premiumRadioButton;
    private javax.swing.JButton registerButton;
    private javax.swing.JRadioButton regularRadioButton;
    // End of variables declaration//GEN-END:variables
}
