package Classes;

// Importing required classes
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

// Defining the Booking class
public class Booking {
    
    // Declaring instance variables
    private Person client;                  // Client associated with the booking
    ArrayList<Room> rooms;                  // Rooms associated with the booking
    private int booking_id;                 // ID of the booking
    private LocalDateTime checkInDateTime; // Date and time of check-in
    private LocalDateTime checkOutDateTime;// Date and time of check-out
    private String bookingType;             // Type of booking (e.g. reserved, confirmed, etc.)
    private int guest;                      // Number of guests associated with the booking
    
    // Constructor for Booking class
    public Booking() {
        // Initializing instance variables with default values
        client = new Person();
        rooms = new ArrayList<>();
        booking_id = -1;
        bookingType = "Reserved";
    }

    // Getter and setter methods for check-in and check-out date and time
    public LocalDateTime getCheckInDateTime() {
        return checkInDateTime;
    }

    public void setCheckInDateTime(LocalDateTime checkInDateTime) {
        this.checkInDateTime = checkInDateTime;
    }

    public LocalDateTime getCheckOutDateTime() {
        return checkOutDateTime;
    }

    public void setCheckOutDateTime(LocalDateTime checkOutDateTime) {
        this.checkOutDateTime = checkOutDateTime;
    }

    // Getter and setter methods for other instance variables
    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getBookingType() {
        return bookingType;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    public int getGuest() {
        return guest;
    }

    public void setGuest(int guest) {
        this.guest = guest;
    }

    // Getter method for the list of rooms associated with the booking
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    
    // Method to calculate the total fare of the rooms associated with the booking
    public int getRoomsFare() {
        int total = 0;
        // Iterate through all the rooms associated with the booking
        for(Room room : rooms) {
            // Add the price per day of the room's class to the total fare
            total += room.getRoom_class().getPricePerDay();
        }
        return total;
    }

    // Getter and setter methods for the client associated with the booking
    public Person getClient() {
        return client;
    }

    public void setClient(Person client) {
        this.client = client;
    }

    // Method to add a room to the list of rooms associated with the booking
    public void addRoom(String roomNo) {
        rooms.add(new Room(roomNo));
    }
    
    // Method to remove a room from the list of rooms associated with the booking
    public void removeRoom(String roomNo) {
        // Iterate through all the rooms associated with the booking
        for(Room a : rooms) {
            // If the room number matches the specified room number, remove the room from the list
            if(a.getRoom_no().equals(roomNo)) {
                rooms.remove(a);
            }
        }
    }
}
