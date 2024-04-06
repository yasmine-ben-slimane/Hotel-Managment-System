

package UI;


import DB_Classes.Select;
import DB_Classes.employeeDB;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




/**
 *
 * @author yasmi
 */
public class AdminHome extends javax.swing.JFrame {

    
    employeeDB db = new employeeDB();
    public AdminHome() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ControPanelButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(245, 221, 204));
        jPanel1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 800));

        jButton1.setBackground(new java.awt.Color(245, 221, 204));
        jButton1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setText("logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ControPanelButton.setBackground(new java.awt.Color(245, 221, 204));
        ControPanelButton.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        ControPanelButton.setForeground(new java.awt.Color(153, 0, 0));
        ControPanelButton.setText("Control panel");
        ControPanelButton.setToolTipText("");
        ControPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ControPanelButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(144, 52, 43));
        closeButton.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setText("Exit");
        closeButton.setFocusPainted(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cinEmp", "FNEmp", "LNEmp", "emailEmp", "username", "status"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Welcome Admin !");

        tfSearch.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tfSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0)));

        searchButton.setBackground(new java.awt.Color(102, 0, 0));
        searchButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(102, 0, 0));
        clearButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("Search by Username or Email");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(273, 273, 273)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ControPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ControPanelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton)
                        .addComponent(clearButton))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ControPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ControPanelButtonActionPerformed
      // This method is called when the "Go to Control Panel" button is clicked.
      
    // Display a confirmation dialog box with yes/no options to ask the user if they really want to go to the control panel.
    int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Go To The Control Panel ? ", "Select an option", JOptionPane.YES_NO_OPTION);
    // If the user clicks "yes":
    if (a == 0) {
    // restarts the current window.
    dispose();
    
    new ControlPanel().setVisible(true);
    }

    }//GEN-LAST:event_ControPanelButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // This method is called when the "Clear" button is clicked.
        
        // restarts the current window.
        setVisible(false);
        
        new AdminHome().setVisible(true);

    }//GEN-LAST:event_clearButtonActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
     // Query the database for all employee data.
    ResultSet rs = Select.getData("select * from employees ");
    // Get the table model for the table of employee data.
    DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
    // Clear the table.
    model.setRowCount(0);
    try {
    // For each row of employee data:
    while (rs.next()) {
    // Add a new row to the table with the data from the database.
    model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(6), rs.getString(10)});
    }
    rs.close();
    }
    catch(Exception e) {
    // Display an error message if there is an exception.
    JOptionPane.showMessageDialog(null, e);
    }
        
    }//GEN-LAST:event_formComponentShown

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        // Get the search text from the text field.
        String usernameOrEmail = tfSearch.getText();
        // Query the database for employee data with usernames or emails that match the search text.
        ResultSet rs = Select.getData("select * from employees where username like '%"+usernameOrEmail+"%' or emailEmp like'%"+usernameOrEmail+"%'");
        // Get the table model for the table of employee data.
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        // Clear the table.
        model.setRowCount(0);
        try{
        // For each row of employee data:
        while (rs.next()) {
        // Add a new row to the table with the data from the database.
        model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(6), rs.getString(10)});
        }
        rs.close();
        }
        catch(Exception e) {
        // Display an error message if there is an exception.
        JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
    // This method is called when the user clicks on a row in the jTable1 table.
    // It gets the email and status of the selected row, prompts the user to confirm
    // changing the status, and updates the status in the database if confirmed.

    int index=jTable1.getSelectedRow(); // Get the index of the selected row
    TableModel model=jTable1.getModel(); // Get the table model of jTable1
    String email=model.getValueAt(index, 3).toString(); // Get the email value of the selected row
    String status = model.getValueAt(index, 5).toString(); // Get the status value of the selected row

    try {
        // Prompt the user to confirm changing the status
        int a = JOptionPane.showConfirmDialog(null, "Do you want to change the status of  "+email+" ?","Select one option",JOptionPane.YES_NO_OPTION);
        if (a==0) { // If the user confirms changing the status
            // Update the status in the database
            db.updateStatus(status,email);
            setVisible(false);
            new AdminHome().setVisible(true);
        }       
    } catch(Exception e) {
        JOptionPane.showMessageDialog(null, e); // Show an error message if there is an exception
    }   
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      // This method is called when the user clicks on the "Log Out" button.
    // It prompts the user to confirm logging out, and if confirmed, closes the current
    // window and opens the Login window. 
     int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Go To Log Out ? ", "Select an option", JOptionPane.YES_NO_OPTION);
    if (a==0) { // If the user confirms logging out
        dispose(); // Close the current window
        new Login().setVisible(true); // Open the Login window
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
     // This method is called when the user clicks on the "Close" button.
    // It prompts the user to confirm closing the application, and if confirmed, exits the application.
  
    int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Close the Application ? ", "Select an option", JOptionPane.YES_NO_OPTION);
    if (a==0) { // If the user confirms closing the application
        System.exit(0); // Exit the application
    }
            System.exit(0);
        
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ControPanelButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
