package DB_Classes;

import Classes.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class employeeDB {

    Connection conn = DataBaseConnection.connectTODB(); // Create a connection object to connect to the database
    Statement statement = null; // Create a statement object to execute SQL queries
    ResultSet result = null; // Create a result set object to store the results of SQL queries

    // Method to insert an employee into the database
    public void insertEmployee(Employee emp) {

        try {
            statement = conn.createStatement();
            if (emp != null) {
                // Build the SQL insert query using the employee object's attributes
                String Query = "INSERT INTO employees (cinEmp,FNEmp,LNEmp,emailEmp,phoneEmp,username,password,securityquestion,answer,status) VALUES ("
                        + Integer.toString(emp.getCin()) + ",'" + emp.getFN() + "'," + "'" + emp.getLN() + "','"
                        + emp.getEmail() + "'," + Integer.toString(emp.getPhone()) + ",'" + emp.getUsername() + "','"
                        + emp.getPassword() + "','" + emp.getSecurityquestion() + "','" + emp.getAnswer() + "','false')";
                // Execute the SQL insert query
                statement.executeUpdate(Query);
                JOptionPane.showMessageDialog(null, "Successfully inserted new employee");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Insert Query Failed");
        } finally {
            flushStatementOnly();
        }
    }

    // Method to update the status of an employee in the database
    public void updateStatus(String status, String email) {
        if (status.equals("false")) {
            status = "true";
        } else {
            status = "false";
        }
        try {
            statement = conn.createStatement();
            // Build the SQL update query to update the employee's status using their email address
            String Query = "UPDATE employees SET status = '" + status + "' WHERE emailEmp='" + email + "'";
            // Execute the SQL update query
            statement.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Successfully updated the status of " + email);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Status Update Query Failed");
        } finally {
            flushStatementOnly();
        }
    }

    // Method to retrieve an authenticated employee's data from the database
    public ResultSet getAuthenticatedEmp(String username, String password) {

        try {
            // Connect to the database
            conn = DataBaseConnection.connectTODB();

            statement = conn.createStatement();
            // Build the SQL select query to retrieve the employee's data using their username and password
            String sql = "SELECT * FROM employees WHERE username=? AND password=?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            result = preparedStatement.executeQuery();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    // Method to flush the statement object
    private void flushStatementOnly() {
        try {
            statement.close();
        } catch (SQLException ex) {
            System.err.print(ex.toString() + " >> CLOSING DB");
        }
    }
    public static void updateEmp(String Query,String msg)
    {
        Connection con=null;
        Statement st = null;
        try{
            // Establish a connection to the database
            con=DataBaseConnection.connectTODB();
            
            // Create a Statement object to execute the query
            st=con.createStatement();
            
            // Execute the query
            st.executeUpdate(Query);
            
            // If a success message is provided, display it to the user
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null, msg);
        }
        catch(Exception e)
        {
            // If an error occurs during the execution of the query, display the error message to the user
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                // Close the connection and statement objects
                st.close();
                con.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }  
}