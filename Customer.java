public class Customer {

    private int Customer_ID;
    private String Customer_Name;
    private String Phone_Number;
    private String Email;

    public Customer(int customer_ID, String customer_Name, String phone_Number, String email) {
        Customer_ID = customer_ID;
        Customer_Name = customer_Name;
        Phone_Number = phone_Number;
        Email = email;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        Customer_ID = customer_ID;
    }

    public String getCustomer_Name() {
        return Customer_Name;
    }

    public void setCustomer_Name(String customer_Name) {
        Customer_Name = customer_Name;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
