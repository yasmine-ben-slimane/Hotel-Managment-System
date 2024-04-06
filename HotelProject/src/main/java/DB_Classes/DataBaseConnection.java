package DB_Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DataBaseConnection {
    
    // This method returns a connection to the database
    public static Connection connectTODB()
    {
        // Define the connection URL, username, and password
        String db_url="jdbc:mysql://localhost:3306/hotel";
        String user="root";
        String password="29253187";
        try{
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connect to the database using the URL, username, and password
            Connection con=DriverManager.getConnection(db_url,user, password);
            // If the connection is successful, print a message
            if (con!=null){System.out.println("successfully connected");}
            
            return con; // Return the connection object
        }
        // If an exception occurs while connecting to the database, print the stack trace and show a message dialog
        catch (Exception ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, ex.toString());
           return null;
        }
    }
}
