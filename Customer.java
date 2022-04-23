public class Customer {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    void changeCustomerAddress(String address){
        customerAddress=address;
    }
    void displayCustomerInformation(){
        System.out.println("CustomerID:"+customerID);
        System.out.println("CustomerName:"+customerName);
        System.out.println("CustomerAddress:"+customerAddress);
        System.out.println("CustomerAge:"+customerAge);
    };
}
