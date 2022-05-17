public class Transport {

    private int Transport_ID;
    private String Transport_Name;
    private String Transport_Type;
    private String Transport_Description;

    public Transport(int transport_ID, String transport_Name, String transport_Type, String transport_Description) {
        Transport_ID = transport_ID;
        Transport_Name = transport_Name;
        Transport_Type = transport_Type;
        Transport_Description = transport_Description;
    }

    public int getTransport_ID() {
        return Transport_ID;
    }

    public void setTransport_ID(int transport_ID) {
        Transport_ID = transport_ID;
    }

    public String getTransport_Name() {
        return Transport_Name;
    }

    public void setTransport_Name(String transport_Name) {
        Transport_Name = transport_Name;
    }

    public String getTransport_Type() {
        return Transport_Type;
    }

    public void setTransport_Type(String transport_Type) {
        Transport_Type = transport_Type;
    }

    public String getTransport_Description() {
        return Transport_Description;
    }

    public void setTransport_Description(String transport_Description) {
        Transport_Description = transport_Description;
    }
}
