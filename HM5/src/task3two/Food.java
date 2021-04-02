//task 3
package task3two;

//import task3one.Supermarket; //can't import Supermarket because it is not public

public class Food {
    public String name;
    int quantity;
    private double price;

    public Food () {
        //Supermarket supermarket = new Supermarket();//can't create object Supermarket because Supermarket is not public and is in another package
        //System.out.println(supermarket.name); //no access to member of Supermarket
        Bill bill = new Bill(); //can create Bill because Bill is in the same package
        System.out.println(bill.sum);
        System.out.println(bill.billNumber); //is access to package-private member of Bill
        //System.out.println(bill.seller); //no access to private member of Bill
    }
}
