/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bst;

public class Main {

    public static void main(String[] args) {

        XmlReader myXmlReader = new XmlReader("customers.xml");

        CustomerBst customers = myXmlReader.getCustomers();

        // Uncomment when you are ready to test your program
//        Customer myCustomer = new Customer("Morgan", "Stephen", "345 Pine St.", "19144");
//        Account myAccount = new CommercialAccount("234-56-788", myCustomer, "PA-2345");
//        myCustomer.setAccount(myAccount);
//
//        // Check if it is in the tree
//        System.out.print("The customer ");
//        if (customers.contains(myCustomer)) {
//            System.out.println(" was found");
//        } else {
//            System.out.println(" was not found");
//        }
//    }
}
