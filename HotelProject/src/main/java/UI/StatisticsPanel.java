package UI;




import Classes.Person;
import DB_Classes.CustomerDb;
import DB_Classes.DatabaseOperation;
import DB_Classes.DataBaseConnection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import DB_Classes.RoomDb;
import DB_Classes.Select;

public class StatisticsPanel extends javax.swing.JFrame {
    Statement statement = null;
    Connection conn = DataBaseConnection.connectTODB();
    ResultSet result = null;
    
    
   
    public StatisticsPanel() {
        
       
            initComponents();
            this.getContentPane().setBackground(new Color(241,241,242));
            setTitle("Hotel Statistics ");
           
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_toprooms = new javax.swing.JButton();
        btn_monthlyrevenue = new javax.swing.JButton();
        btn_topclients = new javax.swing.JButton();
        btn_roomstatus = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_statistics = new javax.swing.JButton();
        closeButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(245, 221, 204));
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(245, 221, 204));
        jPanel1.setMaximumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1400, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1400, 800));

        btn_toprooms.setBackground(new java.awt.Color(144, 52, 43));
        btn_toprooms.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn_toprooms.setForeground(new java.awt.Color(255, 255, 255));
        btn_toprooms.setText("The Most Reserved Rooms");
        btn_toprooms.setBorder(null);
        btn_toprooms.setBorderPainted(false);
        btn_toprooms.setFocusPainted(false);
        btn_toprooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_toproomsActionPerformed(evt);
            }
        });

        btn_monthlyrevenue.setBackground(new java.awt.Color(144, 52, 43));
        btn_monthlyrevenue.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn_monthlyrevenue.setForeground(new java.awt.Color(255, 255, 255));
        btn_monthlyrevenue.setText("Monthly Revenue");
        btn_monthlyrevenue.setBorder(null);
        btn_monthlyrevenue.setBorderPainted(false);
        btn_monthlyrevenue.setFocusPainted(false);
        btn_monthlyrevenue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_monthlyrevenueActionPerformed(evt);
            }
        });

        btn_topclients.setBackground(new java.awt.Color(144, 52, 43));
        btn_topclients.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn_topclients.setForeground(new java.awt.Color(255, 255, 255));
        btn_topclients.setText("The Most Loyal Custumers");
        btn_topclients.setBorder(null);
        btn_topclients.setBorderPainted(false);
        btn_topclients.setFocusPainted(false);
        btn_topclients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_topclientsActionPerformed(evt);
            }
        });

        btn_roomstatus.setBackground(new java.awt.Color(144, 52, 43));
        btn_roomstatus.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn_roomstatus.setForeground(new java.awt.Color(255, 255, 255));
        btn_roomstatus.setText("Occupancy Status");
        btn_roomstatus.setBorder(null);
        btn_roomstatus.setBorderPainted(false);
        btn_roomstatus.setFocusPainted(false);
        btn_roomstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_roomstatusActionPerformed(evt);
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

        btn_statistics.setBackground(new java.awt.Color(218, 132, 108));
        btn_statistics.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn_statistics.setText("Customer Panel");
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

        closeButton1.setBackground(new java.awt.Color(144, 52, 43));
        closeButton1.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        closeButton1.setForeground(new java.awt.Color(255, 255, 255));
        closeButton1.setText("Exit");
        closeButton1.setToolTipText("");
        closeButton1.setFocusPainted(false);
        closeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButton1ActionPerformed(evt);
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
                                .addGap(382, 382, 382)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn_roomstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_monthlyrevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_toprooms, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_topclients, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(345, 345, 345)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addComponent(btn_statistics, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 378, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(closeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(closeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_statistics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(227, 227, 227)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_toprooms, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_roomstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_monthlyrevenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btn_topclients, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(297, Short.MAX_VALUE))
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

    private void btn_toproomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_toproomsActionPerformed
   try {
    statement = conn.createStatement();
    result = statement.executeQuery("SELECT booking_room, COUNT(*) AS num_bookings FROM booking GROUP BY booking_room ORDER BY num_bookings DESC LIMIT 3;");

    // Create a new JTable and populate it with the result set
    JTable table = new JTable(buildTableModel(result));

    // Create a new JScrollPane and add the table to it
    JScrollPane scrollPane = new JScrollPane(table);

    // Display the JScrollPane in a message dialog
    JOptionPane.showMessageDialog(null, scrollPane, "Query Result: Top 3 Rooms", JOptionPane.PLAIN_MESSAGE);
} catch (SQLException ex) {
    ex.printStackTrace();
}     
        
    }//GEN-LAST:event_btn_toproomsActionPerformed
public static DefaultTableModel buildTableModel(ResultSet result) throws SQLException {

    ResultSetMetaData metaData = result.getMetaData();

    // Get the number of columns in the result set
    int columnCount = metaData.getColumnCount();

    // Create a new TableModel with the column names
    DefaultTableModel tableModel = new DefaultTableModel();
    for (int column = 1; column <= columnCount; column++) {
        tableModel.addColumn(metaData.getColumnName(column));
    }

    // Add the rows to the TableModel
    while (result.next()) {
        Object[] row = new Object[columnCount];
        for (int column = 1; column <= columnCount; column++) {
            row[column - 1] = result.getObject(column);
        }
        tableModel.addRow(row);
    }

    return tableModel;
}

    private void btn_monthlyrevenueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_monthlyrevenueActionPerformed

        //call hotel.reservation_stats();
        try {
    statement = conn.createStatement();
    result = statement.executeQuery("call hotel.reservation_stats()");

    // Create a new JTable and populate it with the result set
    JTable table = new JTable(buildTableModel(result));

    // Create a new JScrollPane and add the table to it
    JScrollPane scrollPane = new JScrollPane(table);

    // Display the JScrollPane in a message dialog
    JOptionPane.showMessageDialog(null, scrollPane, "Query Result: Monthly Revenue", JOptionPane.PLAIN_MESSAGE);
} catch (SQLException ex) {
    ex.printStackTrace();
}     
    }//GEN-LAST:event_btn_monthlyrevenueActionPerformed

    private void btn_topclientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_topclientsActionPerformed
    try {
    statement = conn.createStatement();
    result = statement.executeQuery("SELECT person.cin, person.FN, person.LN, COUNT(*) AS num_bookings FROM person JOIN booking ON person.cin = booking.customer_id GROUP BY person.cin ORDER BY num_bookings DESC LIMIT 3;");

    // Create a new JTable and populate it with the result set
    JTable table = new JTable(buildTableModel(result));

    // Create a new JScrollPane and add the table to it
    JScrollPane scrollPane = new JScrollPane(table);

    // Display the JScrollPane in a message dialog
    JOptionPane.showMessageDialog(null, scrollPane, "Query Result: Top 3 Clients", JOptionPane.PLAIN_MESSAGE);
} catch (SQLException ex) {
    ex.printStackTrace();
}     
    }//GEN-LAST:event_btn_topclientsActionPerformed

    private void btn_roomstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_roomstatusActionPerformed
        Date today = new Date();
        Timestamp timestamp = new Timestamp(today.getTime());
   try {
    statement = conn.createStatement();
    result = statement.executeQuery("SELECT DISTINCT room.room_no, room.bed_number," +
"  IF(booking.booking_id IS NOT NULL" +
"    OR (booking.check_out > '"+timestamp+"' AND booking.check_in < '"+timestamp+"' )," +
"    'Reserved', 'Available') AS status" +
"   FROM room " +
"   LEFT JOIN booking ON room.room_no = booking.booking_room" +
"   ORDER BY room.room_no;");

    // Create a new JTable and populate it with the result set
    JTable table = new JTable(buildTableModel(result));

    // Create a new JScrollPane and add the table to it
    JScrollPane scrollPane = new JScrollPane(table);

    // Display the JScrollPane in a message dialog
    JOptionPane.showMessageDialog(null, scrollPane, "Query Result: Occupancy Status ", JOptionPane.PLAIN_MESSAGE);
} catch (SQLException ex) {
    ex.printStackTrace();
}     
    }//GEN-LAST:event_btn_roomstatusActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        ControlPanel c = new ControlPanel();
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        RoomPanel r = new RoomPanel(this, rootPaneCheckingEnabled);
        r.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_statisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_statisticsActionPerformed
        // TODO add your handling code here:
        dispose();
        CustomerPanel c = new CustomerPanel();
        c.setVisible(true);
    }//GEN-LAST:event_btn_statisticsActionPerformed

    private void closeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButton1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Close the Application ? ", "Select an option", JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButton1ActionPerformed

    
    

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
            java.util.logging.Logger.getLogger(StatisticsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatisticsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatisticsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatisticsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StatisticsPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_monthlyrevenue;
    private javax.swing.JButton btn_roomstatus;
    private javax.swing.JButton btn_statistics;
    private javax.swing.JButton btn_topclients;
    private javax.swing.JButton btn_toprooms;
    private javax.swing.JButton closeButton1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
