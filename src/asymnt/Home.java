
package asymnt;


public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /*
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        paymentButton = new javax.swing.JButton();
        otherButton = new javax.swing.JButton();
        patientButton = new javax.swing.JButton();
        employeeButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hospital Management System");

        jPanel1.setName(""); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymentButton.setBackground(new java.awt.Color(204, 255, 255));
        paymentButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        paymentButton.setText("Payment");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });
        jPanel1.add(paymentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 92, 112, 30));

        otherButton.setBackground(new java.awt.Color(204, 255, 255));
        otherButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        otherButton.setText("Other");
        otherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherButtonActionPerformed(evt);
            }
        });
        jPanel1.add(otherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 254, 112, 30));

        patientButton.setBackground(new java.awt.Color(204, 255, 255));
        patientButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        patientButton.setText("Patient");
        patientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientButtonActionPerformed(evt);
            }
        });
        jPanel1.add(patientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 112, 30));

        employeeButton.setBackground(new java.awt.Color(204, 255, 255));
        employeeButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        employeeButton.setText("Employee");
        employeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(employeeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 173, 112, 30));

        exitButton.setBackground(new java.awt.Color(204, 255, 255));
        exitButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Projects\\Asymnt\\src\\images\\homeBckgrnd.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 480, 330));

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

        jPanel1.getAccessibleContext().setAccessibleName("");
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void patientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientButtonActionPerformed
        //to navigate the login window
        new Login("regOrTest").setVisible(true);
       
        
     
    }//GEN-LAST:event_patientButtonActionPerformed

    private void employeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeButtonActionPerformed
        //to navigate the login window
        Login lg = new Login("employee");
        lg.setVisible(true);
    }//GEN-LAST:event_employeeButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       //to exit home window
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        //to navigate the login window
        Login lg = new Login("payment");
        lg.setVisible(true);
        
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void otherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherButtonActionPerformed
        //to navigate the login window
        Login lg = new Login("other");
        lg.setVisible(true);
    }//GEN-LAST:event_otherButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    //public variable for navigation and accessable by all other classes
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton employeeButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton otherButton;
    private javax.swing.JButton patientButton;
    private javax.swing.JButton paymentButton;
    // End of variables declaration//GEN-END:variables
}
