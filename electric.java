class Customer {
    String customerId;
    String customerName;
    String address;
    int unitsConsumed;
    String billDate;
    String paymentDate;
    double billAmount;
    double gst;
    double totalAmount;
    public Customer(String customerId, String customerName, String address, int unitsConsumed, String billDate, String paymentDate) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.unitsConsumed = unitsConsumed;
        this.billDate = billDate;
        this.paymentDate = paymentDate;
        calculateBill();    }
    void calculateBill() {
        double rate = 0;
        if (unitsConsumed <= 199) rate = 0.98;
        else if (unitsConsumed <= 399) rate = 4.90;
        else if (unitsConsumed <= 599) rate = 6.56;
        else if (unitsConsumed <= 799) rate = 9.10;
        else rate = 11.40;
        billAmount = unitsConsumed * rate;
        gst = billAmount * 0.06;
        totalAmount = billAmount + gst;    }
    void displayFullBill() {
        System.out.println("*************** TATA POWER ***************");
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + address);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Date of Bill Generation: " + billDate);
        System.out.printf("Billable Price: Rs. %.2f\n", billAmount);
        System.out.printf("GST 0.06 %%: Rs. %.3f\n", gst);
        System.out.printf("Total Billable Price: Rs. %.0f\n", totalAmount);
        System.out.println("Date of Bill Payment: " + paymentDate);
        System.out.println("*******************************************");
    }
    void displayTableRow() {
        System.out.printf("%-12s %-12s %-20s %-15d %-15s\n", customerId, customerName, address, unitsConsumed, billDate);
    }}
public class electric {
    public static void main(String[] args) {
        Customer[] customers = new Customer[] {
            new Customer("TATAP_309", "Mr. Sagar", "UNIT2, Bhubaneswar", 187, "01-03-2023", "08-03-2023"),
            new Customer("TATAP_451", "Mr. Amrit", "UNIT3, Bhubaneswar", 93, "01-03-2023", "08-03-2023"),
            new Customer("TATAP_826", "Mr. Ahmed", "UNIT2, Bhubaneswar", 459, "01-03-2023", "08-03-2023"),
            new Customer("TATAP_195", "Mr. Joginder", "UNIT1, Bhubaneswar", 567, "01-03-2023", "08-03-2023"),
            new Customer("TATAP_761", "Mr. Murthy", "UNIT2, Bhubaneswar", 788, "01-03-2023", "08-03-2023"),
            new Customer("TATAP_913", "Mrs. Antony", "UNIT3, Bhubaneswar", 855, "01-03-2023", "08-03-2023"),
            new Customer("TATAP_009", "Mr. XYZ", "UNIT1, Bhubaneswar", 357, "01-03-2023", "08-03-2023")
        };
        customers[6].displayFullBill();
        System.out.println("\nCustomer ID  Customer     Address              Units Consumed  Bill Date");
        System.out.println("---------------------------------------------------------------------------");
        for (int i = 0; i < customers.length - 1; i++) {
            customers[i].displayTableRow();
        }   }}