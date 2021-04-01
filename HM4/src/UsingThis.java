//task 6
public class UsingThis {
    public String companyName;
    public String companyAddress;
    public int numberOfEmployee;
    public double companyIncome;
    public double paidTaxes;

    //not using this
    public UsingThis(String name, String address) {
        companyName = name;
        companyAddress = address;
    }
    //using this
    public UsingThis(String name, String address, int numberOfEmployee, double companyIncome, double paidTaxes) {
        this(name, address);
        this.numberOfEmployee = numberOfEmployee;
        this.companyIncome = companyIncome;
        this.paidTaxes = paidTaxes;
    }

    public static void main(String[] args) {
    UsingThis myCompany = new UsingThis("Best company", "Kiev", 500, 2000000.00, 50000.0);
    System.out.println(myCompany.companyAddress);
    }
}
