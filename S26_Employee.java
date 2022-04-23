public class S26_Employee {
    int empID;
    String empName;
    private String SSN;
    protected String empDesig;
    public S26_Employee(int ID, String name){
        empID=ID;
        empName=name;
    }
    public String getSSN(){
        return SSN;
    }
    public void setSSN(String ssn){
        SSN=ssn;
    }
    public void setEmpDesignation(String desig){
        empDesig=desig;
    }
    public void dispay() {
        System.out.println("Employee ID is: "+empID);
        System.out.println("Employee Name is: "+empName);
        System.out.println("Designatipon is: "+empDesig);
        System.out.println("SSN is: "+SSN);
    }
    public static void main(String[] args) {
        S26_Employee Emp = new S26_Employee(1002,"NGO QUANG DAI");
        Emp.empDesig="manager";
        Emp.SSN="10-02-2003";
        Emp.dispay();
    }
}
