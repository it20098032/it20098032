public class Hotel {
    private int Hotel_ID;
    private String Hotel_Name;
    private String Type;
    private String Location;


    public Hotel(int hotel_ID, String hotel_Name, String type, String location) {
        Hotel_ID = hotel_ID;
        Hotel_Name = hotel_Name;
        Type = type;
        Location = location;
    }

    public int getHotel_ID() {
        return Hotel_ID;
    }

    public void setHotel_ID(int hotel_ID) {
        Hotel_ID = hotel_ID;
    }

    public String getHotel_Name() {
        return Hotel_Name;
    }

    public void setHotel_Name(String hotel_Name) {
        Hotel_Name = hotel_Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
