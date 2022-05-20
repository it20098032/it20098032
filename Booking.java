public class Booking {

    private int Booking_Id;
    private String Booking_Type;
    private String Booking_Description;

    public Booking(int booking_Id, String booking_Type, String booking_Description) {
        Booking_Id = booking_Id;
        Booking_Type = booking_Type;
        Booking_Description = booking_Description;
    }

    public int getBooking_Id() {
        return Booking_Id;
    }

    public void setBooking_Id(int booking_Id) {
        Booking_Id = booking_Id;
    }

    public String getBooking_Type() {
        return Booking_Type;
    }

    public void setBooking_Type(String booking_Type) {
        Booking_Type = booking_Type;
    }

    public String getBooking_Description() {
        return Booking_Description;
    }

    public void setBooking_Description(String booking_Description) {
        Booking_Description = booking_Description;
    }
}
