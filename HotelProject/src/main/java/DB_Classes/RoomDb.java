package DB_Classes;

import Classes.Room;
import Classes.RoomType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class RoomDb {
    Connection conn = DataBaseConnection.connectTODB();
    PreparedStatement statement = null;
    ResultSet result = null;

    //This method is used to insert a new room into the database.
    public void insertRoom(Room room) {
        try {
            //Insert query for the room table with values extracted from the Room object.
            String insertQuery = "insert into room(room_no, bed_number, tv, wifi, stove, phone, room_class,room_class_id)"+ 
                    "values ('"
                    +room.getRoom_no()+
                    "',"
                    +room.getBed_number()+","
                    +booleanToInt(room.hasTV())+","
                    +booleanToInt(room.hasWIFI())+","
                    +booleanToInt(room.hasStove())+","
                    +booleanToInt(room.hasPhone())+",'"
                    +room.getRoom_class().getRoom_type()+"',"
                    +room.getRoom_class().getRoom_type_id()+")";
            //Creating a PreparedStatement object and executing the insert query to add the new room to the database.
            statement = conn.prepareStatement(insertQuery);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "successfully inserted a new Room ");

        } catch (SQLException ex) {
            //In case of an exception, the system will show a message dialog with the error message and a failure message.
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "InsertQuery of Room Class Failed");
        }
        //Finally, the method will call flushStatmentOnly() method to close the PreparedStatement object.
        finally
        {
            flushStatmentOnly();
        }
    }

    //This method is used to get all the rooms from the database.
    public ResultSet getRooms() {
        try {
            //Select query to get all the rooms from the room table.
            String query = "select * from room";
            //Creating a PreparedStatement object and executing the query to get all the rooms from the database.
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            //In case of an exception, the system will show a message dialog with the error message and a failure message.
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all Room DB Operation");
        }
        //Finally, the method will return the ResultSet object containing all the rooms.
        return result;
    }
    
    //This method is used to get the total number of rooms from the database.
    public int getNoOfRooms()
    {
        int rooms = -1;
        try {
            //Select query to count the number of rooms in the room table.
            String query = "select count(room_no)  as noRoom from room";
            //Creating a PreparedStatement object and executing the query to get the number of rooms from the database.
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            //Retrieving the number of rooms from the ResultSet object and assigning it to the rooms variable.
            while(result.next())
            {
                rooms = result.getInt("noRoom");
            }
        } catch (SQLException ex) {
            //In case of an exception, the system will show a message dialog with the error message and a failure message.
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming count Room DB Operation");
        }
        //Finally, the method will return the number of rooms.
        return rooms;
    }
    public void deleteRoom(int roomId) {

    try {
        String deleteQuery = "delete from room where room_id=" + roomId; // SQL query to delete a room with the given ID
        statement = conn.prepareStatement(deleteQuery);
        statement.executeUpdate(); // execute the query to delete the room
        JOptionPane.showMessageDialog(null, "Deleted room");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Delete query room Failed");
    }
    finally
    {
        flushStatmentOnly(); // close the statement
    }
}

  public void updateRoom(Room room)
{
    try {
        String updateQuery = "UPDATE room SET room_no = '" + room.getRoom_no() +
                "', bed_number = " + room.getBed_number() +
                ", tv = " + booleanToInt(room.hasTV()) +
                ", wifi = " + booleanToInt(room.hasWIFI()) +
                ", stove = " + booleanToInt(room.hasStove()) +
                ", phone = " + booleanToInt(room.hasPhone()) +
                ", room_class = '" + room.getRoom_class().getRoom_type() +
                "', room_class_id = " + room.getRoom_class().getRoom_type_id() +
                " WHERE room_id = " + room.getRoom_id(); // SQL query to update a room with the given ID

        statement = conn.prepareStatement(updateQuery);

        statement.executeUpdate(); // execute the query to update the room

        JOptionPane.showMessageDialog(null, "successfully updated a room");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Update query Failed");
    }
     finally
     {
         flushStatmentOnly(); // close the statement
     }

}

    /**
     *
     * @param value
     * @return
     */
    public static int booleanToInt(boolean value) {
    return value ? 1 : 0;
}
public String boolToString(boolean value) {
    return value ? "true" : "false"; // method to convert a boolean value to a string
}

    public void insertRoomType(RoomType roomType) {
    try {
        // creating a SQL query for inserting a new room type with its values
        String insertRoomTypeQuery = "insert into roomtype values('" + roomType.getRoom_type() + "'," + roomType.getPricePerDay()+"," +roomType.getRoom_type_id()+ ")";

        System.out.println(">>>>>>>>>> " + insertRoomTypeQuery);

        // creating a prepared statement object from the SQL query and executing it
        statement = conn.prepareStatement(insertRoomTypeQuery);
        statement.executeUpdate();

        // displaying a message to show the successful insertion of a new room type
        JOptionPane.showMessageDialog(null, "successfully inserted a new Room Type");

    } catch (SQLException ex) {
        // displaying an error message in case of any SQL exception
        JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "InsertQuery Failed");
    }
    // finally, closing the statement object to free up resources
    finally
    {
        flushStatmentOnly();
    }
}

public ResultSet getRoomType() {
    try {
        // creating a SQL query to get all the room types from the roomtype table
        String query = "select * from roomType";
        // creating a prepared statement object from the SQL query and executing it to get the resultset
        statement = conn.prepareStatement(query);
        result = statement.executeQuery();
    } catch (SQLException ex) {
        // displaying an error message in case of any SQL exception
        JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all Room Type DB Operation");
    }

    // returning the resultset containing all the room types
    return result;
}


public void updateRoomType(RoomType roomType) {
    try {
        // creating a SQL query to update a room type with its new values
        String updateRoomTypeQuery = "update roomtype set type= ? , price= ? where room_type_id= ?";
        // creating a prepared statement object from the SQL query and setting the parameters of the room type
        statement = conn.prepareStatement(updateRoomTypeQuery);
        statement.setString(1, roomType.getRoom_type());
        statement.setDouble(2, roomType.getPricePerDay());
        statement.setInt(3, roomType.getRoom_type_id());
        statement.executeUpdate();

        // displaying a message to show the successful update of a room type
        JOptionPane.showMessageDialog(null, "successfully updated a  Room Type");

    } catch (SQLException ex) {
        // displaying an error message in case of any SQL exception
        JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "UpdateQuery Failed");
    } finally {
        // closing the statement object to free up resources
        flushStatmentOnly();
    }
}


public void deleteRoomType(int roomTypeId) {

    try {
        // creating a SQL query to delete a room type based on its ID
        String deleteQuery = "delete from roomtype where room_type_id=" + roomTypeId;
        // creating a prepared statement object from the SQL query and executing it to delete the room type
        statement = conn.prepareStatement(deleteQuery);
        statement.executeUpdate();
        // displaying a message to show the successful deletion of a room type
        JOptionPane.showMessageDialog(null, "Deleted room type");
    } catch (SQLException ex) {
        // displaying an error message in case of any SQL exception
        JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Delete query room type Failed");
    }
    // finally, closing the statement object to free up resources
    finally
    {
        flushStatmentOnly();
    }
}

// a method to close the statement and resultset objects
private void flushStatmentOnly()
    {
        {
                        try
                        {
                            statement.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> CLOSING DB");}
                    }
    }


  

public int get_type_id(String type)
{
  result=Select.getData("select room_type_id from roomtype where type = '"+type+"'");
  try{
      if (result.next())
      {
           
          
         return (result.getInt(1));

      }

  }
  catch(Exception e){
      JOptionPane.showMessageDialog(null, e);
  }
        return -1;
}
}
