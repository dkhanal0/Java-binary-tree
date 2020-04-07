package bst;

public class CustomerNode {

    // Use BstDemo as a guide

    //Instances variables
    Customer customer;
    CustomerNode left, right;

    //Constructor
    public CustomerNode(Customer customer){
        this.customer=customer;
        this.left=this.right=null;
    }
    //Insert: insert customer in appropriate subtree
    public void insert(Customer cust) {
        //Determine subtree location (left or right)
        if (cust.compareTo(customer) <= 0) {
            //belongs on the left side
            if (left == null) {
                //create a new left child
                left = new CustomerNode(cust);
            } else {
                left.insert(cust);
            }
        } else if (cust.compareTo(customer) >0 ){
            //belongs on the right
            if (right == null) {
                //create a new right child
                right = new CustomerNode(cust);
            } else {
                right.insert(cust);
            }

        }
    }

    //Contains: finds a value
    public boolean contains(Customer cust) {
        //check for value
        if (cust.compareTo(customer)==0) {
            return true;
        } else if (cust.compareTo(customer) < 0) {
            //could be in the left but don't have a left child
            if (left == null){
                return false;
        } else {
                return left.contains(cust);        }
    }else {
            //might be on the right
            if (right==null){
              return false;
            }else {
                return  right.contains(cust);
            }
        }

    }

}
