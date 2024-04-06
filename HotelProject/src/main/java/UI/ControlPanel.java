
package UI;

import Classes.Booking;
import Classes.Person;
import Classes.Room;
import DB_Classes.BookingDb;
import DB_Classes.CustomerDb;
import DB_Classes.DataBaseConnection;
import DB_Classes.DatabaseOperation;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


public class ControlPanel extends javax.swing.JFrame {

 
   // Vector to store the list of customers
    Vector<String> customerList = new Vector();

    // Create database objects
    DatabaseOperation db = new DatabaseOperation();
    CustomerDb customerdb = new CustomerDb();
    BookingDb bookingdb = new BookingDb();

    // Create booking object and set initial state
    Booking booking = new Booking();
    boolean existingCustomer = false;
    Person client;
    ResultSet result;

    // Constructor
    public ControlPanel() {
        initComponents();

        // Set background color
        this.getContentPane().setBackground(new Color(241,241,242));

        // Method to populate the customer list
        searchCustomerHelper();

        // Auto complete the customer name field
        AutoCompleteDecorator.decorate(combo_clients);

        // Set check in date to today
        date_checkIn.setDate(new Date());

        // Update booking table
        updateTable();
    }

    // Method to get all the booking data
    public void populateWithBookingData() {
        result = bookingdb.getBookingInformation();
        bookingdb.flushAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator7 = new javax.swing.JSeparator();
        panel_container = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_room_up = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomsList = new javax.swing.JList();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        date_checkOut = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date_checkIn = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        tf_FN = new javax.swing.JTextField();
        tf_Phone = new javax.swing.JTextField();
        tf_LN = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        combo_reservationType = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tf_rooms = new javax.swing.JTextField();
        tf_guestNo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tf_cin = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tf_Email = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        combo_clients = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jButton2 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jLabel14 = new javax.swing.JLabel();
        btn_statistics = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        btn_refresh1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_bookings = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));
        setUndecorated(true);

        panel_container.setBackground(new java.awt.Color(245, 221, 204));
        panel_container.setMaximumSize(new java.awt.Dimension(1400, 800));
        panel_container.setMinimumSize(new java.awt.Dimension(1400, 800));
        panel_container.setPreferredSize(new java.awt.Dimension(1400, 800));
        panel_container.setVerifyInputWhenFocusTarget(false);
        panel_container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(245, 221, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(144, 52, 43), 2, true));

        btn_room_up.setBackground(new java.awt.Color(102, 0, 0));
        btn_room_up.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        btn_room_up.setForeground(new java.awt.Color(255, 255, 255));
        btn_room_up.setText("Add room(s) to the Rooms field");
        btn_room_up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_room_upActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        roomsList.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        roomsList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        roomsList.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        roomsList.setVisibleRowCount(1);
        jScrollPane1.setViewportView(roomsList);

        jLabel11.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel11.setText("Available Rooms :");

        jLabel12.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel12.setText("( please use ctrl to select multiple rooms )");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(btn_room_up, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 15, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(54, 54, 54)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btn_room_up, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        panel_container.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 470, 350));

        jPanel2.setBackground(new java.awt.Color(245, 221, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(144, 52, 43), 2, true));

        jLabel4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel4.setText("Phone No");

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel2.setText("First Name");

        jLabel9.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel9.setText("Type");

        jLabel6.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel6.setText("Guests");

        date_checkIn.setIcon(null);
        date_checkIn.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                date_checkInPropertyChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel5.setText("Rooms");

        tf_FN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_FNActionPerformed(evt);
            }
        });

        tf_Phone.setToolTipText("Digits Only");
        tf_Phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_PhoneActionPerformed(evt);
            }
        });
        tf_Phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_PhoneKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel7.setText("Check in");

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel8.setText("Check Out");

        combo_reservationType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "On Spot", "Paid reservation", "Reservation" }));

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setText("Last Name");

        tf_rooms.setEditable(false);

        tf_guestNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_guestNoKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel10.setText("CIN");

        tf_cin.setToolTipText(" Digits Only");
        tf_cin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_cinKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel13.setText("New Booking :");

        tf_Email.setToolTipText("digits only");
        tf_Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_EmailFocusLost(evt);
            }
        });
        tf_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_EmailActionPerformed(evt);
            }
        });
        tf_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_EmailKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel15.setText("Email");

        btn_edit.setBackground(new java.awt.Color(102, 0, 0));
        btn_edit.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(102, 0, 0));
        btn_delete.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(102, 0, 0));
        btn_add.setFont(new java.awt.Font("Georgia", 2, 12)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 167, 157)));
        btn_add.setBorderPainted(false);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(date_checkIn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_Phone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_reservationType, javax.swing.GroupLayout.Alignment.LEADING, 0, 120, Short.MAX_VALUE)
                            .addComponent(tf_rooms, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_guestNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_FN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_LN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_Email, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_checkOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_cin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_FN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_LN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_Email))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_rooms, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_guestNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_checkIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(date_checkOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(combo_reservationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_container.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jPanel1.setBackground(new java.awt.Color(245, 221, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(144, 52, 43), 2, true));

        combo_clients.setEditable(true);
        combo_clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_clientsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setText("Search Client: (type and hit Enter)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_clients, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_clients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panel_container.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jButton1.setBackground(new java.awt.Color(218, 132, 108));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jButton1.setText("Customer Info");
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
        panel_container.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 92, 235, -1));
        panel_container.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 42, -1, 150));

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
        panel_container.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 92, 175, -1));
        panel_container.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1393, 42, -1, 150));
        panel_container.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1514, 42, -1, 150));
        panel_container.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1635, 42, -1, 150));
        panel_container.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1756, 42, -1, 150));
        panel_container.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1906, 42, -1, 150));

        jLabel14.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("HOTEL MANAGEMENT SYSTEM PROJECT IN JAVA AND MYSQL");
        panel_container.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 1159, 33));

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
        panel_container.add(btn_statistics, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, 92, 175, -1));

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
        panel_container.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 9, 60, -1));

        btn_logout.setBackground(new java.awt.Color(245, 221, 204));
        btn_logout.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(153, 0, 0));
        btn_logout.setText("Logout");
        btn_logout.setBorder(null);
        btn_logout.setFocusPainted(false);
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        panel_container.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 50));

        btn_refresh1.setBackground(new java.awt.Color(210, 105, 76));
        btn_refresh1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        btn_refresh1.setForeground(new java.awt.Color(255, 255, 255));
        btn_refresh1.setText("Refresh");
        btn_refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refresh1ActionPerformed(evt);
            }
        });
        panel_container.add(btn_refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 39));

        table_bookings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "booking_id", "customer_id", "booking_room", "guests", "check_in", "check_out", "booking_type"
            }
        ));
        table_bookings.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        table_bookings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_bookingsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_bookings);

        panel_container.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 260, 560, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        RoomPanel r = new RoomPanel(this, rootPaneCheckingEnabled);
        r.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        CustomerPanel c = new CustomerPanel();
        c.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combo_clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_clientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_clientsActionPerformed

    private void tf_EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_EmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_EmailKeyTyped

    private void tf_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_EmailActionPerformed

    private void tf_guestNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_guestNoKeyTyped
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_guestNoKeyTyped

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // Check if any required fields are empty
    if (!isAnyRequiredFieldEmpty() ) {
        // If all required fields are filled, create a new booking object
        bookingObjectCreation();
        // Insert the booking object into the database
        bookingdb.insertBooking(booking);
        // Clear all fields in the GUI
        clearAllFields();
        // Update the table in the GUI with the latest data from the database
        updateTable();
    }
    else
    {
        // If any required fields are empty, show an error message
        JOptionPane.showMessageDialog(null, "All the fields should be filled");
    }
    }//GEN-LAST:event_btn_addActionPerformed

    private void tf_PhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_PhoneKeyTyped
        char c = evt.getKeyChar();
        // Allow only digits
        if (!(Character.isDigit(c) )) {
            evt.consume();
        }
    }//GEN-LAST:event_tf_PhoneKeyTyped

    private void tf_PhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_PhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_PhoneActionPerformed

    private void date_checkInPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_date_checkInPropertyChange
        // Check if the check-in date is not null
    if (date_checkIn.getDate() != null) {
        try {
            // Get the check-in date from the date picker
            java.util.Date datecheckIn = date_checkIn.getDate();
            // Convert the date to a SQL Timestamp object
            java.sql.Timestamp checkInTimestamp = new java.sql.Timestamp(datecheckIn.getTime());

            // Query the database to get the available rooms on the check-in date
            ResultSet result = db.getAvailableRooms(checkInTimestamp.getTime());
            DefaultListModel model = new DefaultListModel();

            // Iterate through the ResultSet and add each available room to the model
            while (result.next()) {
                model.addElement(result.getString("room_no"));
            }

            // Set the model as the data source for the roomsList JList component
            roomsList.setModel(model);

        } catch (SQLException ex) {
            // Print an error message if there was an exception while executing the SQL query
            System.err.println("Error: " + ex.getMessage());
        }
    }

    }//GEN-LAST:event_date_checkInPropertyChange

    private void btn_room_upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_room_upActionPerformed
        List<String> list = new ArrayList();
        list = roomsList.getSelectedValuesList();
        if (!list.isEmpty()) {
            String roomString = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                roomString += "," + list.get(i);
            }
            tf_rooms.setText(roomString);
        }
    }//GEN-LAST:event_btn_room_upActionPerformed

    private void tf_FNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_FNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_FNActionPerformed

    private void btn_statisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_statisticsActionPerformed
        dispose();
        StatisticsPanel s = new StatisticsPanel();
        s.setVisible(true);
    }//GEN-LAST:event_btn_statisticsActionPerformed

    private void tf_cinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_cinKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if (!Character.isDigit(c))
        {
            evt.consume();
        }
    }//GEN-LAST:event_tf_cinKeyTyped

    private void tf_EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_EmailFocusLost
        // TODO add your handling code here:
        String email = tf_Email.getText();
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Invalid email address", "Error", JOptionPane.ERROR_MESSAGE);
            tf_Email.setText("");
        }
    }//GEN-LAST:event_tf_EmailFocusLost

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Logout ? ", "Select an option", JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
           this.dispose();
            Login l = new Login();
            l.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refresh1ActionPerformed
        this.dispose();
        ControlPanel c = new ControlPanel();
        c.setVisible(true);
        
    }//GEN-LAST:event_btn_refresh1ActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do You Really Want To Close the Application ? ", "Select an option", JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
      
    // Get the index of the selected row
    int selectedRow = table_bookings.getSelectedRow();

    // If a row is selected, proceed to delete the booking
    if (selectedRow >= 0) {


     // Get the booking ID from the selected row
     DefaultTableModel model = (DefaultTableModel) table_bookings.getModel();
     int bookingId = (int) model.getValueAt(selectedRow, 0);

     // Confirm with the user that they want to delete the booking
     int confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this booking?", "Confirm deletion", JOptionPane.YES_NO_OPTION);

     // If the user confirms deletion, delete the booking from the database
     if (confirmation == JOptionPane.YES_OPTION) {

         // Attempt to delete the booking
         if (bookingdb.deleteBooking(bookingId)) {

             // Clear all fields, update the table, and display a success message
             clearAllFields();
             updateTable();
             JOptionPane.showMessageDialog(null, "Booking has been deleted.");
         } else {

             // Display an error message if the deletion failed
             JOptionPane.showMessageDialog(null, "Failed to delete booking.");
         }
     }
    } else {

     // Display a message asking the user to select a booking before attempting to delete it
     JOptionPane.showMessageDialog(null, "Please select a booking to delete.");
}

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed


                                        
    // Check if all fields are filled
    if (isAnyRequiredFieldEmpty() ) {
        JOptionPane.showMessageDialog(this, "Please fill in all the required fields.");
        return;
    }
    // Verify if the checkout date is before the checkin date
if (date_checkOut.getDate().before(date_checkIn.getDate())) {
    JOptionPane.showMessageDialog(this, "The checkout date cannot be before the checkin date.");
    return;
}
    // Get the selected row from the table
    int selectedRow = table_bookings.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a booking from the table.");
        return;
    }

    // Get the booking ID from the selected row
    DefaultTableModel model = (DefaultTableModel) table_bookings.getModel();
    int booking_id = (int) model.getValueAt(selectedRow, 0);

    // Get the values of the fields to update the booking
    String booking_room = tf_rooms.getText();
    int guests = Integer.parseInt(tf_guestNo.getText());
    LocalDateTime check_in = date_checkIn.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    LocalDateTime check_out = date_checkOut.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    String booking_type = (String) combo_reservationType.getSelectedItem();
    

    // Execute the update query
    try {
        PreparedStatement pstmt = DataBaseConnection.connectTODB().prepareStatement(
                "UPDATE booking SET booking_room = ?, guests = ?, check_in = ?, check_out = ?, booking_type = ? WHERE booking_id = ?");
        pstmt.setString(1, booking_room);
        pstmt.setInt(2, guests);
        pstmt.setTimestamp(3, Timestamp.valueOf(check_in));
        pstmt.setTimestamp(4, Timestamp.valueOf(check_out));
        pstmt.setString(5, booking_type);
        pstmt.setInt(6, booking_id);
        pstmt.executeUpdate();
        pstmt.close();

        // Update the table to reflect the changes
        clearAllFields();
        updateTable();

        JOptionPane.showMessageDialog(this, "Booking updated successfully.");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Error updating booking: " + ex.getMessage());
    }

    }//GEN-LAST:event_btn_editActionPerformed
  

    private void bookingObjectCreation() {
     // Create a new Booking object
    booking = new Booking();

    // Convert the room numbers string to a List of Room objects and set it in the Booking object.
    roomsToRoomObjectList(tf_rooms.getText());

    // Set the booking type and guest count in the Booking object.
    booking.setBookingType((String) combo_reservationType.getSelectedItem());
    booking.setGuest(Integer.parseInt(tf_guestNo.getText()));

    // Set the check-in date and time in the Booking object.
    booking.setCheckInDateTime(LocalDateTime.ofInstant(Instant.ofEpochSecond(date_checkIn.getDate().getTime() / 1000), ZoneId.systemDefault()));

    // Set the booking type again (it was set before but this is redundant)
    booking.setBookingType((String) combo_reservationType.getSelectedItem());

    // If check-out date is selected, set the check-out date and time in the Booking object
    if (date_checkOut.getDate() != null) {

        // Convert the check-out date to LocalDateTime object
        LocalDateTime checkOutDateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(date_checkOut.getDate().getTime() / 1000), ZoneId.systemDefault());

        // If check-out date is before check-in date, show an error message and return from the method.
        if (checkOutDateTime.isBefore(booking.getCheckInDateTime())) {
            JOptionPane.showMessageDialog(this, "Check-out date should be after check-in date", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Set the check-out date and time in the Booking object
        booking.setCheckOutDateTime(checkOutDateTime);
    } else {
        // If check-out date is not selected, show an error message and return from the method.
        JOptionPane.showMessageDialog(this, "Check-out date should be selected", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // If an existing customer is selected, set the customer's cin in the Booking object
    if (existingCustomer) {
        booking.getClient().setCin(Integer.parseInt(tf_cin.getText()));
    } else {
        // If a new customer is selected, create a new Customer object, insert it in the database, set its cin in the Booking object.
        createNewCustomer();
        customerdb.insertCustomer(client);
        booking.getClient().setCin(db.getCustomerId(client));
        db.flushAll();
    }

}

   
    private void table_bookingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_bookingsMouseClicked
       
        int row = table_bookings.getSelectedRow();
        displayToTextField(row);
        
        booking=getBookingFromTable(row);
        btn_edit.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_add.setEnabled(false);
    }//GEN-LAST:event_table_bookingsMouseClicked

private void updateTable() {
    // Get the table model and reset the row count to 0
    DefaultTableModel model = (DefaultTableModel) table_bookings.getModel();
    model.setRowCount(0);

    // Retrieve booking information from the database
    ResultSet rs = bookingdb.getBookingInformation();

    try {
        // Loop through the results and add each row to the table model
        while (rs.next()) {
            // Extract data from the result set
            int booking_id = rs.getInt("booking_id");
            int customer_id = rs.getInt("customer_id");
            String booking_room = rs.getString("booking_room");
            int guests = rs.getInt("guests");
            LocalDateTime check_in = rs.getTimestamp("check_in").toLocalDateTime();
            LocalDateTime check_out = rs.getTimestamp("check_out").toLocalDateTime();
            String booking_type = rs.getString("booking_type");
            boolean has_checked_out = rs.getBoolean("has_checked_out");

            // Create an array of objects to represent a row of data in the table
            Object[] row = new Object[8];
            row[0] = booking_id;
            row[1] = customer_id;
            row[2] = booking_room;
            row[3] = guests;
            row[4] = check_in;
            row[5] = check_out;
            row[6] = booking_type;
            row[7] = has_checked_out;

            // Add the row to the table model
            model.addRow(row);
        }
    } catch (SQLException ex) {
        // Display an error message if an exception occurs
        JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from updateTable()");
    }
}
    
    
private Booking getBookingFromTable(int row) {
    int bookingId = (int) table_bookings.getValueAt(row, 0);
    LocalDateTime checkIn = (LocalDateTime) table_bookings.getValueAt(row, 3);
    LocalDateTime checkOut = (LocalDateTime) table_bookings.getValueAt(row, 4);
    int guests = (int) table_bookings.getValueAt(row, 2);
    String bookingType = (String) table_bookings.getValueAt(row, 5);
    int customerId = (int) table_bookings.getValueAt(row, 1);
    String roomNumber = (String) table_bookings.getValueAt(row, 6);
    
    Booking booking = new Booking();
    booking.setBooking_id(bookingId);
    booking.setCheckInDateTime(checkIn);
    booking.setCheckOutDateTime(checkOut);
    booking.setGuest(guests);
    booking.setBookingType(bookingType);
    Person customer = new Person();
    customer.setCin(customerId);
    booking.setClient(customer);
    Room room = new Room();
    room.setRoom_no(roomNumber);
    ArrayList<Room> rooms = new ArrayList<>();
    rooms.add(room);
    booking.addRoom(roomNumber);
    
    return booking;
}

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
    // returning true should block the client to execute next processes
    private boolean isAnyRequiredFieldEmpty() {
        return tf_LN.getText().equals("") || tf_Phone.getText().equals("") ||tf_Email.getText().equals("") || tf_guestNo.getText().equals("") || tf_FN.getText().equals("") || tf_rooms.getText().equals("")||date_checkIn.getDate() == null || date_checkOut.getDate() == null;
    }

   
    private void createNewCustomer() {
        
        client= new Person();
        
        client.setCin(Integer.parseInt(tf_cin.getText()));
        
        client.setFN(tf_FN.getText());
        client.setLN(tf_LN.getText());
        
        client.setPhone(Integer.parseInt(tf_Phone.getText()));
        client.setEmail(tf_Email.getText());

    }

    private void roomsToRoomObjectList(String value) {
        if (!value.contains(",")) {
            booking.addRoom(value.trim());
        } else {
            String[] roomArray = value.split(",");
            for (String s : roomArray) {
                booking.addRoom(s);
            }
        }
    }

   private void searchCustomerHelper() {
    // Create a new DefaultComboBoxModel using the customerList
    final DefaultComboBoxModel model = new DefaultComboBoxModel(customerList);
    // Set the combo_clients model to the new DefaultComboBoxModel
    combo_clients.setModel(model);

    // Get the editor component from the combo box and add a key listener to it
    JTextComponent editor = (JTextComponent) combo_clients.getEditor().getEditorComponent();
    editor.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent evt) {
            // If the user presses the Enter key, search for the selected customer
            if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
                // Get the selected customer's details
                String details = (String) combo_clients.getSelectedItem();
                if (!details.contains(",")) {
                    // If the details do not contain a comma, no customer was found
                    JOptionPane.showMessageDialog(null, "no clients found, try adding a new client");
                } else {
                    // If the details do contain a comma, a customer was found
                    // Extract the customer ID from the details
                    String customerIdString = details.substring(0, details.indexOf(","));
                    int customerId = Integer.parseInt(customerIdString);

                    // Search the database for the customer using the extracted ID
                    ResultSet clientDB = db.searchAnUser(customerId);
                    // Display the customer's information in the text fields
                    displayTextField(clientDB);
                    // Set existingCustomer to true to indicate that a customer has been found
                    existingCustomer = true;
                }
            }

            // If the user types in the editor, suggest saved customer data
            String value = "";
            try {
                value = combo_clients.getEditor().getItem().toString();
            } catch (Exception ex) {
            }
            if (value.length() >= 1) {
                // Search the database for customers that match the entered value
                clientComboFill(db.searchUser(value));
            }
        }
    });
}



    private void displayTextField(ResultSet rs) {
    try {
        while (rs.next()) {
            tf_cin.setText(rs.getInt("cin") + "");
            tf_FN.setText(rs.getString("FN"));
            tf_LN.setText(rs.getString("LN"));
            tf_Phone.setText(rs.getString("phone"));
            tf_Email.setText(rs.getString("email"));
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "err from displaying to board");
    }
}

    private void clientComboFill(ResultSet result) {
    customerList.clear();
    try {
        while (result.next()) {
            customerList.add(result.getInt("cin") + ", " + result.getString("FN") + "," + result.getString("LN"));
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "client Combo fill error");
    }

}

    private void clearAllFields() {
        combo_clients.getEditor().setItem(null);
        combo_reservationType.setSelectedIndex(0);

        tf_cin.setText("");
        tf_FN.setText("");
        tf_LN.setText("");
        tf_Phone.setText("");
        tf_Email.setText("");
        tf_guestNo.setText("");
        
        
        tf_rooms.setText("");
        date_checkIn.setDate(new Date());
        date_checkOut.setDate(null);
        existingCustomer = false;
    }
private void displayToTextField(int row) {
    if (row >= 0) {
        DefaultTableModel model = (DefaultTableModel) table_bookings.getModel();
        int booking_id = (int) model.getValueAt(row, 0);
        int customer_id = (int) model.getValueAt(row, 1);
        String booking_room = (String) model.getValueAt(row, 2);
        int guests = (int) model.getValueAt(row, 3);
        LocalDateTime check_in = (LocalDateTime) model.getValueAt(row, 4);
        LocalDateTime check_out = (LocalDateTime) model.getValueAt(row, 5);
        String booking_type = (String) model.getValueAt(row, 6);
        //boolean has_checked_out = (boolean) model.getValueAt(row, 7);

        // Set the GUI text fields to display the booking data
        //tf_bookingId.setText(String.valueOf(booking_id));
        //tf_cin.setText(String.valueOf(customer_id));
        ResultSet clientDB = db.searchAnUser(customer_id);
        displayTextField(clientDB);
        existingCustomer=true;
        tf_rooms.setText(booking_room);
        tf_guestNo.setText(String.valueOf(guests));
        date_checkIn.setDate(Date.from(check_in.atZone(ZoneId.systemDefault()).toInstant()));
        date_checkOut.setDate(Date.from(check_out.atZone(ZoneId.systemDefault()).toInstant()));
        combo_reservationType.setSelectedItem(booking_type);
        //cb_hasCheckedOut.setSelected(has_checked_out);
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_refresh1;
    private javax.swing.JButton btn_room_up;
    private javax.swing.JButton btn_statistics;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox combo_clients;
    private javax.swing.JComboBox combo_reservationType;
    private com.toedter.calendar.JDateChooser date_checkIn;
    private com.toedter.calendar.JDateChooser date_checkOut;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JPanel panel_container;
    private javax.swing.JList roomsList;
    private javax.swing.JTable table_bookings;
    private javax.swing.JTextField tf_Email;
    private javax.swing.JTextField tf_FN;
    private javax.swing.JTextField tf_LN;
    private javax.swing.JTextField tf_Phone;
    private javax.swing.JTextField tf_cin;
    private javax.swing.JTextField tf_guestNo;
    private javax.swing.JTextField tf_rooms;
    // End of variables declaration//GEN-END:variables
}
