package bst;

public class CustomerBst {

 // Use BstDemo as a guide

    //Instances variable
    CustomerNode root;

    //Constructor
    public CustomerBst(){
        this.root=root;
    }
    //insert - insert a new value

    public void insert( Customer cust){
        if (root==null){
            //If the root is empty, this will be the first node
            root=new CustomerNode(cust);
        }else   {
            root.insert(cust);
        }
    }
    //contains- look for a value
    public boolean contains(Customer cust){
        if (root== null) {
            return false;
        }else {
            return root.contains(cust);
        }
    }
}
