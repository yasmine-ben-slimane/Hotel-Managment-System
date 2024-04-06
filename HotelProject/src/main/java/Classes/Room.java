package Classes;

public class Room {
    // properties
    private int room_id; // unique identifier for the room
    private String room_no; // room number
    private int bed_number; // number of beds in the room
    private boolean hasTV; // whether the room has a TV
    private boolean hasWIFI; // whether the room has WIFI
    private boolean hasStove; // whether the room has a stove
    private boolean hasPhone; // whether the room has a phone

    private RoomType room_class; // the class or category of the room

    // constructor that takes a room number
    public Room(String roomNo)
    {
        room_no = roomNo; // assign the given room number to the room_no property
    }

    // default constructor that throws an exception if called
    public Room() {
        throw new UnsupportedOperationException("Not supported yet."); 
        // This is a placeholder method that gets generated automatically by the IDE
        // if you try to create a default constructor for a class that already has
        // one or more constructors. It's usually a good idea to remove this method
        // or replace its contents with actual code if you plan to use it.
    }

    // getters and setters for all properties

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public String getRoom_no() {
        return room_no;
    }

    public void setRoom_no(String room_no) {
        this.room_no = room_no;
    }

    public int getBed_number() {
        return bed_number;
    }

    public void setBed_number(int bed_number) {
        this.bed_number = bed_number;
    }

    public boolean hasTV() {
        return hasTV;
    }

    public void setHasTV(boolean hasTV) {
        this.hasTV = hasTV;
    }

    public boolean hasWIFI() {
        return hasWIFI;
    }

    public void setHasWIFI(boolean hasWIFI) {
        this.hasWIFI = hasWIFI;
    }

    public boolean hasStove() {
        return hasStove;
    }

    public void setHasStove(boolean hasStove) {
        this.hasStove = hasStove;
    }

    public boolean hasPhone() {
        return hasPhone;
    }

    public void setHasPhone(boolean hasPhone) {
        this.hasPhone = hasPhone;
    }

    public RoomType getRoom_class() {
        return room_class;
    }

    public void setRoom_class(RoomType room_class) {
        this.room_class = room_class;
    }
}
