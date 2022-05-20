public class Employee {

    private int Employee_ID;
    private String Full_Name;
    private String Job;

    public Employee(int employee_ID, String full_Name, String job) {
        Employee_ID = employee_ID;
        Full_Name = full_Name;
        Job = job;
    }

    public int getEmployee_ID() {
        return Employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        Employee_ID = employee_ID;
    }

    public String getFull_Name() {
        return Full_Name;
    }

    public void setFull_Name(String full_Name) {
        Full_Name = full_Name;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }
}
