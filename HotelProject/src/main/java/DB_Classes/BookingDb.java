package DB_Classes;

import Classes.Booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import javax.swing.JOptionPane;

public class BookingDb {

    Connection conn;
    PreparedStatement statement = null;
    ResultSet result = null;

    // Constructor to establish a database connection
    public BookingDb() {
        conn = DataBaseConnection.connectTODB();
    }

    // Method to insert a booking record into the database
    public void insertBooking(Booking booking) {
        LocalDateTime checkInDateTime = booking.getCheckInDateTime();
        LocalDateTime checkOutDateTime = booking.getCheckOutDateTime();

        for (int i = 0; i < booking.getRooms().size(); i++) {
            try {
                // SQL insert statement to add the booking record to the database
                String insertQuery = "INSERT INTO booking"
                        + "(customer_id, booking_room, guests, check_in, check_out, booking_type, has_checked_out)"
                        + " VALUES (?, ?, ?, ?, ?, ?, ?)";

                statement = conn.prepareStatement(insertQuery);
                statement.setInt(1, booking.getClient().getCin());
                statement.setString(2, booking.getRooms().get(i).getRoom_no());
                statement.setInt(3, booking.getGuest());
                statement.setTimestamp(4, Timestamp.valueOf(checkInDateTime));
                statement.setTimestamp(5, Timestamp.valueOf(checkOutDateTime));
                statement.setString(6, booking.getBookingType());
                statement.setBoolean(7, false);
                statement.executeUpdate();

                JOptionPane.showMessageDialog(null, "Successfully inserted new booking");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Insert query for booking failed");
            } finally {
                flushStatementOnly();
            }
        }
    }

    // Method to retrieve all booking records from the database
    public ResultSet getBookingInformation() {
        try {
            // SQL select statement to retrieve all booking records
            String query = "select * from booking";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all booking DB Operation");
        }

        return result;
    }

    // Method to retrieve a specific booking record from the database
    public ResultSet getABooking(int bookingId) {
        try {
            // SQL select statement to retrieve a booking record by its ID
            String query = "select * from booking where booking_id = " + bookingId;
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning A booking DB Operation");
        }

        return result;
    }

    // Method to close all database connections
    public void flushAll() {
        {
            try {
                statement.close();
                result.close();
            } catch (SQLException ex) {
                System.err.print(ex.toString() + " >> CLOSING DB");
            }
        }
    }

    // Method to close the statement used to execute a query
    public void flushStatementOnly() {
        {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.err.print(ex.toString() + " >> CLOSING DB");
            }
        }
    }

    // Method to delete a booking record from the database by its ID
    public boolean deleteBooking(int booking_id) {
    // show a confirmation dialog before deleting the booking
    int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this booking?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        try {
            // prepare the SQL query to delete the booking with the specified ID
            String query = "DELETE FROM booking WHERE booking_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, booking_id);
            
            // execute the query to delete the booking
            pstmt.executeUpdate();
            
            // show a success message
            JOptionPane.showMessageDialog(null, "Booking deleted successfully!");
            
            return true;
        } catch (SQLException ex) {
            // show an error message if the deletion fails
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from deleteBooking()");
        }
    }
    
    // return false if the user cancels the deletion
    return false;
}
}
