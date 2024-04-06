package UI;



import Classes.Person;
import DB_Classes.CustomerDb;
import DB_Classes.DatabaseOperation;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import DB_Classes.Select;

public class CustomerPanel extends javax.swing.JFrame {
// Create a new instance of Person, CustomerDb and ResultSet classes
Person client = new Person();
CustomerDb db = new CustomerDb();
ResultSet result = null;

// Constructor method for CustomerPanel class
    public CustomerPanel() {
    // Initialize components and set background color
    initComponents();
    this.getContentPane().setBackground(new Color(241,241,242));
    // Set title for the panel
    setTitle("All About Customers");
    // Call method to populate table with customer data
    populateWithCustomerData();
    }
       // Method to populate the customer table with data from the database
    private void populateWithCustomerData() {
    // Get all customer data from the database and store it in the result set
    result = db.getAllCustomer();
    // Get the table model for the customer table and reset the row count to zero
    DefaultTableModel model = (DefaultTableModel)table_customer.getModel();
    model.setRowCount(0);
    try {
    // Iterate through the result set and add each customer record to the table model
    while (result.next()) {
    model.addRow(new Object[]{result.getString(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5)});
    }
    // Close the result set
    result.close();
    }
    catch(Exception e) {
    // Display an error message if an exception occurs while populating the table
    JOptionPane.showMessageDialog(null, e);
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_reset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tf_Email = new javax.swing.JTextField();
        tf_LNClient = new javax.swing.JTextField();
        tf_phone = new javax.swing.JTextField();
        tf_FNClient = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_CIN = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btn_addCustomer = new javax.swing.JButton();
        btn_editCustomer = new javax.swing.JButton();
        btn_deleteCustomer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_customer = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_statistics = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(245, 221, 204));
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(245, 221, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 800));

        btn_reset.setBackground(new java.awt.Color(218, 132, 108));
        btn_reset.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(255, 255, 255));
        btn_reset.setText("Reset");
        btn_reset.setToolTipText("Reset everything");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(245, 221, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(144, 52, 43)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(144, 52, 43)), "Customer Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Californian FB", 1, 18), new java.awt.Color(144, 52, 43))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setText("Phone No.");

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setText("First Name");

        tf_Email.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tf_Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_EmailFocusLost(evt);
            }
        });

        tf_LNClient.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        tf_phone.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tf_phone.setToolTipText("Digits Only");
        tf_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_phoneActionPerformed(evt);
            }
        });
        tf_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_phoneKeyTyped(evt);
            }
        });

        tf_FNClient.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel2.setText("Last Name");

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel4.setText("Email");

        tf_CIN.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        tf_CIN.setToolTipText("Digits Only");
        tf_CIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_CINActionPerformed(evt);
            }
        });
        tf_CIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_CINKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel5.setText("CIN");

        btn_addCustomer.setBackground(new java.awt.Color(218, 132, 108));
        btn_addCustomer.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_addCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btn_addCustomer.setText("Add Customer");
        btn_addCustomer.setBorder(null);
        btn_addCustomer.setBorderPainted(false);
        btn_addCustomer.setFocusPainted(false);
        btn_addCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addCustomerActionPerformed(evt);
            }
        });

        btn_editCustomer.setBackground(new java.awt.Color(218, 132, 108));
        btn_editCustomer.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_editCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btn_editCustomer.setText("Edit Customer");
        btn_editCustomer.setToolTipText("");
        btn_editCustomer.setBorder(null);
        btn_editCustomer.setBorderPainted(false);
        btn_editCustomer.setEnabled(false);
        btn_editCustomer.setFocusPainted(false);
        btn_editCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editCustomerActionPerformed(evt);
            }
        });

        btn_deleteCustomer.setBackground(new java.awt.Color(218, 132, 108));
        btn_deleteCustomer.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        btn_deleteCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btn_deleteCustomer.setText("Delete Customer");
        btn_deleteCustomer.setEnabled(false);
        btn_deleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_deleteCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_addCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_LNClient)
                            .addComponent(tf_phone)
                            .addComponent(tf_Email)
                            .addComponent(tf_FNClient)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tf_CIN, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_CIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_FNClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_LNClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tf_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btn_addCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_editCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_deleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setBackground(new java.awt.Color(245, 221, 204));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(900, 600));

        table_customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "cinCl", "FNCl", "LNCl", "phoneCl", "emailCl"
            }
        ));
        table_customer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_customerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_customer);

        jButton2.setBackground(new java.awt.Color(218, 132, 108));
        jButton2.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton2.setText("Room Info");
        jButton2.setToolTipText("Room Info");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMargin(new java.awt.Insets(2, 15, 15, 14));
        jButton2.setMaximumSize(new java.awt.Dimension(121, 100));
        jButton2.setMinimumSize(new java.awt.Dimension(121, 100));
        jButton2.setPreferredSize(new java.awt.Dimension(121, 100));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(218, 132, 108));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setText("Control Panel");
        jButton1.setToolTipText("Customer Info");
        jButton1.setAlignmentY(0.0F);
        jButton1.setAutoscrolls(true);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMargin(new java.awt.Insets(2, 15, 15, 14));
        jButton1.setMaximumSize(new java.awt.Dimension(180, 100));
        jButton1.setMinimumSize(new java.awt.Dimension(180, 100));
        jButton1.setPreferredSize(new java.awt.Dimension(180, 100));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_statistics.setBackground(new java.awt.Color(218, 132, 108));
        btn_statistics.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn_statistics.setText("Statistics");
        btn_statistics.setToolTipText("Room Info");
        btn_statistics.setFocusable(false);
        btn_statistics.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_statistics.setMargin(new java.awt.Insets(2, 15, 15, 14));
        btn_statistics.setMaximumSize(new java.awt.Dimension(121, 100));
        btn_statistics.setMinimumSize(new java.awt.Dimension(121, 100));
        btn_statistics.setPreferredSize(new java.awt.Dimension(121, 100));
        btn_statistics.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_statistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_statisticsActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(338, 338, 338)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_statistics, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 294, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_statistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addCustomerActionPerformed
        // Check if any required field is empty and if the email address is valid
    if (!isAnyRequiredFieldEmpty() && isValidEmail(tf_Email.getText())) {
    // Create a new customer object
    ObjectCreation();
    // Insert the new customer into the database
    db.insertCustomer(client);
    // Repopulate the customer table with updated data
    populateWithCustomerData();
    // Clear all input fields
    emptyField();
    }
    else {
    // Display an error message if any required field is empty or if the email address is invalid
    JOptionPane.showMessageDialog(null, "All the fields should be filled");
    }

      
    }//GEN-LAST:event_btn_addCustomerActionPerformed
    // Method to check if any of the required fields for adding/editing a customer are empty
    // Returns true if any required field is empty, false otherwise
    private boolean isAnyRequiredFieldEmpty() {
    return tf_CIN.getText().equals("") || tf_FNClient.getText().equals("") || tf_LNClient.getText().equals("") ||tf_Email.getText().equals("") || tf_phone.getText().equals("");
    }
    // Method to create a new customer object and set its properties from the input fields
    private void ObjectCreation() {
    client = new Person();
    try {
    client.setCin(Integer.parseInt(tf_CIN.getText()));
    client.setFN(tf_FNClient.getText());
    client.setLN(tf_LNClient.getText());
    client.setPhone(Integer.parseInt(tf_phone.getText()));
    client.setEmail(tf_Email.getText());
    System.out.println("client " + client.getFN() + " " + client.getLN() + " successfully created");
    }
    catch(Exception ex) {
    // Display an error message if an exception occurs while creating the new customer object
    JOptionPane.showMessageDialog(null, ex);
    }
    }
    private void emptyField()
    {
         btn_addCustomer.setEnabled(true);
        btn_editCustomer.setEnabled(false);
        btn_deleteCustomer.setEnabled(false);
        
        client = new Person();
        
        tf_LNClient.setText("");
        tf_CIN.setText("");
        tf_FNClient.setText("");
        tf_phone.setText("");
        tf_Email.setText("");
        table_customer.clearSelection();
    }
    private void table_customerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_customerMouseClicked
       
        client = new Person();
        int row = table_customer.getSelectedRow();
        displayToTextField(row);
        //ObjectCreation();
        btn_editCustomer.setEnabled(true);
        btn_deleteCustomer.setEnabled(true);
        btn_addCustomer.setEnabled(false);
        
    }//GEN-LAST:event_table_customerMouseClicked

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
       
        emptyField();
        
    }//GEN-LAST:event_btn_resetActionPerformed

 
    
    private void btn_editCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editCustomerActionPerformed
        // Check if no required fields are empty and email is valid
    if (!isAnyRequiredFieldEmpty() && isValidEmail(tf_Email.getText())) {
        // Create a new customer object with the data from the fields
        ObjectCreation();
        // Update the customer in the database with the new data
        db.updateCustomer(client);
        // Populate the table with the updated customer data
        populateWithCustomerData();
        // Clear all the input fields
        emptyField();
    }
    else {
        // Show an error message if any required field is empty or the email is invalid
        JOptionPane.showMessageDialog(null, "All the fields should be filled");
    }    
        
    }//GEN-LAST:event_btn_editCustomerActionPerformed

    private void btn_deleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteCustomerActionPerformed
        // Ask the user to confirm if they really want to delete the customer
    int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Go To Delete This Customer From The Database ? ", "Select an option", JOptionPane.YES_NO_OPTION);
    if (a==0) // If the user clicked "Yes"
    {
        // Get the ID of the selected customer
        int selectedclientId = Integer.parseInt(tf_CIN.getText());
        try {
            // Delete the customer from the database
            db.deleteCustomer(selectedclientId);
        } catch (SQLException ex) {
            // If there's an error, log it to the console
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Populate the table with the updated customer data (without the deleted customer)
        populateWithCustomerData();
        // Clear all the input fields
        emptyField();
    }

    }//GEN-LAST:event_btn_deleteCustomerActionPerformed

    private void tf_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_phoneKeyTyped
         char c = evt.getKeyChar();
        
        if(!(Character.isDigit(c) || c== KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE ))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tf_phoneKeyTyped

    private void tf_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_phoneActionPerformed

    private void tf_CINKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_CINKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tf_CINKeyTyped

    private void tf_EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_EmailFocusLost
        // TODO add your handling code here:
        String email = tf_Email.getText();
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Invalid email address", "Error", JOptionPane.ERROR_MESSAGE);
            tf_Email.setText("");
        }
    }//GEN-LAST:event_tf_EmailFocusLost

    private void tf_CINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_CINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_CINActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        RoomPanel r = new RoomPanel(this, rootPaneCheckingEnabled);
        r.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        ControlPanel c = new ControlPanel();
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_statisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_statisticsActionPerformed
        // TODO add your handling code here:
        dispose();
        StatisticsPanel s = new StatisticsPanel();
        s.setVisible(true);
    }//GEN-LAST:event_btn_statisticsActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed

        int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Close the Application ? ", "Select an option", JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed
public static boolean isValidEmail(String email) {
    if (email == null || email.isEmpty()) {
        return false;
    }
    int atPos = email.indexOf('@');
    if (atPos < 1 || atPos != email.lastIndexOf('@')) {
        return false;
    }
    String domain = email.substring(atPos + 1);
    if (domain.isEmpty() || domain.indexOf('.') < 1 || domain.lastIndexOf('.') == domain.length() - 1) {
        return false;
    }
    return true;
}
    
    
    // This method retrieves the data of the selected row in the JTable and displays it in the respective JTextFields
    private void displayToTextField(int row)
{
    
    tf_CIN.setText(table_customer.getModel().getValueAt(row, 0)+"");
    tf_FNClient.setText((String) table_customer.getModel().getValueAt(row, 1));
    tf_LNClient.setText((String) table_customer.getModel().getValueAt(row, 2));
    tf_phone.setText((String) table_customer.getModel().getValueAt(row, 3));
    tf_Email.setText((String) table_customer.getModel().getValueAt(row, 4));
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
            java.util.logging.Logger.getLogger(CustomerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addCustomer;
    private javax.swing.JButton btn_deleteCustomer;
    private javax.swing.JButton btn_editCustomer;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_statistics;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_customer;
    private javax.swing.JTextField tf_CIN;
    private javax.swing.JTextField tf_Email;
    private javax.swing.JTextField tf_FNClient;
    private javax.swing.JTextField tf_LNClient;
    private javax.swing.JTextField tf_phone;
    // End of variables declaration//GEN-END:variables
}
