public class Customer1 {
    int customerID;
    String customerName;
    String customerAddress;
    int customerAge;
    public static void main(String[] args) {
        Customer1 objCustomer1 = new Customer1();
        objCustomer1.customerID=10022003;
        objCustomer1.customerName="NGO QUANG DAI";
        objCustomer1.customerAddress="Ha Noi - Viet Nam";
        objCustomer1.customerAge=20;
        System.out.println("CustomerID:"+objCustomer1.customerID);
        System.out.println("CustomerName:"+objCustomer1.customerName);
        System.out.println("CustomerAddress:"+objCustomer1.customerAddress);
        System.out.println("CustomerAge:"+objCustomer1.customerAge);
    }
}
