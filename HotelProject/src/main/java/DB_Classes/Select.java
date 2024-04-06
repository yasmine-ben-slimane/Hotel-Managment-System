package DB_Classes;

import java.sql.*;
import javax.swing.JOptionPane;

public class Select {
    // This method accepts a SQL query string and returns a ResultSet object 
    // containing the results of the query.
    public static ResultSet getData(String query) {
        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            // Connect to the database using the connectTODB() method from the
            // DataBaseConnection class.
            con = DataBaseConnection.connectTODB();
            
            // Create a statement object to execute the query.
            st = con.createStatement();
            
            // Execute the query and store the results in a ResultSet object.
            rs = st.executeQuery(query);
            
            // Return the ResultSet object containing the query results.
            return rs;
        } catch (Exception e) {
            // If an exception occurs, display an error message and return null.
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }  
}