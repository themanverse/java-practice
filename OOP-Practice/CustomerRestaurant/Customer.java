class Customer
{
    String customerName;
    int walletBalance;
    Customer(String c,int w)
    {
        customerName=c;
        walletBalance=w;
    }
    void display()
    {
        System.out.println("Name of the customer is : "+customerName);
        System.out.println("Balance : "+walletBalance);
    }
    void reduce(int amount)
    {
        walletBalance=(walletBalance-amount);
    }
}
