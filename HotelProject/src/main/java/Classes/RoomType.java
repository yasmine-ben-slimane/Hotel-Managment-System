package Classes;

public class RoomType {
    
    private int room_type_id;
    private String room_type;
    private int pricePerDay;

    //getter for the room type id
    public int getRoom_type_id() {
        return room_type_id;
    }

    //setter for the room type id
    public void setRoom_type_id(int room_type_id) {
        this.room_type_id = room_type_id;
    }

    //getter for the room type
    public String getRoom_type() {
        return room_type;
    }

    //setter for the room type
    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    //getter for the price per day
    public int getPricePerDay() {
        return pricePerDay;
    }

    //setter for the price per day
    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    
}
