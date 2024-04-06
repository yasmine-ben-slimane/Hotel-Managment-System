package DB_Classes;

import DB_Classes.DataBaseConnection;
import Classes.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import javax.swing.JOptionPane;

public class DatabaseOperation {

    Connection conn = DataBaseConnection.connectTODB(); // create a new connection to the database
    PreparedStatement statement = null;
    ResultSet result = null;

    public void insertCustomer(Person client) throws SQLException {
        try {
            String insertQuery = "insert into person values('"
                    + client.getCin()
                    + "','" + client.getFN() + "'"
                    + "','" + client.getLN() + "'"
                    + ",'" + client.getPhone() + "'"
                    + ",'" + client.getEmail()+ "'"
                    + ")";

            statement = conn.prepareStatement(insertQuery); // create a prepared statement for the insert query

            statement.execute(); // execute the query

            JOptionPane.showMessageDialog(null, "successfully inserted new Customer"); // show a success message to the user

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "InsertQuery Failed"); // show an error message to the user
        }
        finally
        {
            flushStatmentOnly(); // close the statement
        }
        
        
    }
    public void flushAll()
    {
        {
                        try
                        {
                            statement.close(); // close the statement
                            result.close(); // close the result set
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> CLOSING DB");} // show an error message to the user
                    }
    }

    public void updateCustomer(Person client) {
        try {
            String updateQuery = "update person set FN = '"
                    + client.getFN() + "',"
                    + "LN = '" + client.getLN()+ "',"
                    + "phone = '" + client.getPhone() + "',"
                    + "email = '" + client.getEmail()+ "' where cin= "
                    + client.getCin();

            statement = conn.prepareStatement(updateQuery); // create a prepared statement for the update query

            statement.execute(); // execute the query

            JOptionPane.showMessageDialog(null, "successfully updated new Customer"); // show a success message to the user
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Update query Failed"); // show an error message to the user
        }

    }

    public void deleteCustomer(int clientId) throws SQLException {
        try {
            String deleteQuery = "delete from person where cin=" + clientId;
            statement = conn.prepareStatement(deleteQuery); // create a prepared statement for the delete query

            statement.execute(); // execute the query

            JOptionPane.showMessageDialog(null, "Deleted client"); // show a success message to the user
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Delete query Failed"); // show an error message to the user
        }
        finally
        {
            flushStatmentOnly(); // close the statement
        }

    }

       // Returns a ResultSet containing all customers
    public ResultSet getAllCustomer() {
        try {
            String query = "select * from person";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
        }
        finally
        {
            flushAll(); // Cleans up all open resources
        }

        return result;
    }


    // Returns a ResultSet containing all users with a first name or last name matching the given string
    public ResultSet searchUser(String clientName) {
        try {
            String query = "SELECT * FROM person WHERE FN LIKE ? OR LN LIKE ?";
            statement = conn.prepareStatement(query);
            statement.setString(1, "%" + clientName + "%");
            statement.setString(2, "%" + clientName + "%");
            return statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from search client function");
            return null;
        }
    }


    // Returns a ResultSet containing a user with the given cin
    public ResultSet searchAnUser(int cin) {
        try {
            String query = "SELECT * FROM person WHERE cin = ?";
            statement = conn.prepareStatement(query);
            statement.setInt(1, cin);
            return statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning AN client function");
            return null;
        }
    }


    // Returns a ResultSet containing the room numbers of available rooms at a given check-in time
    public ResultSet getAvailableRooms(long check_inTime) {
        try {
            String query = "SELECT room_no FROM room LEFT OUTER JOIN booking " +
                "ON room.room_no = booking.booking_room " +
                "WHERE booking.booking_id is null or (? < booking.check_in " +
                "and booking.check_out < ?) " +
                "group by room.room_no  order by room_no";

            statement = conn.prepareStatement(query);
            Timestamp check_inTimestamp = new Timestamp(check_inTime);
            statement.setTimestamp(1, check_inTimestamp);
            statement.setTimestamp(2, check_inTimestamp);
            result = statement.executeQuery();

            System.out.println(result.toString());
            return result;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + 
                "\n error coming from returning free rooms from getAvailable func.");
            return null;
        }
    }


    // Returns a ResultSet containing the booking information for a given room and date range
    public ResultSet getBookingInfo(long start_date, long end_date,String roomNo)
    {
        try {
            String query = "select * from booking where booking_room = '"+ roomNo+"' AND ("
                        +"( check_in <= "+start_date +" and ( check_out = 0 or check_out<= "+end_date+") ) or"
                        +"( check_in >"+start_date+" and check_out< "+end_date+" ) or"
                        +"( check_in <= "+end_date +" and ( check_out =0 or check_out> "+end_date+") ) )";

            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning booking info between two specific days");
        }

        return result;
    }


    // Returns the cin of a given client

    public int getCustomerId(Person client) {
        int cin = -1;
        try {
            String query = "SELECT cin FROM person WHERE FN=? AND LN=? AND phone=?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, client.getFN());
            statement.setString(2, client.getLN());
            statement.setInt(3, client.getPhone());

            // Print the prepared statement for debugging
            System.out.println(statement.toString() + " <<<");

            ResultSet result = statement.executeQuery();

            if (result.next()) {
                cin = result.getInt("cin");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning AN client function");
        }

        return cin;
    }

    /**
     * Close the statement to free up resources
     */
    private void flushStatmentOnly() {
        try {
            statement.close();
        } catch(SQLException ex) {
            System.err.print(ex.toString()+" >> CLOSING DB");
        }
    }
    }