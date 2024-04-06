package DB_Classes;

import Classes.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import javax.swing.JOptionPane;

public class CustomerDb {
    // Establish a connection to the database
    Connection conn = DataBaseConnection.connectTODB();
    // Define variables for statement and result objects
    PreparedStatement statement = null;
    ResultSet result = null;

    // Method to insert a new customer into the database
    public void insertCustomer(Person client) {
        try {
            // Prepare the SQL statement for inserting a new customer
            String insertQuery = "INSERT INTO person VALUES(?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(insertQuery);
            // Set the values for the SQL statement
            statement.setInt(1, client.getCin());
            statement.setString(2, client.getFN());
            statement.setString(3, client.getLN());
            statement.setInt(4, client.getPhone());
            statement.setString(5, client.getEmail());
            // Execute the SQL statement
            statement.executeUpdate();
            // Display a success message to the user
            JOptionPane.showMessageDialog(null, "successfully inserted new Customer");
        } catch (SQLException ex) {
            // If an error occurs, display an error message to the user
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Insert Query Failed");
        } finally {
            // Flush the statement object to free up resources
            flushStatementOnly();
        }
    }

    // Method to update an existing customer in the database
    public void updateCustomer(Person client) {
        try {
            // Prepare the SQL statement for updating an existing customer
            String updateQuery = "update person set FN = '"
                    + client.getFN() + "',"
                    + "LN = '" + client.getLN()+ "',"
                    + "phone = '" + client.getPhone() + "',"
                    + "email = '" + client.getEmail()+ "' where cin= "
                    + client.getCin();
            statement = conn.prepareStatement(updateQuery);
            // Execute the SQL statement
            statement.executeUpdate();
            // Display a success message to the user
            JOptionPane.showMessageDialog(null, "successfully updated new Customer");
        } catch (SQLException ex) {
            // If an error occurs, display an error message to the user
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Update query Failed");
        } finally {
            // Flush the statement object to free up resources
            flushStatementOnly();
        }
    }

    // Method to delete a customer from the database
    public void deleteCustomer(int cin) throws SQLException {
        try {
            // Prepare the SQL statement for deleting a customer
            String deleteQuery = "delete from person where cin="+cin ;
            statement = conn.prepareStatement(deleteQuery);
            // Execute the SQL statement
            statement.executeUpdate();
            // Display a success message to the user
            JOptionPane.showMessageDialog(null, "Deleted client");
        } catch (SQLException ex) {
            // If an error occurs, display an error message to the user
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Delete query Failed");
        } finally {
            // Flush the statement object to free up resources
            flushStatementOnly();
        }
    }

    // Method to get all customers from the database
    public ResultSet getAllCustomer() {
        try {
            // Prepare the SQL statement for getting all customers
            String query = "SELECT * FROM person";
            statement = conn.prepareStatement(query);
            // Execute the SQL statement and store the result in a ResultSet object
            result = statement.executeQuery();
        } catch (SQLException ex) {
            // If an error occurs, display an error message to the user
             JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
    }

    return result;
}

// This method is used to flush (close) the statement object only
private void flushStatementOnly()
{
    {
        try
        {
            statement.close();
        }
        catch(SQLException ex)
        {
            System.err.print(ex.toString()+" >> CLOSING DB");
        }
    }
}

// This method is used to flush (close) both the statement and result set objects
public void flushAll()
{
    {
        try
        {
            statement.close();
            result.close();
        }
        catch(SQLException ex)
        {
            System.err.print(ex.toString()+" >> CLOSING DB");
        }
    }
}
}
